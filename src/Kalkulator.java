import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a,b,c,a1,b1;
        int count = 1, count2 = 1;
        double wynik;
        double wynikNext;


            for (;;) {
                count = 1;
                count2 = 1;

                System.out.println("Twoja pierwsza liczba : ");
                a = x.nextInt();
                System.out.println("Twoja druga liczba : ");
                b = x.nextInt();
                System.out.println();
                System.out.println("Twoje liczby to " + a + " oraz " + b +'\n');
                System.out.println("--Wybrane operacje matematyczne--");
                System.out.println("1.Dodawanie [+]");
                System.out.println("2.Odejmowanie [-]");
                System.out.println("3.Mnożenie [*]");
                System.out.println("4.Dzielenie [/]");
                System.out.println("5.Potęgowanie [^]");
                System.out.println("6.Wartość bezwzględna [m]");
                System.out.println("7.Silnia z liczby [!]");
                System.out.println();
                System.out.println("Wybierz numer działania ");
                c = x.nextInt();
                switch (c) {
                    case 1:
                        wynik = a + b;
                        System.out.println("Wybrałeś Dodawanie [+] a twój wynik to " + wynik);
                        break;
                    case 2:
                        wynik = a - b;
                        System.out.println("Wybrałeś Odejmowanie [-] a twój wynik to " + wynik);
                        break;
                    case 3:
                        wynik = a * b;
                        System.out.println("Wybrałeś Mnożenie [*] a twój wynik to " + wynik);
                        break;
                    case 4:
                        wynik = a / b;
                        System.out.println("Wybrałeś Dzielenie [/] a twój wynik to " + wynik);
                        break;
                    case 5:
                        wynikNext = Math.pow(a, b);
                        System.out.println("Wybrałeś Potęgowanie liczby pierwszej [^] o liczbę drugą a twój wynik to " + wynikNext);
                        break;
                    case 6:
                        System.out.print("Wybrałeś wartość bezwzględna z liczby [m], dla tej operacji proszę wprowadzić");
                        System.out.print(" tylko jedną liczbę \n");
                        System.out.println("Wybierz liczbę: ");
                        int ax = x.nextInt();
                        int a2 = Math.abs(ax);
                        if (ax != 0) {
                            System.out.println("Wybrałeś wartość bezwzględna z liczby " + ax + " i wynosi ona " + a2);
                        } else System.out.println("Nie można policzyć wartości bezwzglednej z liczby " + 0);
                        break;
                    case 7:

                        for (int i = 1; i <= a; i++) {
                            count *= i;


                        }
                        System.out.println("Wybrałeś liczbę " + a + " Silnia wynosi " + count);
                        for (int i = 1; i <= b; i++) {
                            count2 *= i;


                        }
                        System.out.println("Wybrałeś liczbę " + b + " Silnia wynosi " + count2);
                        break;
                    default:
                        System.out.println("------Wybrałeś niepoprawny numer działania-------");


                }


            }

//




    }
}
