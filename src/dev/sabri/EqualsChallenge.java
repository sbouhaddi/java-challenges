package dev.sabri;

public class EqualsChallenge {

    private static final String SEPARATOR = "----------------------------------------------------------------";

    public static void main(String... args) {
        Integer i = 10;
        Integer j = new Integer(10);
        System.out.println(i == j);
        System.out.println(i.equals(j));


        System.out.println(SEPARATOR);

        Integer k = 127;
        Integer l = 127;
        System.out.println(k == l);
        System.out.println(k.equals(l));


        System.out.println(SEPARATOR);


        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println(SEPARATOR);

        String s = "test";
        String t = new String("test");
        System.out.println(s == t);
        System.out.println(s.equals(t));


        System.out.println(SEPARATOR);


        String u = "test";
        String v = "test";
        System.out.println(u == v);
        System.out.println(s.equals(t));


    }
}
