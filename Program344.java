//Write java program which accept N numbers from user and accept Range,Display all elements from that range
//ip: N:6   Elements:85    66  3   66  93  88
//start:60 End:90
// op=85 66   66  88
//ip: N:6   Elements:85    66  3   76  93  88
//start:30 End:50
// op=

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
  public void Logic(int iStart,int iEnd)
  {
    System.out.println("The numbers between "+iStart+" and "+iEnd+" are");
    for(int i=0;i<Arr.length;i++)
    {
        if((Arr[i]>iStart)&&(Arr[i]<iEnd))
        {
          System.out.print(Arr[i]+"\t");
        }
       
    }
    System.out.println();
  }
}
class Program344
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int iSize=sobj.nextInt();
        MainLogic mlobj=new MainLogic(iSize);
        mlobj.Accept();
        mlobj.Display();
        System.out.println("Enter the range of number");
        System.out.println("Enter the first number");
        int iStart=sobj.nextInt();
        System.out.println("Enter the last number");
        int iEnd=sobj.nextInt();
        mlobj.Logic(iStart,iEnd);
    }
}