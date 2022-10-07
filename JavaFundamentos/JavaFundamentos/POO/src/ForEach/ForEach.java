package ForEach;

public class ForEach {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ricardo");
        Persona p2 = new Persona("Carlos");
        Persona p3 = new Persona("Joan");

        Persona people[] = {p1,p2,p3};

        for (Persona pers : people) {
            System.out.println(pers);
        }
        System.out.println(Persona.getContadorPersonas());

        int edades[] = {15,20,41,50};

        for (int edad: edades) {
            System.out.println("Edad: " + edad);
        }
    }
}
