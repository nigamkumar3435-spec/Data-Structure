 class MyFuntion {
    public void printName(String name)
    {
        System.out.println("My name is "+name);
    } 
    public int multiply(int a,int b)
    {
        int result=a*b;
        return result;
    } 
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" b="+b);
    }
}
public class MyFunction{
    public static void main(String args[])
    {
        MyFuntion obj=new MyFuntion();
        obj.printName("Nigam");

        int result=obj.multiply(5, 10);
        System.out.println("The result is: "+result);

        obj.swap(5, 10);
    }
     
}
