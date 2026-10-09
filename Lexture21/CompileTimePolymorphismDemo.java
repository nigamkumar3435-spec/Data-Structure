class Calculator
{
    int add(int a, int b)
    {
        System.out.println("int int");
        return a+b;
    }

    double add(double a, double b)
    {
        System.out.println("double double");
        return a+b;
    }

    int add(int a, int b, int c)
    {
        System.out.println("int int int");
        return a+b+c;
    }
}
public class CompileTimePolymorphismDemo
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add(1, 2, 3));
    }
}
