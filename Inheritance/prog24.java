package Inheritance;

interface one1 {
    void print_data();
}
interface two1 {
    void print_for();
}
class child1 implements one1, two1 {
    public void print_data() {
        System.out.println("print data for one");
    }
    public void print_for() {
        System.out.println("print data for two");
    }
}
public class prog24 {
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.print_data();
        obj.print_for();
    }
}
