package CicloFor;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

//        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
//        System.out.println("Variable = " + variable);

        Scanner textReader = new Scanner(System.in);

        String estado = "";
        double promedio = 0.0;

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0");
        double matematicas = textReader.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        double ciencias = textReader.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        double historia = textReader.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;


        estado = (promedio > 6) ? "Aprobado" : "Reprobado";
        System.out.println("El promedio de las 3 materias es = " + promedio);
        System.out.println("El estudiante esta : " + estado);
    }
}
