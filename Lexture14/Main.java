//Array: The First Data Structure
public class Main
{
    public static void main(String args[])
    {
        //declare
        int arr[]=new int[5];

        //default value is 0
        System.out.println("Before value at 0 index:"+ arr[0]);

        //insert
        arr[0]=10;
        System.out.println("After insert value at 0 index:"+ arr[0]);

        //update
        arr[0]=20;
        System.out.println("After update value at 0 index:"+ arr[0]);

        //delete
        //soft delete
        arr[0]=0;
        System.out.println("After delete value at 0 index:"+ arr[0]);

        //traverse
        int len=arr.length;
        arr[0]=19;
        arr[1]=34;
        arr[4]=36;
        arr[5]=45;//it will give ArrayIndexOutOfBoundsException
        System.out.println("len id array is: "+ len);

        for(int index=0;index<len;index++)
        {
            System.out.println("Element at index "+index+"is "+arr[index]);
        }
    }
}