class Villain
{
    void kidnap()
    {
        System.out.println("Villain is Kidnapping");
    }
}
class Gabbar extends Villain
{
    void asking()
    {
        System.out.println("Kitne aadmi the");
    }
}
public class DefaultClassDemo
{
    public static void main(String[] args)
    {
        Villain v = new Villain();
        v.getClass();

        Gabbar g = new Gabbar();
        g.kidnap();
        g.asking();
        g.getClass();
    }
}
//Villain by default extends object class and,
//object class hota hai java.lang package me