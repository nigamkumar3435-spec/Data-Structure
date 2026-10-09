class A
{
    final int Speed_limit = 80;

    void updateSpeed()
    {
        //Speed_limit =100; //error(cannot redefine final variable
    }

    final void display()
    {
        System.out.println("Parent display");
    }
}

class B extends A
{
    //void display() // not allowed (cannot override)
}
final class C
{

}
//class D extends C{} //cannot inherit final class C

public class FinalKeyword
{

}
