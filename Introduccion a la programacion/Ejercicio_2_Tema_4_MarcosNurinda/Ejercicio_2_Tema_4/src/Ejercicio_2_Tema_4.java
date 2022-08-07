public class Ejercicio_2_Tema_4 {
    public static void main(String[] args) {

        // if
        int numeroIf = -5;

        System.out.println("[ - if ------------------------------ ]");
        if(numeroIf > 0){
            System.out.println("  - El numero "+numeroIf+" es positivo");
        } else if (numeroIf < 0) {
            System.out.println("  - El numero "+numeroIf+" es negativo");
        }
        else {
            System.out.println("  - El numero es 0");
        }

        // While y Do While
        int numeroWhile = 0;

        System.out.println("\n[ - While --------------------------- ]");
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("  - El valor actual es: "+numeroWhile);
        }

        System.out.println("\n[ - Do While ------------------------ ]");
        do {
            numeroWhile++;
            System.out.println("  - El valor actual es: "+numeroWhile);
        }while (numeroWhile < 3);

        // for
        System.out.println("\n[ - For ----------------------------- ]");
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("  - El valor de numeroFor es: "+numeroFor);
        }

        //Switch Case
        System.out.println("\n[ - Switch -------------------------- ]");
        String estacion = "Otoño";
        switch (estacion){
            case "Verano":
                System.out.println("  - Es Verano");
                break;
            case "Invierno":
                System.out.println("  - Es Invierno");
                break;
            case "Otoño":
                System.out.println("  - Es Otoño");
                break;
            case "Primavera":
                System.out.println("  - Es Primavera");
                break;
            default:
                System.out.println("  - No es una Estacion");
        }
    }
}
