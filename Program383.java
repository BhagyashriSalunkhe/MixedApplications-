//Write java program which accept string from user and display below pattern
//ip=Hello
//op=  H              
//     H    e          
//     H    e   l          
//     H    e   l   l     
//     H    e   l   l   o  

import java.util.Scanner;

class Pattern
{
    public void DisplayPattern(String str)
    {
      char Arr[]=str.toCharArray();
      int i=0,j=0;
      int iCnt=0;
      for(i=0;i<Arr.length;i++)
      {
        for(j=0;(j<=iCnt)&&(iCnt<Arr.length);j++)
        {
            System.out.print(Arr[j]+"\t");
        }
        iCnt++;
        System.out.println();
      }
    }
}
class Program383
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