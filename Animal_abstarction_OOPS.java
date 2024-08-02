abstract class Animal
{
    abstract void walk();
    Animal() {
        System.out.println("you are creating a new animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}
class Horse extends Animal
{
    Horse()
    {
        System.out.println("created a horse");
    }
    public void walk()
    {
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal
{
    public void walk()
    {
        System.out.println("walk on 2 legs");
    }
}
    public class Animal_abstarction_OOPS {
    public static void main(String arg[])
    {
        Horse horse1=new Horse();
        // horse1.walk();
        // horse1.eat();

        // Chicken chicken=new Chicken();
        // chicken.walk();

        // Animal animal=new Animal();
        // animal.walk();
    }
    
}
