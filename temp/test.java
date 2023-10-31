package temp;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//        }
        int a = 0, b = 2, n = 10, sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += a + (j * b);
                j *= 2;
            }
            System.out.printf(" %d \n", sum);

        }
        in.close();
    }
}