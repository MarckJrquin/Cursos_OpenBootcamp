public class Ejercicio_3_Tema_8 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(24);
        persona.setNombre("Marcos");
        persona.setTelefono("6543-2109");

        System.out.println("[ - Persona ---------------------------- ]");
        System.out.println("[ ] Edad: "+persona.getEdad());
        System.out.println("[ ] Nombre: "+persona.getNombre());
        System.out.println("[ ] Telefono: "+persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
