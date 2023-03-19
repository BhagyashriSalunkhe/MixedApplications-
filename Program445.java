//Write java program which accept array from user and display below pattern
//ip=   8   9   7   6   4   2   4
//op
/*
*       *       *       *       *       *       *       *
*       *       *       *       *       *       *       *       *
*       *       *       *       *       *       *
*       *       *       *       *       *
*       *       *       *
*       *
*       *       *       *   
*/ 
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
    public void DisplayPattern(int Arr[])
    {
     for(int i=0;i<Arr.length;i++)
     {
        for(int j=1;j<=Arr[i];j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
     }
    }
}

class Program445
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter Size of  Array"); 
      int iSize=sobj.nextInt();
      int Arr[]=new int[iSize];
      ArrayX aobj=new ArrayX();
      aobj.Accept(Arr);
      aobj.DisplayPattern(Arr);
     
      
    }
}