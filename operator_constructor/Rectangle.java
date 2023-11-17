package operator_constructor;

class Rectangle {
    int length;
    int width;
    void insert(int l, int w) {
        length = l;
        width = w;
    }
    int calculateArea() {
        return (length * width);
    }
    void display() {
        System.out.println("Area of Rect =" + calculateArea());
    }
}
class calculation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.insert(11, 5);
        r2.insert(3, 15);
        r1.display();
        r2.display();
    }
}