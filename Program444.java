//Write java program which accept array of character from user and return difference between freqency of capital and frequency of small characters
//ip= b N e B   R   b  A   I  O    G   i 
//op= 3(7-4) 

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
    public int DifferanceSC(char Arr[])
    {
      int icCnt=0;
      int isCnt=0;
      for(int i=0;i<Arr.length;i++)
      {
        if((Arr[i]>='A')&&(Arr[i]<='Z'))
        {
            icCnt++;
        }
        if((Arr[i]>='a')&&(Arr[i]<='z'))
        {
            isCnt++;
        }
      }
      return (icCnt-isCnt);
    }
}

class Program444
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize=sobj.nextInt();
      char Arr[]=new char[iSize];
      MyArray mobj=new MyArray();
      mobj.Accept(Arr);
      int iRet=mobj.DifferanceSC(Arr);

      System.out.println("Differance between Capital and Small characters in array are: "+iRet);
    }
}