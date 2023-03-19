//Write java program which accept two arrays from user and display minimum element of each array
//ip=   2   9   7   5   2   3
//      9   3   5   5
//op=  2    3

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
    public int DisplayMin(int Arr[])
    {
      int iMin=Arr[0];
      for(int i=0;i<Arr.length;i++)
      {
        if(Arr[i]<iMin)
        {
            iMin=Arr[i];
        }
      }
      return iMin;
    }
}

class Program422
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr1[]=new int[iSize1];
      ArrayX aobj=new ArrayX();
      aobj.Accept(Arr1);
      int iRet=aobj.DisplayMin(Arr1);
      System.out.println("Minimum element in First Array is: "+iRet);

      System.out.println("Enter Size of second Array"); 
      int iSize2=sobj.nextInt();
      int Arr2[]=new int[iSize2];
      aobj.Accept(Arr2);
      iRet=aobj.DisplayMin(Arr2);
      System.out.println("Minimum element in First Array is: "+iRet);
      
    }
}