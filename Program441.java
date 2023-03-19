//Write java program which accept array of character from user and replace each capital character with its corresponding small character
//ip= b N j B   R   b  A   d    G   G 
//op= b n j b   r   b  a   d    g   g  

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
    public void ArraySmall(char Arr[])
    {
        
      for(int i=0;i<Arr.length;i++)
      {
        if((Arr[i]>='A')&&(Arr[i]<='Z'))
        {
            char ch=Arr[i];
            ch=(char)(ch+32);
            Arr[i]=ch;
        }
        
      }
      
    }
      public void Display(char Arr[])
    {
      
      System.out.println("Elements of Array");  
      for(int i=0;i<Arr.length;i++)
      {
        System.out.print(Arr[i]+"\t");
      }
    }
   
}

class Program441
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int iSize=sobj.nextInt();
      char Arr[]=new char[iSize];
      MyArray mobj=new MyArray();
      mobj.Accept(Arr);
      mobj.ArraySmall(Arr);
      mobj.Display(Arr);

    }
}