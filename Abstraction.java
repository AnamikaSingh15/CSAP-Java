abstract class Car // We can have abstract method only in the abstract class;
{
    public abstract void drive(); // Declaring a method ; for declaring a method abstract keyword is used;
    public abstract void fly(); // They both are abstract methods. they has no body only declararion ; child class will decide implementation

    public void playmusic()
    {
        System.out.println("PlayMusic");
    }
}
abstract class Toyta extends Car
{
    public void drive()  // Here drive method is definde insted of declaring
{
        System.out.println("Driving...");
}
 
}

class updatedToyta extends Toyta 
{
    public void fly(){
        System.out.println("Flying");
    }
}
public class main
{
    public static void main(String args[])
    {
        Car obj = new updatedToyta();  ///upcasting is done here as child object stored in parent reference
        // can't create object of abstract class  so this is wrong "Car obj = new Car();"
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
abstract class Car // We can have abstract method only in the abstract class;
{
    public abstract void drive(); // Declaring a method ; for declaring a method abstract keyword is used;
    public abstract void fly(); // They both are abstract methods. they has no body only declararion ; child class will decide implementation

    public void playmusic()
    {
        System.out.println("PlayMusic");
    }
}
abstract class Toyta extends Car
{
    public void drive()  // Here drive method is definde insted of declaring
{
        System.out.println("Driving...");
}
 
}

class updatedToyta extends Toyta 
{
    public void fly(){
        System.out.println("Flying");
    }
}
public class main
{
    public static void main(String args[])
    {
        Car obj = new updatedToyta();  ///upcasting is done here as child object stored in parent reference
        // can't create object of abstract class  so this is wrong "Car obj = new Car();"
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
