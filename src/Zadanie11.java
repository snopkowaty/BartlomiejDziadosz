import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj temperature ciała");
        double a = in.nextDouble();
        if (a != 36.6) {
            if (a>36.6) System.out.println("Gorączka");
            else System.out.println("Osłabienie");
        } else System.out.println("Ok");
    }
}
