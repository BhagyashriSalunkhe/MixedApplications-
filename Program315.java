//Write a java program which accept string from user and display it in reverse order
//ip="MarvellouS"//op="SuollevraM"

import java.util.Scanner;

class Reverse
{
  public char Arr[];
  public Reverse(String str)
  {
    Arr=str.toCharArray();
  }
  public void ReverseString()
  {
    int iStart=0;
    int iEnd=Arr.length-1;
    char iTemp;
    while(iStart<iEnd)
    {
        iTemp=Arr[iStart];
        Arr[iStart]=Arr[iEnd];
        Arr[iEnd]=iTemp;
        iStart++;
        iEnd--;
    }
  }
  public void Display()
  {
    for(int iCnt=0;iCnt<Arr.length;iCnt++)
    {
        System.out.print(Arr[iCnt]);
    }
    System.out.println();
  }
}
class Program315
{
    public static void main(String asf[])
    {
     Scanner sobj=new Scanner(System.in);
     System.out.println("Enter String");
     String str=sobj.nextLine();
     Reverse robj=new Reverse(str);
     robj.Display();
     robj.ReverseString();
     robj.Display();

    }
}