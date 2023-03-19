//Write java program which accept N numbers from user return product of all odd elements
//ip: N:6   Elements:15    66  3   70  10  88
// op=45
//ip: N:6   Elements:44    66  72   70  10  88
// op=0

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
  public int Logic()
  {
    int iMult=1;
    for(int i=0;i<Arr.length;i++)
    {
        if(Arr[i]%2!=0)
        {
          iMult=iMult*Arr[i];
        }
       
    }
    return iMult;
  }
}
class Program345
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int iSize=sobj.nextInt();
        MainLogic mlobj=new MainLogic(iSize);
        mlobj.Accept();
        mlobj.Display();
        int iRet=mlobj.Logic();
        if(iRet==1)
        {
          System.out.println("No odd elements in array");
        }
        else 
        {
         System.out.println("Product of all odd elements in array is: "+iRet);
        }
    }
}