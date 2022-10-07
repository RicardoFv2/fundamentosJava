package CicloFor;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int contador = 0;
//        int limite = 10;
//        while (contador < limite){
//            System.out.println("Contador = " + contador);
//            contador++;
//        }
//
//        Scanner textReader = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de numeros a iterar");
//        int maxNumbers = textReader.nextInt();
//        int i = 1;
//        while (i <= maxNumbers){
//            System.out.println("Contador = " + i);
//            i++;
//        }
        int i = 0;

        boolean prueba = true;

        while(prueba){

            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
