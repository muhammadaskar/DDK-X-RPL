package Operator;

public class Logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        // Konjungsi (AND)
        c = a && b;
        System.out.println("a AND b = " + c);

        // Disjungsi (OR)
        c = a || b;
        System.out.println("a OR b = " + c);

        // Negasi (bukan)
        System.out.println("Negasi, !false = " + !b);
    }
}
