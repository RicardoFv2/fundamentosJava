package bloquesCodigo;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        int id1 = p1.getIdPersona();
        int id2 = p2.getIdPersona();

        System.out.println("id persona 1: " + id1 + "\n");
        System.out.println("id persona 2: " + id2 + "\n");

        System.out.println(Persona.getContadorPersonas());
    }
}
