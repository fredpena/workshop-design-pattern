# Día 2 — Patrones Estructurales

En este día trabajaremos con dos patrones fundamentales: **Adapter** y **Composite**. Ambos nos permiten estructurar el
código para hacerlo más flexible, reutilizable y mantenible.

---

## 🧩 Ejercicio 1: Adapter

### Mandato

Se te entrega una librería externa que genera reportes en **JSON**, pero tu sistema solo acepta **XML**.  
Diseña un **Adapter** que convierta la salida de JSON a XML.

### 🎯 Objetivos

- Encapsular la librería externa sin modificarla.
- Mantener al cliente desacoplado del formato real.
- Convertir JSON → XML de forma transparente.

### 📐 UML

![Adapter UML](adapter.png)

> `ReportExporter` es la interfaz objetivo.  
> `ThirdPartyJsonReport` es la librería externa.  
> `JsonToXmlAdapter` convierte la salida al formato esperado.  
> El cliente usa únicamente `ReportExporter`.

## 🧩 Implementación en Java (esqueleto mínimo)

```java
// Target
public interface ReportExporter {
    String exportReport(Object data); // debe devolver XML
}

// Librería externa (no se puede tocar)
public class ThirdPartyJsonReport {
    public String toJson(Object data) {
        return "{\"report\": \"" + data.toString() + "\"}";
    }
}

// Adapter: de JSON (lib externa) a XML (objetivo del sistema)
public class JsonToXmlAdapter implements ReportExporter {
    private final ThirdPartyJsonReport thirdParty;

    public JsonToXmlAdapter(ThirdPartyJsonReport thirdParty) {
        this.thirdParty = thirdParty;
    }

    @Override
    public String exportReport(Object data) {
        String json = thirdParty.toJson(data);
        // Conversión muy simple para efectos didácticos
        // json: {"report":"..."} -> xml: <report>...</report>
        String content = json.replace("{\"report\":", "")
                .replace("{\"report\": \"", "")
                .replace("\"}", "")
                .replace("}", "")
                .replace("\"", "")
                .trim();
        return "<report>" + content + "</report>";
    }
}

// Cliente
public class AdapterDemo {
    public static void main(String[] args) {
        ReportExporter exporter = new JsonToXmlAdapter(new ThirdPartyJsonReport());
        String xml = exporter.exportReport("Ventas Q2 = 150K");
        System.out.println(xml); // <report>Ventas Q2 = 150K</report>
    }
}

```

#### ✅ Checklist de aceptación

- [x] El cliente solo conoce `ReportExporter`.
- [x] `ThirdPartyJsonReport` se usa sin modificaciones.
- [x] `JsonToXmlAdapter` traduce resultado a XML.
- [x] El UML muestra **Target–Adapter–Adaptee** y **Client**.

#### 🧪 Pruebas rápidas

- Cambia el `data` a un objeto complejo (e.g., `Map`) y verifica que el flujo no se rompe.
- Simula otra fuente JSON (otro “Adaptee”) y crea **otro adapter** sin tocar el cliente.

#### ⚡ Extensiones

- Implementar `XmlToCsvAdapter` (encadenar adaptadores o cambiar Target a “salida polimórfica”).
- Usar una lib real (Jackson/Gson) y un serializer XML (JAXB) para una conversión “de verdad”.

#### 🚫 Errores comunes

- Hacer que el cliente conozca `ThirdPartyJsonReport`.
- “Tocar” la librería externa.
- Mezclar conversión con lógica de negocio (mantener el adapter fino y dedicado).

---

## 🧩 Ejercicio 2: Composite

### Mandato

Modela un sistema de componentes gráficos para una interfaz:

- **Hojas**: `Button`, `Text`, `Image`.
- **Contenedor**: `Panel`, que puede agrupar otros componentes (incluyendo paneles anidados).

### 🎯 Objetivos

- Tratar componentes y contenedores de la misma forma.
- Renderizar una estructura de UI en árbol con un único método `render()`.

### 📐 UML

![Composite UML](composite.png)

> `UIComponent` es la interfaz común.  
> `Button`, `Text`, `Image` son hojas.  
> `Panel` es un compuesto que contiene una lista de `UIComponent`.  
> El cliente puede manipular cualquier componente sin distinguir hoja/compuesto.

## 🧩 Implementación en Java (esqueleto mínimo)

```java
import java.util.ArrayList;
import java.util.List;

public interface UIComponent {
    void render(String indent);
}

// Hojas
public class Button implements UIComponent {
    private final String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Button[label=\"" + label + "\"]");
    }
}

public class Text implements UIComponent {
    private final String value;

    public Text(String value) {
        this.value = value;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Text[value=\"" + value + "\"]");
    }
}

public class Image implements UIComponent {
    private final String src;

    public Image(String src) {
        this.src = src;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Image[src=\"" + src + "\"]");
    }
}

// Compuesto
public class Panel implements UIComponent {
    private final String name;
    private final List<UIComponent> children = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public Panel add(UIComponent c) {
        children.add(c);
        return this;
    }

    public Panel remove(UIComponent c) {
        children.remove(c);
        return this;
    }

    @Override
    public void render(String indent) {
        System.out.println(indent + "Panel[name=\"" + name + "\"] {");
        String childIndent = indent + "  ";
        for (UIComponent c : children) {
            c.render(childIndent);
        }
        System.out.println(indent + "}");
    }
}

// Cliente
public class CompositeDemo {
    public static void main(String[] args) {
        Panel root = new Panel("Root")
                .add(new Text("Bienvenido"))
                .add(new Button("Aceptar"))
                .add(
                        new Panel("Sidebar")
                                .add(new Button("Home"))
                                .add(new Button("Settings"))
                )
                .add(new Image("/assets/logo.png"));

        root.render("");
    }
}

```

### 🧪 Salida esperada (aprox.):

```bash
$ java CompositeDemo
Panel[name="Root"] {
  Text[value="Bienvenido"]
  Button[label="Aceptar"]
  Panel[name="Sidebar"] {
    Button[label="Home"]
    Button[label="Settings"]
  }
  Image[src="/assets/logo.png"]
}
```

---

#### ✅ Checklist de aceptación

- [x] `UIComponent` define el **contrato único**.
- [x] `Panel` **contiene** `List<UIComponent>` y delega `render()` a sus hijos.
- [x] Cliente manipula **UIComponent** sin distinguir hoja/compuesto.
- [x] Estructura anidada (panel dentro de panel) funciona.

#### 🧪 Pruebas rápidas

- Anidar 3 niveles de `Panel`.
- Remover un hijo y volver a renderizar.
- Agregar un nuevo leaf (ej. `Icon`) sin tocar el cliente (OCP).

#### ⚡ Extensiones

- Añadir soporte a `renderHTML()` o `toJson()` para mostrar el poder del Composite en múltiples salidas.
- Agregar `findById(String)` en `Panel` para consultas sobre el árbol.

#### 🚫 Errores comunes

- Hacer que el cliente **type-castee** para diferenciar hojas/compuestos (rompe el patrón).
- Duplicar lógica de recorrido en el cliente (el composite debe **encapsular** el recorrido).

---

