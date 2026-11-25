public class Usuario {
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public boolean cambiarPassword(String passwordActual, String nuevaPassword) {
        if (this.password.equals(passwordActual) && nuevaPassword != null && !nuevaPassword.isEmpty()) {
            this.password = nuevaPassword;
            System.out.println("Contrasena cambiada correctamente.");
            return true;
        }
        System.out.println("No se pudo cambiar la contrasena.");
        return false;
    }

    public boolean validarCredenciales(String passwordIngresada) {
        return password.equals(passwordIngresada);
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Email: " + email);
    }
}