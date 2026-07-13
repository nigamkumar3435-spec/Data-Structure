
import java.util.Scanner;

class UnryOp {
  public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
     System.out.println(sc instanceof Scanner);

    // int a=10;
    // a++;
    // --a;
    // int b=++a + a--;
    // System.out.println(b+" "+a);

    // boolean correct=true;
    // System.out.println(correct);
    // System.out.println(!correct);

    // int val=5;// -(val+1) = -6
    // System.out.println(~val);

    // int val1=-10;// -(val1+1) = 9
    // System.out.println(~val1);

    // int x=10>>2;// 1010 >> 2 = (10)binary=2
    // System.out.println(x);

    // boolean v1=true;
    // boolean v2=false;
    // boolean v3=true;
    // boolean v4=false;

    // System.out.println(v1&&v2||v3&&v4);
    // System.out.println((v1&&v3)||(v2&&v4));

     //int test=10;
    // System.out.println(v1||(++test ==10));
    // System.out.println(test);

    // System.out.println(v2||(++test ==10));
    // System.out.println(test);

    // int reslt=(5<6)?(test++):(test--);
    // System.out.println(test);
    // System.out.println(reslt);

    int z=5;
    int y=(27+40) - z++ * 5 / 2 + 9 % 100;
    System.out.println(y);

    //associativity of postfix is left to right
    //associativity of prefix is right to left

    sc.close();
  }
}
