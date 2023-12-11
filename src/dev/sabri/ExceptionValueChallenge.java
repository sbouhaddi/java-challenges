package dev.sabri;

public class ExceptionValueChallenge {

    static int x, y, z;

    public static void main(String... args) {
        try {
            sum(x = 1, thorwsException(y = 2), z = 3);

        } catch (Exception e) {
            System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        }

    }

    static int thorwsException(int x) throws Exception {
        throw new StackOverflowError("Exception");
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}
