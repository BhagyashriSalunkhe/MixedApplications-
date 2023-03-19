//Write java program which accept N numbers from user and accept one another as NO,return index of last occurance of that NO
//ip: N:6  NO=66 Elements:85    66  3   66  93  88
//  op=3
//ip: N:6  NO=12 Elements:85   11  3   15  11  111
//  op=-1

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
  public int Logic(int iNo)
  {
     int iOcc=-1;
    for(int i=Arr.length-1;i>=0;i--)
    {
        if(Arr[i]==iNo)
        {
          iOcc=i;
          break;
        }
       
    }
    return iOcc;
  }
}
class Program343
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
        int iRet=mlobj.Logic(iNo);
        if(iRet==-1)
        {
            System.out.println(iNo+" is not present in array");
        }
        else 
        {
            System.out.print(iNo+" is present in array and it last occured  at "+iRet+" index");
        }
        
    }
}