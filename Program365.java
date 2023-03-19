//Write java program which accept number of rows and numnber of columns from user and display below pattern
//ip=iRow=3  iCol=4
//op= 1  2   3   4  
//    5  6   7   8
//    9  10  11  12 


import java.util.Scanner;
class pattern
{
 public void DisplayPattern(int iRow,int iCol)
 {
    int i=1,j=1;
    int iNo=1;
    for(i=iRow;i>=1;i--)
    {   
        for(j=1;j<=iCol;j++)
        {
            System.out.print(iNo+"\t"); 
            iNo++;
        }
        
        System.out.println();
    }
 }
}
class Program365
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