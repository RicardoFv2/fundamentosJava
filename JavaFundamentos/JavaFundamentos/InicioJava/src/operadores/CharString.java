package operadores;

import java.util.Scanner;

public class CharString {
    public static void main(String[] args) {

        Scanner textReader = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numb1 = textReader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numb2 = textReader.nextInt();
        int suma = numb1 + numb2;
        System.out.println("Resultado es = " + suma );



    }
}
