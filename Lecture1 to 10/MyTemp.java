import java.util.Scanner;

public class MyTemp {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("What is your name");

    //String firstname=sc.next();
    String name=sc.nextLine();

    //System.out.println("Hi "+name);
    //System.out.println("Hello "+firstname);
    System.out.println("What is your age");
    //int age=sc.nextInt();

    String ageInput=sc.next();

    int age=Integer.parseInt(ageInput);// Convert the string input to an integer

    System.out.println(" What is your address");
    sc.nextLine(); // Consume the newline character left by nextInt()
    String address=sc.nextLine();

    System.out.println("Hello "+name+" Your are "+age+" years old");
    System.out.println("Your address is "+address);

    sc.close();
  }
}