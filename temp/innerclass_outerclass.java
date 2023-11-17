package temp;
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class innerclass_outerclass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}