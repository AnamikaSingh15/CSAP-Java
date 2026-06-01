class Person {
    protected String name = "Rahul";
    public void display() {
        System.out.println("Person details");
    }
}
class Inher extends Person {
    private int rollNo = 101;
    private int classNo = 2;
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Class No: " + classNo);
    }
      public void display() {
        super.display();
        System.out.println("Inher details");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Inher s = new Inher();
        s.display();
        s.show();
        Person p = new Inher(); // Upcasting
        p.display();
    }
}


//2nd part


// class Person {
//     protected String name = "Rahul";
//     public void display() {
//         System.out.println("Person details");
//     }
// }
// class Inher extends Person {
//     private int rollNo = 101;
//     private int classNo = 2;
//     void show() {
//         display();
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Class No: " + classNo);
//     }
//     void display() {
//         System.out.println("Inher details");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Inher s = new Inher();
//         s.display();
//         s.show();
//         Inher s = new Parent(); // creates error because parent object cannot be stored in child object
//         Parent p = new Inher();// This is correct as it is called upcasting which means child object can be stored in parent reference
//     }
// }