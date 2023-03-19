//Write java program which accept  array from user and reverse each number of that array
//ip= 89    687  56  549  87    9
//op=98 786 65  945 78  9


import java.util.*;
class MyArray
{
     public void Accept(int Arr[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter the Elements of Array");  
      for(int i=0;i<Arr.length;i++)
      {
        Arr[i]=sobj.nextInt();
      }
      
    }
    public void ReverseEachElement(int Arr[])
    {
      System.out.println("Elements of array by Reversing each Elements of Array:"); 
      int iTemp=0;
      for(int i=0;i<Arr.length;i++)
      {
        iTemp=Arr[i];
        while(iTemp!=0)
        {
         int iDigit=iTemp%10;
         System.out.print(iDigit);
         iTemp=iTemp/10;
        }
        System.out.print("\t");
      }
      
    }
}

class Program431
{
     public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      MyArray aobj=new MyArray();
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr[]=new int[iSize1];
      aobj.Accept(Arr);
      aobj.ReverseEachElement(Arr);
      
    }
}