//Write java program which accept number of rows and number of columns from user display below pattern
//ip= iRow=6 iCol=6
//  *   *   *   *   *   *
//  *               *   *
//  *           *       *
//  *       *           *
//  *   *               *
//  *   *   *   *   *   *

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
            if((i==1)||(i==iRow)||(j==1)||(j==iCol))
            {
             System.out.print("*"+"\t"); 
            }
            else if(i==iRow-j+1)
            {
             System.out.print("*"+"\t"); 
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
class Program403
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