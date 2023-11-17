package temp;

class parent {
    public static void test() {
        System.out.println("ths is is parent");
    }
}

class child extends parent {
    public static void test() {
        System.out.println("ths is is child");
    }
}

public class method_overridding {
    public static void main(String[] args) {
        parent pr = new parent();
        pr.test();
        child ch = new child();
        ch.test();
    }
}
