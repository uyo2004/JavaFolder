// Uyoojo Okene
// p.176

public class ShortCircuitTestAnd {

    public static void main(String[] args) {
        if(falseMethod() && trueMethod()) {
            System.out.println("Both methods returned true");
        } else {
            System.out.println("Both methods are not true");
        }

    }
    public static boolean trueMethod() {
        System.out.println("Within trueMethod()");
        return true;
    }
    public static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }

}
