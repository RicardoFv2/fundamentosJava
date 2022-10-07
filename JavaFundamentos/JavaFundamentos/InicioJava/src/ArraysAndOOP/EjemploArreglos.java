package ArraysAndOOP;

public class EjemploArreglos {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Ricardo");
        people[1] = new Person("Carlos");
        people[2] = new Person("Oscar");


        Person[] people1 = {new Person("Jacinto"), new Person("Alvarito"), new Person("Osmin")};

//        for (Person ars : people){
//            System.out.println("\n" + ars);
//        }
//        for (Person ar : people1){
//            System.out.println("\n" + ar);
//        }
//        for (int i = 0; i < people.length; i++) {
//            if (i == 2) {
//                people[i] = new Person(people[i].getNombre().toLowerCase().replaceFirst("a","M"));
            for (int i = 0; i < people.length; i++){
                if (people[i].getNombre().toLowerCase().startsWith("o")){
                    people[i] = new Person(people[i].getNombre().replaceFirst("car","cur"));
            }
            System.out.println(people[i]);
        }
    }
}
