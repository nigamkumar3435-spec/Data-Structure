class Device
{
    void charge()
    {
        System.out.println("Charging device...");
    }
}

class Phone extends Device
{
    void charge()
    {
        System.out.println("Phone is charging with Type C cable");
    }
}

class Laptop extends Device
{
    void charge()
    {
        System.out.println("Laptop is charging with Power adaptor");
    }
}

class SmartWatch extends Device
{
//    void charge()
//    {
//        System.out.println("SmartWatch is charging wirelessly");
//    }
}
public class RunTimePolymorphismDemo
{
    public static void main(String[] args)
    {
        Device d;

        d=new Phone();
        d.charge();

        d=new Laptop();
        d.charge();

        d=new SmartWatch();
        d.charge();
    }
}
