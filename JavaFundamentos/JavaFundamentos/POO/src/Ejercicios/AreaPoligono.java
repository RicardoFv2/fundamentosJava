package Ejercicios;

import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner textReader = new Scanner(System.in);
        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */

        calcularArea();
    }

    public static Scanner textReader = new Scanner(System.in);
    public static void calcularArea() {

        boolean istrue = true;

        while (istrue) {

            System.out.println("\nIngrese la opcion que desee 1-4");
            System.out.println("1 - Calcular area de un Cuadrado");
            System.out.println("2 - Calcular area de un triangulo");
            System.out.println("3 - Calcular area de un rectangulo");
            System.out.println("4 - Salir del programa");
            int opcion = textReader.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese la base del Cuadrado ");
                    int basecuadrado = textReader.nextInt();
                    System.out.println("Ingrese la altura del Cuadrado ");
                    int alturacuadrado = textReader.nextInt();
                    System.out.println(" El area del Cuadrado es " + basecuadrado * alturacuadrado);
                    break;

                case 2:
                    System.out.println("Ingrese la base del Triangulo ");
                    int basetriangulo = textReader.nextInt();
                    System.out.println("Ingrese la altura del Triangulo ");
                    int alturatriangulo = textReader.nextInt();
                    System.out.println("El area del Triangulo es " + (basetriangulo * alturatriangulo) / 2);
                    break;

                case 3:
                    System.out.println("Ingrese la base del Rectangulo ");
                    int baserectangulo = textReader.nextInt();
                    System.out.println("Ingrese la altura del Rectangulo ");
                    int alturarectangulo = textReader.nextInt();
                    System.out.println("El area del Rectangulo es " + baserectangulo * alturarectangulo);
                    break;

                case 4:
                    istrue = false;
                    break;

                default:
                    System.out.println("Numero no valido ingrese una opcion entre 1-4");
                    break;
            }
        }
    }
}
