//Write java program which accept number of rows and numnber of columns from user and display below pattern
//ip=iRow=4  iCol=4
//op=  A    B   C   D   
//     A    B   C   D 
//     A    B   C   D 
//     A    B   C   D 
import java.util.Scanner;

class pattern
{
 public void DisplayPattern(int iRow,int iCol)
 {
    int i=1,j=1;
    char ch;
    for(i=1;i<=iRow;i++)
    {
        for(j=1,ch='A';j<=iCol;j++,ch++)
        {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
 }
}
class Program361
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