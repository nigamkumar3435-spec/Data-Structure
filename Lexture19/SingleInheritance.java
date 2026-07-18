class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat(); //from Animal
        d.bark(); //from Dog

        Animal a = new Animal();
        a.eat();
        //a.bark(); //parent class cannot access child methods.
    }
}