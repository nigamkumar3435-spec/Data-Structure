class E
{
    int speed = 50;
    E()
    {
        System.out.println("Parent display");
    }
    void display()
    {
        System.out.println("Parent display");
    }
}
class F extends E
{
    int speed = 100;
    F()
    {
        super();
        System.out.println("Child constructor");
    }
    void show()
    {
        System.out.println(speed);
        System.out.println("super.speed");
    }
    void display()
    {
        System.out.println("Child display");
        super.display();
    }
}

public class SuperKeyword {
}
