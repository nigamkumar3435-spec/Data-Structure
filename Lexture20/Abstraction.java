package Lexture20;

abstract class Shape{
    Shape(){
        System.out.println("I am Shape");
    }

    //Abstract method
    abstract void area();

    //Normal method
    void display(){
        System.out.println("This is a Shape");
    }
}

//Concrete class
class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius = r;
    }
    void area()
    {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

//Another Concrete Class
class Rectangle extends Shape{
    double length, width;

    Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    void area(){
        double area = length * width;
        System.out.println("Rectangle Area = " + area);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        //Shape s = new Shape(); =>Compile-time error
        Shape s1 = new Circle(5);//Circle Object
        Shape s2 = new Rectangle(4, 6);//Rectangle Object
        s1.area();
        s2.area();
        s1.display();//Concrete method from abstract class
    }
}
