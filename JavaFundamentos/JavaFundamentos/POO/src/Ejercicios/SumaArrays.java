package Ejercicios;

public class SumaArrays {
    public static void main(String[] args) {
        int array[] = {1,2,5,7};
        System.out.println(SumaArreglo(array));
    }
    public static int SumaArreglo(int ar[]){
        int sum = 0;
        for (int ars : ar) {
            sum += ars;
        }
        return sum;
    }




}
