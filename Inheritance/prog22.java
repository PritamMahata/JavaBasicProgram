package Inheritance;
class parent {
    int a, b;
    parent() {a = 10;b = 12;}
    void display1() {
        System.out.println("SUM of parent class = " + (a + b));
    }
}
class child extends parent {
    int c, d;
    child() {c = 10;d = 15;}
    void display2() {
        System.out.println("SUM of child class= " + (c + d));
    }
}
public class prog22 {
    public static void main(String[] args) {
        child obj = new child();
        obj.display1();
        obj.display2();
    }
}
