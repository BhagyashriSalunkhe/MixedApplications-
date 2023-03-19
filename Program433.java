//Write java program which accept  array of characters from user and count number of capital characters
//ip= b  N   j   B   R   b   A   d   G   G
//op=6

import java.util.Scanner;

class MyArray
{
    public void Accept(char Arr[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the Elements of Array");  
      for(int i=0;i<Arr.length;i++)
      {
        char ch=sobj.next().charAt(0);
        Arr[i]=ch;
      }
    }
    public int ArrayCapital(char Arr[])
    {
        int iCnt=0;
      for(int i=0;i<Arr.length;i++)
      {
        if((Arr[i]>='A')&&(Arr[i]<='Z'))
        {
            iCnt++;
        }
      }
      return iCnt;
    }
}

class Program433
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize=sobj.nextInt();
      char Arr[]=new char[iSize];
      MyArray mobj=new MyArray();
      mobj.Accept(Arr);
      int iRet=mobj.ArrayCapital(Arr);

      System.out.println("Count of Capital characters in array are: "+iRet);
    }
}