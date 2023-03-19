//Write java program which accept number of rows and numnber of columns from user and display below pattern
//ip=iRow=4  iCol=3
//op=  1    2   3     
//     1    2   3    
//     1    2   3    
//     1    2   3    

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
            System.out.print(j+"\t"); 
        }
        
        System.out.println();
    }
 }
}
class Program372
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