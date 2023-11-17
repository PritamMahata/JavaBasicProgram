package string;

// check string if it's equal or not
public class string4 {
    public static void main(String[] args) {
        String s1 = "Pritam";
        String s2 = "Pritam";
//        String s3 = new String("Pritam");
        String s3 = "Rohit";
        System.out.println(s1.equals(s2)); // true
//        System.out.println(s3.equals(s4)); // false
        System.out.println(s1 == s3);
//        System.out.println(s3 == s4);
    }
}
