class Person
{
    void sleep()
    {
        System.out.println("Person is Sleeping");
    }
}
class Engineer extends Person
{
    void work()
    {
        System.out.println("Engineer is working");
    }
}
class HR extends Person
{
    void hire()
    {
        System.out.println("Hire employees");
    }
}
class TeamLead extends Engineer
{
    void manage()
    {
        System.out.println("Temalead manages Projects");
    }
}

public class HybridInheritance
{
    public static void main(String[] args)
    {
        TeamLead t = new TeamLead();
        t.sleep();// from person
        t.work();// from Engineer
        t.manage();// from Teamlead

        HR h = new HR();
        h.hire();// from HR
        h.sleep();// from person
    }
}
