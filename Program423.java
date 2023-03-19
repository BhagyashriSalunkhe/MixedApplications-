//Write java program which accept two arrays from user and copy the contents of that array into another array in reverse order and return new array


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
    public int[] ArrayConcate(int Arr1[],int iSize1,int Arr2[],int iSize2)
    {
        int ArrayC[]=new int[iSize1+iSize2];
        int j=0,k=0;
        for(int i=0;i<ArrayC.length;i++)
        {  
          if(j<iSize1)
          {
            ArrayC[i]=Arr1[j];
            j++;
          }
          else 
          {
            
            ArrayC[i]=Arr2[k];
            k++;
          }
        }
        return ArrayC;
    }
    public void  ArrayReverse(int ArrayC[])
    {
        int iStart=0;
        int iEnd=ArrayC.length-1;
        while(iStart<iEnd)
        {
            int iTemp=ArrayC[iStart];
            ArrayC[iStart]=ArrayC[iEnd];
            ArrayC[iEnd]=iTemp;
            iStart++;
            iEnd--;
        }
    }
}

class Program423
{
     public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      MyArray aobj=new MyArray();
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr1[]=new int[iSize1];
      aobj.Accept(Arr1);
      System.out.println("Enter Size of second Array"); 
      int iSize2=sobj.nextInt();
      int Arr2[]=new int[iSize2];
      aobj.Accept(Arr2);
      int iRArr[]=aobj.ArrayConcate(Arr1,iSize1,Arr2,iSize2);
       for(int i=0;i<iRArr.length;i++)
       {
        System.out.print(iRArr[i]+"\t");
       }
       System.out.println();
      aobj.ArrayReverse(iRArr);
      for(int j=0;j<iRArr.length;j++)
       {
        System.out.print(iRArr[j]+"\t");
       }
      
    }
}