//Write java program which accept string from user and display below pattern
//ip=Hello
//op=  H    e   l   l   o          
//     H    e   l   l          
//     H    e   l          
//     H    e    
//     H     

import java.util.Scanner;

class Pattern
{
    public void DisplayPattern(String str)
    {
      char Arr[]=str.toCharArray();
      int i=0,j=0;
      int iCnt=Arr.length;
      for(i=0;i<Arr.length;i++)
      {
        for(j=0;j<iCnt;j++)
        {
            System.out.print(Arr[j]+"\t");
        }
        iCnt--;
        System.out.println();
      }
    }
}
class Program382
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sobj.nextLine();
      Pattern pobj=new Pattern();
      pobj.DisplayPattern(str);
    }
}