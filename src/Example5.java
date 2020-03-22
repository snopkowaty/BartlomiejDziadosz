public class Example5 {
    public static void main(String[] args) {
        double metr;
        double cal;
        int licznik;
        System.out.println("");
        licznik = 0;
        for (cal = 1; cal <= 100; cal++) {
            metr = cal * 39.37;
            System.out.println(cal + " cali to w przeliczeniu " + metr + " na metr ");
            licznik++;
            if (licznik >= 12) {
                System.out.println("");
                licznik = 0;


            }
        }

    }
}
