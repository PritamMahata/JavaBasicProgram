package ExceptionHandling;

public class try_catch_block_4 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}