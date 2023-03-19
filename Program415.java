//Write java program which accept two arrays from user and display summation of each array
//ip=   2   9   7   5   2   3
//      9   3   5   5
//op=  28   22

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
    public int DisplaySummation(int Arr[])
    {
      int iSum=0;
      for(int i=0;i<Arr.length;i++)
      {
        iSum=iSum+Arr[i];
      }
      return iSum;
    }
}

class Program415
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr1[]=new int[iSize1];
      ArrayX aobj=new ArrayX();
      aobj.Accept(Arr1);
      int iRet=aobj.DisplaySummation(Arr1);
      System.out.println("Summation of all elements in array is: "+iRet);

      System.out.println("Enter Size of second Array"); 
      int iSize2=sobj.nextInt();
      int Arr2[]=new int[iSize2];
      aobj.Accept(Arr2);
      iRet=aobj.DisplaySummation(Arr2);
      System.out.println("Summation of all elements in array is: "+iRet);
      
    }
}