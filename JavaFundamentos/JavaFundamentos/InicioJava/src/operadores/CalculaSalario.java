package operadores;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
    calculaSalario();
    }

    public static void  calculaSalario(){
        Scanner textReader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int horas = textReader.nextInt();
        int salario = (horas * 12);
        System.out.println("El salario por esa cantidad de horas trabajas es = " + salario);
    }
}
