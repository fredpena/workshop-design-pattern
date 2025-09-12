# 🚀 Piensa en Patrones: Diseñando Software como un Arquitecto 🚀

¡Bienvenido al taller **Piensa en Patrones: Diseñando Software como un Arquitecto**! Esta guía es tu punto de partida y
encontrarás toda la teoría, ejemplos y buenas prácticas que veremos durante la sesión.

> **[⬇️ Descargar la presentación completa en PDF aquí](presentation.pdf)**

## Objetivo General

Que los participantes comprendan los fundamentos de los patrones de
diseño y sean capaces de implementarlos en proyectos reales, utilizando
UML como lenguaje de comunicación y ejemplos prácticos en código.
---

## Descargo de responsabilidad

* La información proporcionada en esta presentación tiene como objetivo educativo y se basa en experiencia personal y
  conocimientos actuales. Si bien se ha hecho todo lo posible para garantizar la precisión y la actualidad de la
  información presentada, no se puedo garantizar su exactitud completa.

* El uso de las tecnologías mencionadas, está sujeto a los términos y condiciones de cada herramienta. Es
  responsabilidad del usuario realizar su propia investigación y cumplir con las directrices y políticas de cada
  tecnología antes de implementarlas en su entorno de producción.

* Además, cabe señalar que las mejores prácticas y las soluciones presentadas en esta presentación pueden variar según
  los requisitos y las circunstancias específicas de cada proyecto. Recomiendo encarecidamente realizar pruebas
  exhaustivas y consultar con profesionales capacitados antes de implementar cualquier solución en un entorno de
  producción.

* En resumen, mientras que esta presentación busca proporcionar información útil y práctica, el uso de las tecnologías y
  las decisiones de implementación son responsabilidad del usuario final. No se asume ninguna responsabilidad por los
  resultados derivados de la aplicación de los conceptos discutidos en esta presentación.

------------------------------------------------------------------------

## Día 1 -- Introducción a UML + Patrones Creacionales

**Duración:** 2:30 horas

### Objetivos específicos

- Comprender los elementos básicos de UML para diagramar clases.
- Conocer los principales patrones creacionales y sus aplicaciones.

### Agenda

- **Bloque 1 (30 min):** Introducción a UML aplicado a patrones.
    - Diagrama de clases: clases, interfaces, asociaciones, herencia,
      agregación, composición.
    - Símbolos y notaciones de líneas.
    - Ejemplo: sistema de biblioteca en UML.
- **Bloque 2 (40 min):** Patrones Creacionales - teoría.
    - Singleton, Factory Method, Abstract Factory, Builder y
      Prototype.
    - Ventajas, desventajas y casos de uso.
- **Bloque 3 (60 min):** Ejercicio práctico en código.
    - Implementar un sistema de notificaciones (Email, SMS, Push)
      usando Factory Method.
- **Bloque 4 (20 min):** Discusión y cierre.
    - Comparar implementaciones.
    - Preguntas clave: ¿cuándo usar y cuándo no usar un patrón?

------------------------------------------------------------------------

## Día 2 -- Patrones Estructurales

**Duración:** 2:30 horas

### Objetivos específicos

- Comprender cómo los patrones estructurales ayudan a organizar y
  extender sistemas.
- Aplicar Adapter, Composite y Decorator en ejemplos reales.

### Agenda

- **Bloque 1 (20 min):** Breve repaso UML (herencia, interfaces,
  multiplicidad).
- **Bloque 2 (40 min):** Patrones Estructurales - teoría.
    - Adapter, Bridge, Composite, Decorator, Facade, Flyweight y
      Proxy.
    - Ventajas, desventajas y casos de uso.
- **Bloque 3 (70 min):** Ejercicio práctico.
    - Refactorizar una librería externa de reportes con Adapter.
    - Implementar un sistema de componentes gráficos con Composite.
- **Bloque 4 (20 min):** Reflexión y debate: ¿qué pasa si no aplicamos
  estos patrones?

------------------------------------------------------------------------

## Día 3 -- Patrones de Comportamiento

