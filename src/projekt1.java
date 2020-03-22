public class projekt1 {
    public static void main(String[] args) {
        double x_1, x0, function, proc1 = 5, proc;
        boolean flag = true;
        int i = 1;
        x_1 = 2;
        x0 = 0;

        while (flag) {
            function = x0 - ((F(x0) * (x0 - x_1)) / (F(x0) - F(x_1)));
            proc = Math.abs((function - x0) / function) * 100;
            System.out.println("Iteration : " + i++);
            System.out.println("Root:" + function);
            System.out.println("Error:" + proc);
            x_1 = x0;
            x0 = function;
            if (proc1 > proc) {
                flag = false;
            }
        }
    }


    public static double F(double x) {
        return Math.pow(x, 2) - Math.sin(x) - 1;

    }
}