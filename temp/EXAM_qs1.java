package temp;

import static java.util.Arrays.sort;

public class EXAM_qs1 {
    public static void main(String[] args) {
        String[] arr = {"pritam", "aniket", "sohon", "rohit", "zozo"};
        sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

}
