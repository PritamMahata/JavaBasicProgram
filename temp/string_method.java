package temp;

//        equalsIgnoreCase[]
//        substring[]
//        toCharArray[]
//        toLowerCase[]
//        toString[]
//        toUpperCase[]
//        trim[]
//        valueOf[]
//
//        StringBuffer classes
//        append[]
//        capacity[]
//        charAt[]
//        delete[]
//        deleteCharAt[]
//        ensureCapacity[]
//        getChars[]
//        indexOf[]
//        insert[]
//        length[]
//        setCharAt[]
//        setLength[]
//        substring[]
//        toString[]
public class string_method {
    public static void main(String[] args) {
        int num = 131243124;
        String st1 = "Hello World ";
        String st2 = "          HELLO WORLD         ";
        System.out.println(st1.equalsIgnoreCase(st2)); // equalsIgnoreCase[]
        System.out.println(st1.substring(3)); //substring[]
        System.out.println(st1.toCharArray());
        System.out.println(st1.toLowerCase());
        System.out.println(st1.toUpperCase());
//        System.out.println(num.toString()); this method is called automatically by the compiler
        System.out.println(st2.trim());
        System.out.println(st1.valueOf(0));


        // string buffer
        StringBuffer sb = new StringBuffer("world");
        System.out.println(sb.append("hello"));
        System.out.println(sb.capacity());
    }
}