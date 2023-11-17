package ExceptionHandling;

public class try_catch_block_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            int x = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
