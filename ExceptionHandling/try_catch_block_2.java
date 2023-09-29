package ExceptionHandling;

public class try_catch_block_2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
            // handling the exception by using Exception class
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
