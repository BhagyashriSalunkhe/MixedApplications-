//Write java program which accept array of characters from user and accept one character .Return occurance of that character without considering case
//ip= b N e B   R   b  A   i    G   i   b
//    b
//op= 0 

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
    public int Occ(char Arr[],char ch)
    {
        int iOcc=-1;
        
      for(int i=0;i<Arr.length;i++)
      {
        if((Arr[i]==ch)||(Arr[i]==ch-32)||(Arr[i]==ch+32))
        {
            iOcc=i;
            break;
        }
      }
      return iOcc;
    }
}

class Program443
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize=sobj.nextInt();
      char Arr[]=new char[iSize];
      MyArray mobj=new MyArray();
      mobj.Accept(Arr);
      System.out.println("Enter the character to check its occurance");
      char ch=sobj.next().charAt(0);
      int bRet=mobj.Occ(Arr,ch);
      
      if(bRet>=0)
      {
      System.out.println(ch+ " is present in Array at index "+bRet);
      }
      else 
      {
       System.out.println(ch+ " is not present in Array");
      }
    }
}