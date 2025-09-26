package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:37
 */
public class AuthenticationDialog implements Mediator {
    private String title = "Log in / Register";
    private final Checkbox loginOrRegisterChkBx;

    // Login fields
    private final Textbox loginUsername;
    private final Textbox loginPassword;

    // Registration fields
    private final Textbox registrationUsername;
    private final Textbox registrationPassword;
    private final Textbox registrationEmail;

    private final Button okBtn;
    private final Button cancelBtn;

    // Estado de visibilidad (simulado con flags para la demo)
    private boolean loginVisible = true;
    private boolean registerVisible = false;

    public AuthenticationDialog() {
        // crear componentes y vincular al mediador (this)
        loginOrRegisterChkBx = new Checkbox(this, "Login?");
        loginUsername = new Textbox(this, "login-username");
        loginPassword = new Textbox(this, "login-password");

        registrationUsername = new Textbox(this, "reg-username");
        registrationPassword = new Textbox(this, "reg-password");
        registrationEmail = new Textbox(this, "reg-email");

        okBtn = new Button(this, "OK");
        cancelBtn = new Button(this, "Cancel");

        showLoginForm(); // vista por defecto
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && "check".equals(event)) {
            if (loginOrRegisterChkBx.isChecked()) {
                showLoginForm();
            } else {
                showRegisterForm();
            }
            return;
        }

        if (sender == okBtn && "click".equals(event)) {
            if (loginVisible) {
                boolean found = tryLogin(
                        loginUsername.getText(),
                        loginPassword.getText()
                );
                if (!found) {
                    System.out.println("[ERROR] Invalid credentials");
                } else {
                    System.out.println("[OK] Logged in as " + loginUsername.getText());
                }
            } else if (registerVisible) {
                boolean ok = tryRegister(
                        registrationUsername.getText(),
                        registrationPassword.getText(),
                        registrationEmail.getText()
                );
                if (ok) {
                    System.out.println("[OK] Registered and logged in: " + registrationUsername.getText());
                    showLoginForm(); // opcional: volver a login
                } else {
                    System.out.println("[ERROR] Registration failed");
                }
            }
            return;
        }

        if (sender == cancelBtn && "click".equals(event)) {
            System.out.println("[CANCEL] Closing dialog");
            // cerrar ventana (simulado)
            return;
        }

        // Otros eventos (keypress/change) podrían activar validaciones dinámicas:
        if (sender instanceof Textbox && "change".equals(event)) {
            validateFields();
        }
    }

    private void showLoginForm() {
        title = "Log in";
        loginVisible = true;
        registerVisible = false;
        System.out.println("[UI] " + title + " | show: login-fields, hide: register-fields");
    }

    private void showRegisterForm() {
        title = "Register";
        loginVisible = false;
        registerVisible = true;
        System.out.println("[UI] " + title + " | show: register-fields, hide: login-fields");
    }

    private boolean tryLogin(String user, String pass) {
        // Demo: credenciales simples
        return user != null && !user.isBlank() && "secret".equals(pass);
    }

    private boolean tryRegister(String user, String pass, String email) {
        // Demo: validación mínima
        return user != null && !user.isBlank()
               && pass != null && pass.length() >= 4
               && email != null && email.contains("@");
    }

    private void validateFields() {
        if (registerVisible) {
            boolean ok = !registrationUsername.getText().isBlank()
                         && registrationPassword.getText().length() >= 4
                         && registrationEmail.getText().contains("@");
            System.out.println("[Validate/Register] fields ok? " + ok);
        } else if (loginVisible) {
            boolean ok = !loginUsername.getText().isBlank()
                         && !loginPassword.getText().isBlank();
            System.out.println("[Validate/Login] fields ok? " + ok);
        }
    }

    // Getters para pruebas (opcional)
    public Checkbox getLoginOrRegisterChkBx() {
        return loginOrRegisterChkBx;
    }

    public Textbox getLoginUsername() {
        return loginUsername;
    }

    public Textbox getLoginPassword() {
        return loginPassword;
    }

    public Textbox getRegistrationUsername() {
        return registrationUsername;
    }

    public Textbox getRegistrationPassword() {
        return registrationPassword;
    }

    public Textbox getRegistrationEmail() {
        return registrationEmail;
    }

    public Button getOkBtn() {
        return okBtn;
    }

    public Button getCancelBtn() {
        return cancelBtn;
    }
}
