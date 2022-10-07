package OOP;

public class Test {
    public static void main(String[] args) {
        Subject sub1 = new Subject("Matematicas");
        Subject sub2 = new Subject("Historia");
        Subject sub3 = new Subject("Lenguaje");

        sub1.addGrades();
        sub2.addGrades();
        sub3.addGrades();

        System.out.println("El promedio de " + sub1.getNameSubject() + " es " + sub1.calculateMedium());
        System.out.println("El promedio de " + sub2.getNameSubject() + " es " + sub2.calculateMedium());
        System.out.println("El promedio de " + sub3.getNameSubject() + " es " + sub3.calculateMedium());

        sub1.studentsMedium();
        sub2.studentsMedium();
        sub3.studentsMedium();
    }
}
