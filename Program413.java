//Write java program which accept two arrays from user and display odd contents of each array
//ip=   2  9   6   5   2   3
//      45 6   12  18  23  4
//op=   9   5   3
//      45  23

import java.util.*;

class ArrayX
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
    public void DisplayArray(int Arr[])
    {
      System.out.println("Odd Elements of Array are:"); 
      for(int i=0;i<Arr.length;i++)
      {
        if(Arr[i]%2!=0)
        {
        System.out.print(Arr[i]+"\t");
        }
      }
      System.out.println();
    }
}

class Program413
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr1[]=new int[iSize1];
      ArrayX aobj=new ArrayX();
      aobj.Accept(Arr1);
      aobj.DisplayArray(Arr1);

      System.out.println("Enter Size of second Array"); 
      int iSize2=sobj.nextInt();
      int Arr2[]=new int[iSize2];
      aobj.Accept(Arr2);
      aobj.DisplayArray(Arr2);
      
    }
}