package Arrays;

public class Prueba {
    public static void main(String[] args) {
        String nombres [] ={"Ricardo", "Juan", "Oscar"};

        for (int i = 0; i < nombres.length; i++){
            if (i == 0){
               nombres[i] = nombres[i].replace('R','l').toLowerCase();
            }
            System.out.println(nombres[i]);
        }
    }
}
