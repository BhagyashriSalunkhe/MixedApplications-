//Write a java program which accept  number from user and return the count of even digits
//ip=2395
//op=1  
//ip=-1018
//op=2   

import java.util.*;

class Number
{
  public int iNo;

  public Number(int iValue)
  {
    iNo=iValue;
  }
  public int CountEven()
  {
    int iDigit=0,EvenCount=0;
    while(iNo!=0)
    {
        iDigit=iNo%10;
        if(iDigit%2==0)
        {
          EvenCount++;
        }
        iNo=iNo/10;
    }
    return EvenCount;
  }
}
class Program331
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();

        Number nobj=new Number(iNo);
        int iRet=nobj.CountEven();

        System.out.println("Count of even digit in "+iNo+" are: "+iRet);
    }
}