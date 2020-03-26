import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj początek przedzialu: ");
        int downRange = in.nextInt();
        System.out.println("Podaj koniec przedziału: ");
        int upperRange = in.nextInt();

        for (;;downRange++) {
            System.out.println(" "+downRange);
            if (downRange == upperRange ) break;
        }

    }
}
