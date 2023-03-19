//Write a java program which accept string from user and count number of capital characters
//i/p="Marvellous Multi OS"
//OP=4
import java.util.Scanner;

class capital
{
  public int CountCapital(String s)
  {
    int cCount=0;
    for(int i=0;i<s.length();i++)
    {
      if((s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
      {
        cCount++;
      }
    }
    return cCount;
  }
}
class Program311
{
    public static void main(String asd[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sobj.nextLine();
      capital cobj=new capital();
      int iRet=cobj.CountCapital(str);
      System.out.println("Capial characters in "+str+" is "+iRet);
    }
}