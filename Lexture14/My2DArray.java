public class My2DArray
{
    public static void main(String args[])
    {
        int matrix[][]=new int[3][2];
        int rows=matrix.length;
        int cols=matrix[0].length;

        //fill
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                matrix[r][c]=10;
            }
        }
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        matrix[1][1]=20;
        System.out.println("After Update");
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        matrix[1][1]=0;
        System.out.println("After Delete");
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        int subArray[]=matrix[1];
        int len=subArray.length;
        System.out.println("Printing 1st row");
        for(int r=0;r<len;r++)
        {
            System.out.print(subArray[r]+" ");
        }
        System.out.println();

        int subArray1[]=matrix[0];
        int len1=subArray.length;
        System.out.println("Printing 0th row");
        for(int r=0;r<len1;r++)
        {
            System.out.print(subArray1[r]+" ");
        }
        System.out.println();
    }
}
