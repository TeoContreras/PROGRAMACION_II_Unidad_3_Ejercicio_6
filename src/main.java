public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("juan123", "juan@mail.com", "clave123");
        usuario.mostrarUsuario();
        usuario.cambiarPassword("incorrecta", "nueva456");
        usuario.cambiarPassword("clave123", "nueva456");
        System.out.println("Inicio de sesion: " + usuario.validarCredenciales("nueva456"));
        System.out.println("Inicio de sesion: " + usuario.validarCredenciales("clave123"));
    }
}