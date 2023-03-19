//Write java program which accept number of rows and numnber of columns from user and display below pattern
//ip=iRow=4  iCol=4
//op=  A    B   C   D   
//     a    b   c   d 
//     A    B   C   D 
//     a    b   c   d 

import java.util.Scanner;

class pattern
{
 public void DisplayPattern(int iRow,int iCol)
 {
    int i=1,j=1;
    
    for(i=1;i<=iRow;i++)
    {
        char bAlpha='A';
        char sAlpha='a';

        for(j=1;j<=iCol;j++)
        {
            if(i%2==0)
            {
            System.out.print(sAlpha+"\t"); 
            sAlpha++; 
            } 
            else
            {
            System.out.print(bAlpha+"\t"); 
            bAlpha++; 
            } 
        }
        
        System.out.println();
    }
 }
}
class Program362
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