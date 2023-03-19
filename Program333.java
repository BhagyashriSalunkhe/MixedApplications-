//Write a java program which accept  number from user and return the count of digits between 3 and 7
//ip=2395
//op=1  
//ip=-1018
//op=0   

import java.util.*;

class Number
{
  public int iNo;

  public Number(int iValue)
  {
    iNo=iValue;
  }
  public int Count()
  {
    int iDigit=0,Count=0;
    while(iNo!=0)
    {
        iDigit=iNo%10;
        if((iDigit>3)&&(iDigit<7))
        {
          Count++;
        }
        iNo=iNo/10;
    }
    return Count;
  }
}
class Program333
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();

        Number nobj=new Number(iNo);
        int iRet=nobj.Count();

        System.out.println("Count of digits between 3 and 7 in "+iNo+" are: "+iRet);
    }
}