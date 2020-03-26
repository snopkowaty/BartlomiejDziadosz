import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę +");
        int x = in.nextInt(),counter=0;
        do {
            System.out.print("+");
            counter++;
        } while (counter != x);
    }
}
