public class Ejercicio_4_Tema_9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.edad = 24;
        cliente.nombre = "Marcos";
        cliente.telefono = "6543-2109";
        cliente.credito = 248.60;

        System.out.println("\n[ - Cliente ------------------------------- ]");
        System.out.println("[ ] Edad: "+cliente.edad);
        System.out.println("[ ] Nombre: "+cliente.nombre);
        System.out.println("[ ] Telefono: "+cliente.telefono);
        System.out.println("[ ] Credito: "+cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 42;
        trabajador.nombre = "Alexander";
        trabajador.telefono = "6420-8246";
        trabajador.salario = 824.60;

        System.out.println("\n[ - Trabajador ---------------------------- ]");
        System.out.println("[ ] Edad: "+trabajador.edad);
        System.out.println("[ ] Nombre: "+trabajador.nombre);
        System.out.println("[ ] Telefono: "+trabajador.telefono);
        System.out.println("[ ] Credito: "+trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}
