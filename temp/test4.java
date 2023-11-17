package temp;

class animal {
    void pros(){
        System.out.println("animal...");
    }
}

class dog extends animal {
    void bob(){
        System.out.println("i am a dog");
    }

}

class cat extends animal {
    void tom(){
        System.out.println("i am a cat");
    }
}
    /*
    - School Member must have methods that allow a user to modify the age and name of a member.
    - Staff must inherit School Member; additionally it should have an Employee # that can be modified.
    - Student must inherit School member, additionally it should have a Course/Subject name that can be modified*/

public class test4 {
    public static void main(String[] args) {
        cat mo = new cat();
        mo.tom();
    }

}
