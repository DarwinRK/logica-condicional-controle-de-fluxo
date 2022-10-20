public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false, b3 = true, b4 = false;

        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));

        System.out.println("b2 || b3 = " + (b2 || b3));
        System.out.println("b2 || b4 = " + (b2 || b4));

        System.out.println("b1 ^ b3 = " + (b1 ^ b3));
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        
    }
}
