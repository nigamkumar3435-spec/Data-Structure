import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String word = obj.next();
//        System.out.println("Enter a Line");
//        String line = obj.nextLine();
//
//        System.out.println("Word is "+ word);
//        System.out.println("Line is "+ line);

//        String str = "Nigam Kumar";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.length());
//        System.out.println(str.charAt(10));
//        System.out.println(str.indexOf('m'));
//
//        char ch[]=str.toCharArray();
//        for(int i=0;i<ch.length;i++)
//        {
//            System.out.print(ch[i]+" ");
//        }

//        System.out.println("Nigam".compareTo("Nig"));
//        System.out.println("Nig".compareTo("Nigam"));
//        System.out.println("Nigam".compareTo("Nigam"));
//
//        System.out.println("Nigam".compareTo("Sugam"));

//        System.out.println("    Nigam     ");
//        System.out.println("    Nigam     ".trim());
//
//        System.out.println("    Nigam     ".startsWith("Nigam"));
//        System.out.println("    Nigam     ".startsWith("    Nigam"));
//        System.out.println("    Nigam     ".endsWith("am     "));
//        System.out.println("    Nigam     ".endsWith("am"));

//        System.out.println("Nigam".substring(2,4));
//
//        String myLocations = "hyderabad, chennai, bangalore, noida, pune";
//
//        String myLocationList[]=myLocations.split(",");
//        for(int i=0;i<myLocationList.length;i++)
//        {
//            System.out.println(myLocationList[i]+ " ");
//        }

        String email1 = "Nigam123@gmail.com";
        String email2 = "Shadow@hotmail.com";

        String emailArr[]=email1.split("@");
        String lastPart = emailArr[emailArr.length-1];
        int dotIndex = lastPart.lastIndexOf('.');
        System.out.println(lastPart.substring(0, dotIndex));
    }
}