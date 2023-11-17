package temp;

import java.io.*;

public class file_handling {
    public static void main(String[] args) {
//        try {
//            FileWriter f = new FileWriter("myFile.txt");
//            f.write("hello world");
//            System.out.println("Success");
//            f.close();
//        } catch (IOException e) {
//            System.out.println("Error to write in file");
//        }
        int i = 1;
        for (;;) {
            String st = i+"file";
            try {
                FileWriter f = new FileWriter(st);
                f.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