**Duración:** 2:30 horas

### Objetivos específicos

- Comprender cómo los patrones de comportamiento manejan la
  comunicación entre objetos.
- Implementar Strategy, Observer y Command en un proyecto práctico.

### Agenda

- **Bloque 1 (20 min):** Introducción a patrones de comportamiento.
- **Bloque 2 (40 min):** Patrones Comportamiento - teoría.
    - Chain of Responsibility, Command, Iterator, Mediator, Memento,
      Observer, State, Strategy, Template Method y Visitor.
    - Ventajas, desventajas y casos de uso.
- **Bloque 3 (70 min):** Proyecto integrador.
    - Minijuego de turnos:
        - Acciones con Command.
        - Estrategias de ataque con Strategy.
        - Eventos de cambio de estado con Observer.
- **Bloque 4 (20 min):** Actividad final y conclusiones.
    - Discusión de anti-patrones (God Object, Spaghetti Code).
    - Retroalimentación grupal.

------------------------------------------------------------------------

## Metodología General

- Explicación corta (30%) para introducir conceptos.
- Ejemplos guiados (30%) en código y UML.
- Ejercicios colaborativos (40%) donde los participantes discuten y
  programan.

------------------------------------------------------------------------

## Resultados esperados

Al finalizar los 3 días, los participantes podrán:

1. Leer y crear diagramas UML básicos para representar patrones.
2. Implementar patrones creacionales, estructurales y de comportamiento
   en Java (u otro lenguaje OOP).
3. Refactorizar código real aplicando patrones para mejorar
   mantenibilidad y escalabilidad.

------------------------------------------------------------------------

## Estructura del Proyecto

Para que puedas navegar fácilmente por el código fuente y los diagramas, el proyecto está organizado de la siguiente
manera dentro de `src/main/java/`:

```
dev
└── fredpena
    ├── uml/
    │   └── (Ejemplos de conceptos UML como Asociación, Agregación, etc.)
    │
    └── designpattern/
        ├── creational/
        │   ├── exercise/
        │   │   ├── umls
        │   │   └── README.md
        │   ├── (Carpetas para cada patrón: Singleton, Factory, etc.)
        │   │ 
        │   └── uml/
        │
        ├── structural/
        │   └── (misma estructura que creational)
        │
        └── behavioral/
            └── (misma estructura que creational)
```

- **dev.fredpena.uml**: Aquí encontrarás ejemplos básicos de los conceptos de UML (Asociación, Agregación, etc.), tanto
  en diagramas como en código Java simple para ilustrar la teoría.

