//Write a java program which accept  number from user and return the multiplication of all digits
//ip=2395
//op=270  
//ip=-1018
//op=8   

import java.util.*;

class Number
{
  public int iNo;

  public Number(int iValue)
  {
    iNo=iValue;
  }
  public int MultiDig()
  {
    if(iNo<0)
    {
        iNo=-iNo;
    }
    int iDigit=0,iMult=1;
    while(iNo!=0)
    {
        iDigit=iNo%10;
        if(iDigit==0)
        {
          iDigit=1;
        }
        iMult=iMult*iDigit;
        iNo=iNo/10;
    }
    return iMult;
  }
}
class Program334
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();

        Number nobj=new Number(iNo);
        int iRet=nobj.MultiDig();

        System.out.println("Multiplication of all digits in "+iNo+" are: "+iRet);
    }
}