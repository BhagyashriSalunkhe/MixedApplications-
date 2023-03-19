//Write java program which accept array of character from user and count number vowels
//ip= b N e B   R   b  A   i    G   i 
//op= 4 

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
    public int CountVowels(char Arr[])
    {
        int iCnt=0;
      for(int i=0;i<Arr.length;i++)
      {
        if((Arr[i]=='A')||(Arr[i]=='E')||(Arr[i]=='I')||(Arr[i]=='O')||(Arr[i]=='U')||(Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
        {
            iCnt++;
        }
      }
      return iCnt;
    }
}

class Program442
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize=sobj.nextInt();
      char Arr[]=new char[iSize];
      MyArray mobj=new MyArray();
      mobj.Accept(Arr);
      int iRet=mobj.CountVowels(Arr);

      System.out.println("Count of vowels in array is: "+iRet);
    }
}