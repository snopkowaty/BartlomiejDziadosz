public class Example2 {
    public static void main(String[] args) {
        int counter;
        double gallons, liters;
        counter = 0;
        for (gallons = 1; gallons == 100; gallons++) {
            liters = gallons * 3.78;
            System.out.println(gallons + " gallonów " +
                    " to " + liters + " litrów.");
            counter++;
            if (counter == 10) {
                System.out.println("");
                counter=0;
            }
        }
    }
}

