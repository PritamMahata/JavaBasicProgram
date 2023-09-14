package string;
// concatenate a string
public class string2 {
    public static void main(String[] args) {
        // exception
        String s = "Pritam";
        s.concat("Mahata");
        System.out.println(s); // this is not print "Pritam Mahata" because String is immutable
        System.out.println(s.concat(" Mahata")); // this print directly
        //or
        s = s.concat(" Mahata"); // this re-assign the new string to the s
        System.out.println(s);
    }
}
