//Write java program which accept number of rows and number of columns from user display below pattern
//ip= iRow=4 iCol=4
//  *   *   *   #
//  *   *   #   *
//  *   #   *   *
//  #   *   *   *
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
            if(i==j)
            {
             System.out.print("#\t"); 
            }
            else
            {
             System.out.print("*\t"); 
            }
        }
        
        System.out.println();
    }
 }
}
class Program401
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