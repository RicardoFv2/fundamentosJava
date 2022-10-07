package CicloFor;

public class For {
    public static void main(String[] args) {
//        int limite = 10;
//        for (int contador = 0; contador < limite; contador++) {
//            System.out.println("Contador = " + contador);
//        }
//        for (int i = 1, j = 10, k = 25; i < j ; i++, j--, k--) {
//            System.out.println(i + " - " + j);
//        }

        for (int i = 0; i <= 10; i++){
            if (!(i % 2 == 0)){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
