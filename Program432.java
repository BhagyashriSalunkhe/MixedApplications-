//Write java program which accept  array from user and replace each member with summation of its digit
//ip= 89    687  56  549  87    9
//op=17  21  11  18 15  9


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
    public int[] ReplacingSummation(int Arr[])
    {
      
      int iTemp=0;
      for(int i=0;i<Arr.length;i++)
      { 
        int iSum=0;
        iTemp=Arr[i];
        while(iTemp!=0)
        {
         int iDigit=iTemp%10;
         iSum=iSum+iDigit;
         iTemp=iTemp/10;
        }
        Arr[i]=iSum;
        
      }
      return Arr;
    }
}

class Program432
{
     public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      MyArray aobj=new MyArray();
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr[]=new int[iSize1];
      aobj.Accept(Arr);
      int RArr[]=new int[iSize1];
      RArr=aobj.ReplacingSummation(Arr);

      System.out.println("Elements of Array of array After replacing with summation ");  
      for(int i=0;i<RArr.length;i++)
      {
        System.out.print(RArr[i]+"\t");
      }
      
    }
}