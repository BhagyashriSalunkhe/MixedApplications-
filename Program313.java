//Write a java program which accept string from user and return difference between frequency of small  characters and frequency of capital  characters 
//i/p="MarvellouS"
//OP=6(8-2)
import java.util.Scanner;

class DiffrenceSC
{
  public int DiffrenceFreq(String s)
  {
    int sCount=0;
    int cCount=0;
    char Arr[]=s.toCharArray();
    for(int i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='a')&&(Arr[i]<='z'))
      {
        sCount++;
      }
      if((Arr[i]>='A')&&(Arr[i]<='Z'))
      {
        cCount++;
      }
    }
    if((sCount-cCount)<0)
    {
     return -(sCount-cCount);
    }
    else
    {
        return (sCount-cCount);
    }
  }
}
class Program313
{
    public static void main(String asd[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sobj.nextLine();
      DiffrenceSC scobj=new DiffrenceSC();
      int iRet=scobj.DiffrenceFreq(str);
      System.out.println("Diffrence in frequencies of small and capital letters of "+str+" is "+iRet);
    }
}