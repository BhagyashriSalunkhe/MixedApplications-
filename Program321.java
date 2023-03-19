//Write a java program which accept N numbers from user and return diffrence between summation of even elements and summation of odd elements
//ip=N:6   Elements : 85    66  3   80  93  88
//op=53(234-181)

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iLength)
    {
        Arr=new int[iLength];
    }
    
    protected void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the "+Arr.length+" elements of array");
        for(int i=0;i<Arr.length;i++)
        {
           Arr[i]=sobj.nextInt();
        }
        System.out.println();
    }
    protected void Display()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println(Arr.length+" elements of array of array are :");
        for(int i=0;i<Arr.length;i++)
        {
           System.out.print(Arr[i]+"\t");
        }
        System.out.println(); 
    }
}
class MainLogic extends ArrayX
{
  public MainLogic(int iSize)
  {
    super(iSize);
  }
  public int Diffrence()
  {
    int iEvenSum=0,iOddSum=0;
    for(int i=0;i<Arr.length;i++)
    {
        if(Arr[i]%2==0)
        {
          iEvenSum=iEvenSum+Arr[i];
        }
        else 
        {
         iOddSum=iOddSum+Arr[i];
        }
    }
    return (iEvenSum-iOddSum);
  }
}
class Program321
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int iSize=sobj.nextInt();
        MainLogic mlobj=new MainLogic(iSize);
        mlobj.Accept();
        mlobj.Display();
        int iRet=mlobj.Diffrence();

        System.out.println("Difference between summation of even and odd element is:"+iRet);

    }
}