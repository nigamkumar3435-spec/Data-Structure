import java.util.Scanner;
public class Loop{

  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n=sc.nextInt();

      while(n!=0)
      {
        n=n/2;
        
        if(n%2==0) {
          continue;
        }
        System.out.println(n);      
      }
      sc.close();
    }
  
  
}
