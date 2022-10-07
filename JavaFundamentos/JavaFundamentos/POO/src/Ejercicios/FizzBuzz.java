package Ejercicios;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            boolean DivisibleBy3 = i % 3 == 0;
            boolean Divisinleby5 = i % 5 == 0;
            if (DivisibleBy3 && Divisinleby5 ) {
                System.out.println("FizzBuzz");
            } else if (Divisinleby5) {
                System.out.println("Buzz");
            } else if (DivisibleBy3) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

