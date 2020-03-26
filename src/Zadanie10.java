import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println("Odgadnij liczbę");
            double a = (Math.random()*100);
            int a1 = (int) a;
            double b = in.nextInt();
            if (a1 == b) System.out.println("Zgadłeś");
            else System.out.println("Nie zgadłeś, losowa liczba to " + a1);

        }


    }
}
