package Arrays;

public class SentenciaForArray {
    public static void main(String[] args) {
        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = names.length;
        for (int i = 0; i < count; i++){
            if (names[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    names[i].toLowerCase().contains("PePa".toLowerCase())){
                continue;
            }
            System.out.println(i + ".- " + names[i]);
        }
    }
}
