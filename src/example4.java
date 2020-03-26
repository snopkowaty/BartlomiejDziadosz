public class example4 {
    public static void main(String[] args) {
        double gravityEarth;
        double gravityMoon;
        double mass;
        gravityEarth = 9.89;
        gravityMoon = gravityEarth*0.17;
        System.out.println("Grawitacja na Księżycu wynosi " + gravityMoon + "[kg/m*s^2].");
        mass = 91;
        double qMoon;
        qMoon = mass*gravityMoon;
        System.out.println("Ciężar na Księżycu wynosi "+qMoon+"[N].");

    }
}
