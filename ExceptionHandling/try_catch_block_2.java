package ExceptionHandling;
public class try_catch_block_2 {
    public static void main(String[] args) {
        String s = null;
        try{
            if(s.equals("hello")) {
                System.out.println("The string is \"hello\"");
            }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}