package dev.fredpena.designpattern.behavioral.mediator;

/**
 * @author me@fredpena.dev
 * @created 26/09/2025  - 11:37
 */
public class Demo {
    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        // Flujo 1: Login fallido, luego exitoso
        System.out.println("=== LOGIN ===");
        dialog.getLoginOrRegisterChkBx().setChecked(true); // Login view
        dialog.getLoginUsername().setText("ana");
        dialog.getLoginPassword().setText("wrong");
        dialog.getOkBtn().click(); // error
        dialog.getLoginPassword().setText("secret");
        dialog.getOkBtn().click(); // ok

        // Flujo 2: Registro
        System.out.println("=== REGISTER ===");
        dialog.getLoginOrRegisterChkBx().setChecked(false); // Register view
        dialog.getRegistrationUsername().setText("nuevo");
        dialog.getRegistrationPassword().setText("1234");
        dialog.getRegistrationEmail().setText("nuevo@example.com");
        dialog.getOkBtn().click(); // ok + (opcional) volver a login

        // Cancel
        dialog.getCancelBtn().click();
    }
}
