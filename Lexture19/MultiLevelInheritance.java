class LivingThing
{
    void breath()
    {
        System.out.println("Living things breath!");
    }
}
class Human extends LivingThing
{
    void walk()
    {
        System.out.println("Human walk!");

    }
}
class Employee extends Human{
    void work()
    {
        System.out.println("Employee works in office!");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.breath();
        e.walk();
        e.work();
    }
}
