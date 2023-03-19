//Write java program which accept N numbers from user and accept one another as NO,check whether NO is present or not
//ip: N:6  NO=66 Elements:85    66  3   66  93  88
//  op=true

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
  public boolean Logic(int iNo)
  {
    boolean bFlag=false;
    for(int i=0;i<Arr.length;i++)
    {
        if(Arr[i]==iNo)
        {
          bFlag=true;
          break;
        }
       
    }
    return bFlag;
  }
}
class Program341
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int iSize=sobj.nextInt();
        MainLogic mlobj=new MainLogic(iSize);
        mlobj.Accept();
        mlobj.Display();
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();
        boolean bRet=mlobj.Logic(iNo);
        if(bRet==true)
        {
            System.out.println(iNo+" is present in Array");
        }
        else
        {
            System.out.println(iNo+" is not present in Array");
        }
    }
}