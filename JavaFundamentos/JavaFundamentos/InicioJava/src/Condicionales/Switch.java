package Condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner textReader = new Scanner(System.in);
        System.out.println("Ingrese el mes del 1-12");
        int mes = textReader.nextInt();
        String estacion = null;

//        switch (mes) {
//            case 1:
//            case 2:
//            case 12:
//                estacion = "Invierno";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                estacion = "Primavera";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                estacion = "Verano";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                estacion = "Otoño";
//                break;
//            default:
//                System.out.println("Mes incorrecto");
//                break;
//        }
//        System.out.println("La estación para el mes " + mes + " es " + estacion);

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            System.out.println("Mes no valido, ingrese un mes del 1 al 12");
        }
        System.out.println("La estacion para el mes " + mes + " es " + estacion);
    }
}
