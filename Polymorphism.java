class Human {
 public void profession() {
        System.out.println("Every person has a profession");
    }
}
class Teacher extends Human {
     public void profession() {
        System.out.println("Teacher teaches students in school");
    }
}
class Doctor extends Human {
     public void profession() {
        System.out.println("Doctor treats sick patients");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Doctor d = new Doctor();
        Human h = new Human();
        t.profession();
        d.profession();
        h.profession();
    }
}