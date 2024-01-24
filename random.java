import java.util.Random;

public class SprawdzParzystosc {

    public static void main(String[] args) {
        // Generowanie losowej liczby
        Random random = new Random();
        int losowaLiczba = random.nextInt(100) + 1;

        System.out.println("Wylosowana liczba: " + losowaLiczba);
        System.out.println("Ta liczba jest " + sprawdzParzystoscLiczby(losowaLiczba));
    }

    public static String sprawdzParzystoscLiczby(int liczba) {
        if (liczba % 2 == 0) {
            return "parzysta";
        } else {
            return "nieparzysta";
        }
    }
}
