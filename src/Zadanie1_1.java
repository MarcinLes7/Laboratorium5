import jdk.swing.interop.SwingInterOpUtils;

public class Zadanie1_1 {
    public static void main(String[] args) {
        float inwestycja = 14000;
        System.out.println("Inwestycja = " + inwestycja + " zł");
        inwestycja = inwestycja * 1.4F;
        System.out.println("Wartość inwestycji po 1 roku = " + inwestycja + " zł");
        inwestycja = inwestycja - 1500f;
        System.out.println("Wartość inwestycji po 2 roku = " + inwestycja + " zł");
        inwestycja = inwestycja * 1.12F;
        System.out.println("Wartość inwestycji po 3 roku = " + inwestycja + " zł");



    }
}
