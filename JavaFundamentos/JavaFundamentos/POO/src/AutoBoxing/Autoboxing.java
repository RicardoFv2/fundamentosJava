package AutoBoxing;

public class Autoboxing {
    private int i;
    public int j;
    int k;
    protected int l;

    public static void main(String[] args) {
    Integer enteroObj = 10;
    Float flotantObj = 15.2f;
    Double dobleObj = 40.1;

        System.out.println("Autoboxing");
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Flotante Obj: " + flotantObj.floatValue());
        System.out.println("Doble Obj: " + dobleObj.doubleValue());

        int entero = enteroObj;
        float flotante = flotantObj;
        double doble = dobleObj;

        System.out.println("\nUnboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Doble: " + doble);

    }
}
