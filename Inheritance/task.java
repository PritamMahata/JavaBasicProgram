package Inheritance;
interface numbers{
    int process(int x, int y);
}
class sum implements numbers{
    public int process(int a, int b){
        return a+b;
    }
}
class average implements numbers{
    public int process(int a, int b){
        return ((a+b)/2);
    }
}
public class task {
    public static void main(String[] args) {
        sum add = new sum();
        average avg = new average();
        System.out.println("12 + 15 = "+add.process(12,15));
        System.out.println("(12 + 15)/2 = "+avg.process(12,15));
    }
}