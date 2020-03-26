import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (;;) {
            System.out.println("Podaj liczbę: ");
            int x = in.nextInt();
            if (x == 0) {
                System.out.println("Podano 0");
                break;
            }
        }




    }
}
