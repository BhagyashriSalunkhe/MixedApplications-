//Write java program which accept two arrays from user and display contents of each array
//ip=   2  9   7   5   2   3
//      9   3   5   5
//op=   2  9   7   5   2   3
//      9   3   5   5
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
      System.out.println("Elements of Array are:"); 
      for(int i=0;i<Arr.length;i++)
      {
        System.out.print(Arr[i]+"\t");
      }
      System.out.println();
    }
}

class Program411
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