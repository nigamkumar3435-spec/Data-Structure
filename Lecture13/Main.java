//Concatenation...
public class Main
{
    public static void main(String args[])
    {
//        System.out.println("Nigam"+"01");
//        System.out.println("Nigam"+01);
//        System.out.println(01+"Nigam");
//
//        System.out.println(01+"Nigam"+45);


        //String Formatting
        double num=989.3443676;
        System.out.println(num);
        System.out.printf("Number is %.1f ",num);
        System.out.println("");
        System.out.printf("Number is %.5f ",num);
        System.out.println("");
        System.out.printf("Number is %.9f ",num);
        System.out.println("");

        String address="India";
        String name=String.format("Number is %f address is %s",num, address);
        System.out.println(name);

        //if order has to change we use $ with number on which place it has to be placed.
        String name1=String.format("Number is %2$f address is %1$s", address, num);
        System.out.println(name1);
    }
}