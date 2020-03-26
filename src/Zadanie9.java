import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int a = input.nextInt();
            if (a != 0) {
                if (a > 0) {
                    System.out.println("Liczba jest oddatnia");
                } else System.out.println("Liczba jest ujemna");
            } else System.out.println("Liczba jest zerem");
    }
}
