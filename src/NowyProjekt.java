import java.util.Scanner;

public class NowyProjekt {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a,b;
        double wynik;
        long wynikNext;
        System.out.println("Twoja pierwsza liczba : ");
        a = x.nextInt();
        System.out.println("Twoja druga liczba : ");
        b = x.nextInt();
        System.out.println("Twoje liczby to " + a + " oraz " +b);


            System.out.println("Wybierz numer działania");
            System.out.println("1.Dodawanie [+]");
            System.out.println("2.Odejmowanie [-]");
            System.out.println("3.Mnożenie [*]");
            System.out.println("4.Dzielenie [/]");
            System.out.println("5.Potęgowanie [^]");
            System.out.println("6.Wartość bezwzględna [m]");
            System.out.println("7.Silnia z liczby [!]");

            Scanner sc = new Scanner(System.in);
            System.out.println("Wybierz numer działania ");
            int i = sc.nextInt();
            System.out.println(i);









    }
}
