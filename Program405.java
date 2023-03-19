//Write java program which accept number of rows and number of columns from user display below pattern
//ip= iRow=5 iCol=5
// 1    2   3   4   5
// 1    2           5
// 1        3       5
// 1            4   5
// 1    2   3   4   5

import java.util.Scanner;
class pattern
{
 public void DisplayPattern(int iRow,int iCol)
 {
    int i=1,j=1;
    
    for(i=1;i<=iRow;i++)
    {
        for(j=1;j<=iCol;j++)
        {
            if((i==j)||(i==1)||(j==1)||(i==iRow)||(j==iCol))
            {
             System.out.print(j+"\t"); 
            }
            else
            {
              System.out.print(" "+"\t"); 
            }
           
        }
        
        System.out.println();
    }
 }
}
class Program405
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