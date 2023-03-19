//Write java program which accept string from user and display below pattern
//ip=Hello
//     H    *   *   *   *
//     H    e   *   *   *
//     H    e   l   *   *
//     H    e   l   l   *


import java.util.Scanner;

class Pattern
{
    public void DisplayPattern(String str)
    {
      
      int i=1,j=1;

      for(i=0;i<str.length()-1;i++)
      {
        for(j=0;j<str.length();j++)
        {
            if((i==j)||(i>j))
            {
             System.out.print(str.charAt(j)+"\t");
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
class Program391
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