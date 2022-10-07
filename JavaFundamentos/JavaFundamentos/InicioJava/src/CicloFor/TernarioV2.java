package CicloFor;

import java.util.Scanner;

public class TernarioV2 {
    public static void main(String[] args) {

        Scanner textReader = new Scanner(System.in);

        System.out.println("Ingrese 4 numeros");
        int number1 = textReader.nextInt();
        int number2 = textReader.nextInt();
        int number3 = textReader.nextInt();
        int number4 = textReader.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        max = (max > number3) ? max : number3;
        max = (max > number4) ? max : number4;

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Number 4 = " + number4);
        System.out.println("El numero mayor es: " + max);
    }
}
