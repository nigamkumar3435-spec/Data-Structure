class Vehicle
{
    String model;
    private int speed;

    Vehicle()
    {
        model = "SUV";
        speed = 48;
        System.out.println("Constructor is called");
    }

    Vehicle(String model, int speed)
    {
        this(); // current class constructor call
        System.out.println("Before: "+this.model);
        this.model = model;
        this.speed = speed;
        System.out.println("After: "+this.model);
    }

    //Copy Constructor it is not in java explicitly it is done manually.
    Vehicle(Vehicle that)
    {
        this.model = that.model;
        this.speed = that.speed;
    }
    void accelerate(int delta)
    {
        speed+=delta;
    }

    int getSpeed()
    {
        return speed;
    }
}
public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        System.out.println("Default:"+v.getSpeed());

        Vehicle v1=new Vehicle("Ford", 43);
        System.out.println("Parameterized:"+v1.getSpeed());

        Vehicle v2=new Vehicle(v1);
        System.out.println("Copy:"+v2.getSpeed());

        Vehicle v3=v1;
        System.out.println("Before v3 speed: "+v3.getSpeed());
        v3.accelerate(100);
        System.out.println("After v1 speed: "+v1.getSpeed());
        System.out.println("After v3 speed: "+v3.getSpeed());
    }

}