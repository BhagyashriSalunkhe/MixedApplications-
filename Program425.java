//Write java program which accept two arrays from user and check whether that array and its elements are palindrome or not
//ip= 11    252  387783  252  11
//op=true
//ip= 11    252  387783  77  11
//op=false

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
    public boolean ChkPallindrome(int Arr[])
    {
        boolean bFlag=true;
        int iStart=0;
        int iEnd=Arr.length-1;
        while(iStart<iEnd)
        {
            if(Arr[iStart]!=Arr[iEnd])
            {
                bFlag=false;
            }
            iStart++;
            iEnd--;
        }
        return bFlag;
    }
}

class Program425
{
     public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      MyArray aobj=new MyArray();
      System.out.println("Enter Size of first Array"); 
      int iSize1=sobj.nextInt();
      int Arr1[]=new int[iSize1];
      aobj.Accept(Arr1);
      boolean bRet=aobj.ChkPallindrome(Arr1);
      if(bRet==true)
      {
        System.out.println("First Array is pallindrome ");
      }
      else 
      {
         System.out.println("First Array is not pallindrome ");
      }
      System.out.println("Enter Size of second Array"); 
      int iSize2=sobj.nextInt();
      int Arr2[]=new int[iSize2];
      aobj.Accept(Arr2);
      bRet=aobj.ChkPallindrome(Arr2);
      if(bRet==true)
      {
        System.out.println("Second Array is pallindrome ");
      }
      else 
      {
         System.out.println("Second Array is not pallindrome ");
      }
      
      
    }
}