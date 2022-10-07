package operadores;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nOperador modulo residuo:");
        System.out.println("x mod 10 = " + a % 2);

        System.out.println("\nOperador Compuesto");
        a += 2;
        b -= 4;
        c *= a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nOperador Incremento:");

        a++;
        System.out.println("a = " + a);

        c = ++a;

        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("\nOperador relacional:");

        boolean res = a < b;
        System.out.println("res = " + res);

        System.out.println("\nOperador Ternario:");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        System.out.println("\nOperador de asignacion");
        int i, j, k;

        i = j = k = 100;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        int x = (((25 - 5) * 4) / (2 - 10)) + 4;
        System.out.println(x);

        System.out.println(1 + 2 - (3 * (4 / 5)));

        System.out.println(calculaIva(12));
    }

    public static double calculaIva(double precio) {
        System.out.print("El precio del producto con IVA incluido es = ");
        return precio * 0.13 + precio;
    }
}
