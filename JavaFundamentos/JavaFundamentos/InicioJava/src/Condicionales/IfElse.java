package Condicionales;

public class IfElse {
    public static void main(String[] args) {
        String miFruta = "manzana";
        if ("manzana".equals(miFruta)) {
            System.out.println("iguales");
        } else {
            System.out.println("distintas");
        }

        int x = 30;
        if (x < 20) {
            System.out.println("X es menor que 20");
        } else {
            System.out.println("X es mayor que 20");
        }

        int y = 20
                ;

        if (y == 20) {
            System.out.println("y es igual a 20");
        } else if (y == 30) {
            System.out.println("y es igual a 30");
        } else {
            System.out.println("y no es igual ni a 20 ni 30");
        }
    }
}


