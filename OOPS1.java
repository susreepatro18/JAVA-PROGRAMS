class Pen
{

    String colour;
    String type;


public void write()
{
    System.out.println("writing something");
}
public void printcolour()
{
    System.out.println(this.colour);
}
}

class Student
{
    String name;
    int age;
public void info(String name)
{
    System.out.println(name);
}
public void info(int age)
{
    System.out.println(age);
}
public void info(String name,int age)
{
    System.out.println(name+" "+age);
}

}

public class OOPS1 {
    public static void main(String arg[])
    {
        Pen pen1=new Pen();
        pen1.colour="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.colour="red";
        pen2.type="ballpoint";

        pen1.write();
        pen1.printcolour();
        pen2.printcolour();


        Student s1= new Student();
        s1.name="susree" ;
        s1.age=19;


        Student s2= new Student();
        s2.name="sibu";
        s2.age=20;
        
        

        s1.info(s1.name);
        s2.info(s2.name);
        



    }
    
}
