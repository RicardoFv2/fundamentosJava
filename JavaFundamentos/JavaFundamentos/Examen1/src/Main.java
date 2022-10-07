import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = new String[8];
        products[0] = "Ball";
        products[1] = "Toy";
        products[2] = "Computer";
        products[3] = "Car";
        products[4] = "Box";
        products[5] = "Mouse";
        products[6] = "Book";
        products[7] = "Notebook";
        for (String ar : products) {
            System.out.println(ar);
        }
        modifyElements(products,"Carro");
        removeElements(products);
        addElements(products,"PC");
    }
    public static void addElements(String products[], String nuevo) {
        Scanner textReader = new Scanner(System.in);
        System.out.println("Ingrese el numero del indice para agregar elemento");
        int n = textReader.nextInt();

        System.out.println("Ingrese el nombre del elemento a agregar");
        String newProduct = textReader.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (i == n) {
                products[i] = nuevo;
            }
            System.out.println(products[i]);
        }
    }
    public static void removeElements(String products[]) {
        Scanner textReader = new Scanner(System.in);
        System.out.println("Ingrese el indice del elemento a borrar 0 - 7");
        int rm = textReader.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (i == rm) {
                products[rm] = null;
            }
            System.out.println(products[i]);
        }
    }
    public static void modifyElements(String products[], String newProduct) {
        Scanner textReader = new Scanner(System.in);

        System.out.println("Ingrese el indice del elemento a modificar 0-7 ");
        int modifyIndex = textReader.nextInt();

//        System.out.println("Ingrese el nuevo producto");
//        String nuevoProducto = textReader.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (i == modifyIndex) {
                products[modifyIndex] = newProduct;
            }
            System.out.println(products[i]);
        }
    }
}
