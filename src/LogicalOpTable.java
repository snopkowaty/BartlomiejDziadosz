

public class LogicalOpTable {

    public static void main(String[] args) {

        boolean p, q, c;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        System.out.print(printBoolean3(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = true;
        q = false;

        System.out.print(printBoolean3(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = false;
        q = true;

        System.out.print(printBoolean3(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = false;
        c = true;

        System.out.print(printBoolean3(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & c) + "\t" + printBoolean(p | c) + "\t");
        System.out.println(printBoolean(p ^ c) + "\t" + printBoolean(!c));
    }

    public static String printBoolean(boolean p) {
        return p ? "1" : "0";
    }
    public static String printBoolean2(boolean q) {
    return q ? "1" : "0";
    }
    public static String printBoolean3(boolean c) {
        return c ? "1" : "0";
    }
}