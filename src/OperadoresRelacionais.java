public class OperadoresRelacionais {
    public static void main(String[] args) {
        int i1 = 10, i2 = 20;
        float f1 = 4.5f, f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x', c2 = 'y';
        String s1 = "Fulano", s2 = "Fulano", s3 = "Ciclano";
        boolean b1 = true, b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2? " + (i1 == i2));
        System.out.println("i1 != i2? " + (i1 != i2));
        System.out.println("i1 > i2? " + (i1 > i2));
        System.out.println("i1 <= i2? " + (i1 <= i2));

        System.out.println("f1 == f2? " + (f1 == f2));
        System.out.println("f1 != f2? " + (f1 != f2));
        System.out.println("f1 >= f2? " + (f1 >= f2));
        System.out.println("f1 < f2? " + (f1 < f2));

        System.out.println("c1 == c2? " + (c1 == c2));
        System.out.println("c1 != c2? " + (c1 != c2));
        System.out.println("c1 > c2? " + (c1 > c2));
        System.out.println("c1 <= c2? " + (c1 <= c2));

        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 != s2? " + (s1 != s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println("s1 != s3? " + (s1 != s3));
        //Não é possível comparar tamanho de String

        System.out.println("b1 == b2? " + (b1 == b2));
        System.out.println("b1 != b2? " + (b1 != b2));
        //Não é possível comparar tamanho de boolean

        System.out.println("i1 == f2? " + (i1 == f2));
        System.out.println("d1 == l2? " + (d1 != l2));        
    }
}
