public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento; // Nuevo atributo
    char genero;           // Nuevo atributo ('H' o 'M')

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Perú", 'M');
        p1.imprimir();
        p2.imprimir();
    }
}
