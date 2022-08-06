import java.util.Scanner;

public class Ejercicio_1_Tema_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ - I Parte | Suma de numeros ------------------------- ]");
        int a, b, c;
        System.out.print("[ ] Ingrese el Primer Numero: "); a = sc.nextInt();
        System.out.print("[ ] Ingrese el Segundo Numero: "); b = sc.nextInt();
        System.out.print("[ ] Ingrese el Tercer Numero: "); c = sc.nextInt();
        System.out.println(" -  Resultado de la suma: "+suma(a,b,c));

        System.out.println("\n[ - II Parte | Cantidad de Puertas de Coche ----------- ]");
        Coche miCoche = new Coche();
        int cantPuertas = miCoche.anadirPuerta();
        System.out.println(" -  Cantidad de Puertas de mi coche: "+cantPuertas);
    }

    public static int suma(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }
}
