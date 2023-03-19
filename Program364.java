//Write java program which accept number of rows and numnber of columns from user and display below pattern
//ip=iRow=4  iCol=5
//op=  4    4   4   4   4   
//     3    3   3   3   3 
//     2    2   2   2   2
//     1    1   1   1   1

import java.util.Scanner;
class pattern
{
 public void DisplayPattern(int iRow,int iCol)
 {
    int i=1,j=1;
    
    for(i=iRow;i>=1;i--)
    {
        for(j=1;j<=iCol;j++)
        {
            System.out.print(i+"\t"); 
        }
        
        System.out.println();
    }
 }
}
class Program364
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the number of rows");
      int iRow=sobj.nextInt(); 

      System.out.println("Enter the number of columns");
      int iCol=sobj.nextInt();

      pattern pobj=new pattern();
      pobj.DisplayPattern(iRow,iCol);

    }
}