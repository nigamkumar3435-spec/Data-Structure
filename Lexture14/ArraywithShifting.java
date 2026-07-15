import java.util.Scanner;

public class ArraywithShifting
{
      public static void main(String[] args)
      {
          ArraywithShifting obj=new ArraywithShifting();
          int arr[]=new int[4];
          arr[0]=10;
          arr[1]=20;
          arr[2]=30;
          arr[3]=40;

          for(int index=0;index<4;index++)
          {
              System.out.println("Element at index "+ index +" is: "+ arr[index]);
          }
          obj.insertWithShift(arr,9,1);
          for(int index=0;index<4;index++)
          {
              System.out.println("After shift Element at index "+ index +" is: "+ arr[index]);
          }
          obj.deleteWithShift(arr,2);
          for(int index=0;index<4;index++)
          {
              System.out.println("After delete shift Element at index "+ index +" is: "+ arr[index]);
          }
      }
      public void insertWithShift(int arr[], int element, int index)
      {
              int len=arr.length;
              if(index<0 || index>=len)
              {
                  System.out.println("Index out of bounds!");
                  return;
              }
              for(int i=len-2;i>=index;i--)
              {
                  arr[i+1]=arr[i];
              }
              arr[index]=element;
      }

      public void deleteWithShift(int arr[], int index)
      {
            int len=arr.length;
            if(index<0||index>=len)
            {
                System.out.println("Index out of bounds!");
                return;
            }
            for(int i=index+1;i<len;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[len-1]=0;//delete to avoid duplicate.
      }
}
