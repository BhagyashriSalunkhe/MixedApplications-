//Write a java program which accept string from user and count number of small characters
//i/p="Marvellous"
//OP=9
import java.util.Scanner;

class Small
{
  public int CountSmall(String s)
  {
    int sCount=0;
    char Arr[]=s.toCharArray();
    for(int i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='a')&&(Arr[i]<='z'))
      {
        sCount++;
      }
    }
    return sCount;
  }
}
class Program312
{
    public static void main(String asd[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sobj.nextLine();
      Small smobj=new Small();
      int iRet=smobj.CountSmall(str);
      System.out.println("Small characters in "+str+" is "+iRet);
    }
}