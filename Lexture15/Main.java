class Car
{
    String model; //instance field
    private int speed;

    void accelerate(int delta) //behaviour
    {
        speed+=delta;
    }

    int getSpeed()
    {
        return speed;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        // objects are initialized or stored in heap memory.and variables refer that object.
        // variables are stored in stack memeory.
        Car car = new Car();
        car.model = "BMW";
        car.accelerate(60);
        System.out.println(car.getSpeed());
    }
}