- **dev.fredpena.designpattern**: Este paquete contiene la implementación de todos los patrones de diseño, agrupados por
  su categoría (creational, structural, behavioral).

    - Dentro de cada categoría, encontrarás una carpeta para cada patrón específico (ej. *factorymethod*, *adapter*,
      etc.).
    - **uml/**: Contiene los diagramas de clase UML que representan la estructura teórica de los patrones de esa
      categoría.
    - **exercise/**: Incluye un `README.md` con el enunciado del ejercicio práctico para esa categoría, junto a los
      diagramas UML necesarios para resolverlo.

------------------------------------------------------------------------

# Ejercicios Prácticos del Mini Taller de Patrones de Diseño

## Día 1 -- UML + Patrones Creacionales

### Ejercicio UML

**Mandato:**
Dibuja un diagrama de clases UML para un sistema de biblioteca que
gestione:

- **Libro** (título, ISBN, año)
- **Autor** (nombre, nacionalidad)
- **Editorial** (nombre, dirección)

Cada libro puede tener varios autores, pero pertenece a una sola
editorial.
Indica las asociaciones, multiplicidades y tipos de relación
(composición, agregación, herencia si aplica).

------------------------------------------------------------------------

### Ejercicio Factory Method

**Mandato:**
Implementa un sistema de notificaciones que soporte:

- Email
- SMS
- Push notification

**Requisitos:**

- Define una interfaz `Notification` con el método
  `send(String message)`.
- Crea implementaciones concretas para cada tipo de notificación.
- Implementa un Factory Method que, según un parámetro, devuelva el tipo
  de notificación adecuado.
- Escribe un programa cliente que pruebe los tres tipos.

------------------------------------------------------------------------

## Día 2 -- Patrones Estructurales

### Ejercicio Adapter

**Mandato:**
Se te entrega una librería externa que genera reportes en formato
**JSON**, pero tu sistema solo acepta **XML**.

- Diseña un Adapter que convierta la salida de JSON a XML.
- Representa la solución en UML (clases de la librería, adapter,
  cliente).
- Implementa el código en Java para probar la conversión.

------------------------------------------------------------------------

### Ejercicio Composite

**Mandato:**
Modela un sistema de componentes gráficos para una interfaz:

- Componentes básicos: **Botón, Texto, Imagen**.
- Contenedores que pueden agrupar componentes (ej. Panel).

**Requisitos:**

- Aplica el patrón Composite para que el cliente pueda tratar
  componentes y contenedores de la misma manera.
- Implementa el método `render()` que imprima la estructura de la
  interfaz.
- Crea un ejemplo donde un Panel contenga botones y textos, y otro panel
  anidado.

------------------------------------------------------------------------

## Día 3 -- Patrones de Comportamiento

### Ejercicio Strategy

**Mandato:**
Diseña un sistema de estrategias de ataque para un personaje de un
juego.

- Estrategias: ataque físico, ataque mágico, ataque a distancia.
- Cada estrategia debe implementar un método `execute()`.
- El personaje debe poder cambiar de estrategia en tiempo de ejecución.

------------------------------------------------------------------------

### Ejercicio Observer

**Mandato:**
Implementa un sistema de notificación de cambios de estado para un
juego:

- El personaje tiene una barra de vida (Health).
- Cuando la vida cambia, deben notificarse automáticamente:
- La interfaz gráfica (para actualizar la barra).
- El sistema de log (para registrar eventos).

Aplica el patrón **Observer** para este comportamiento.

------------------------------------------------------------------------

### Ejercicio Command (Proyecto integrador)

**Mandato:**
Construye un mini juego de turnos con las siguientes características:

- Define una interfaz `Command` con el método `execute()`.
- Crea comandos concretos: atacar, defender, curar.
- El jugador puede encolar comandos y ejecutarlos secuencialmente.
- Integra con **Strategy** para definir cómo se ejecuta cada ataque.
- Integra con **Observer** para notificar cuando cambia el estado de
  vida.

------------------------------------------------------------------------

## Libros y Recursos Recomendados

Para aquellos que deseen profundizar aún más en los patrones de diseño, la arquitectura de software y las buenas
prácticas de programación, aquí hay una lista de libros altamente recomendados:

- **Design Patterns: Elements of Reusable Object-Oriented Software** (Erich Gamma, Richard Helm, Ralph Johnson, John
  Vlissides - "The Gang of Four"): El libro fundamental que introdujo el concepto de patrones de diseño.

- **Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software** (Eric Freeman, Elisabeth
  Robson): Una excelente introducción visual y fácil de entender a los patrones de diseño, ideal para empezar.

- **Clean Architecture: A Craftsman's Guide to Software Structure and Design** (Robert C. Martin): Explora los
  principios para construir arquitecturas de software robustas, escalables y mantenibles. **Es una lectura esencial para
  entender en profundidad los principios SOLID.**

- **Clean Code: A Handbook of Agile Software Craftsmanship** (Robert C. Martin): Una guía práctica e indispensable para
  escribir código limpio y de alta calidad en el día a día.

- **Refactoring: Improving the Design of Existing Code** (Martin Fowler): Enseña técnicas para mejorar el diseño del
  código existente de manera segura, un complemento perfecto para la aplicación de patrones.

- **Patterns of Enterprise Application Architecture** (Martin Fowler): Se enfoca en soluciones y patrones de más alto
  nivel para el desarrollo de aplicaciones empresariales complejas.

------------------------------------------------------------------------

**_¡Gracias por participar en el taller! Esperamos que te sea de gran utilidad._**

