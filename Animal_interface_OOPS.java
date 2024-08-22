interface Animal
{
    int eyes=2;
    void walk();
}

class Horse implements Animal{
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
    public class Animal_interface_OOPS {
        public static void main(String args[]){
            Horse horse=new Horse();
            horse.walk();
        }
    
}
