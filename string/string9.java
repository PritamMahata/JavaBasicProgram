package string;

import java.util.Scanner;

// replace word from a string
public class string9 {


    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String s = "C is a programming language. C is platform independence.";
        String replaceString = s.replace("C","java");
        System.out.println(replaceString);
    }
}