package Inheritance;
class one{
    void printone(){
        System.out.println("inside the class one");
    }
}

class two extends one{
    void printtwo(){
        System.out.println("inside the class two");
    }
}
class three extends two{
    void printthree(){
        System.out.println("inside the class three");
    }
}
public class prog23 {
    public static void main(String[] args) {
        three obj = new three();
        obj.printone();
        obj.printtwo();
        obj.printthree();
    }
}
