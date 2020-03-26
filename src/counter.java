public class counter {
    public static void main(String[] args) {
        double firstStep,secondStep;
        int counter;

        counter = 0;
        for(firstStep = 1;firstStep <= 144; firstStep++) {
            System.out.println(firstStep);
            counter++;


            if (counter == 12) {
                System.out.println();
                counter = 0;
            }

        }
    }
}
