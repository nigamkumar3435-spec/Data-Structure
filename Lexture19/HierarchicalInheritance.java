class Appliance
{
    void swithOn()
    {
        System.out.println("Appliance swith on");
    }
}
class Fan extends Appliance
{
    void rotate()
    {
        System.out.println("Fan is rotating");
    }
}
class Light extends Appliance
{
    void glow()
    {
        System.out.println("Light is glowing");
    }
}

public class HierarchicalInheritance
{
    public static void main(String args[])
    {
        Fan f = new Fan();
        f.swithOn();
        f.rotate();
        //f.glow(); X can not be called

        Light l = new Light();
        l.glow();
        l.swithOn();
    }
}
