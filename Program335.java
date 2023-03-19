//Write a java program which accept  number from user and return difference between summation of even digits and summation of odd digits
//ip=2395
//op=-15(2-17)  
//ip=1018
//op=6(8-2)  

import java.util.*;

class Number
{
  public int iNo;

  public Number(int iValue)
  {
    iNo=iValue;
  }
  public int Differance()
  {
    if(iNo<0)
    {
        iNo=-iNo;
    }
    int iDigit=0,iEvenSum=0,iOddSum=0;
    while(iNo!=0)
    {
        iDigit=iNo%10;
        if(iDigit%2==0)
        {
          iEvenSum=iEvenSum+iDigit;
        }
       else
       {
         iOddSum=iOddSum+iDigit;
       }
        iNo=iNo/10;
    }
    return (iEvenSum-iOddSum);
  }
}
class Program335
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();

        Number nobj=new Number(iNo);
        int iRet=nobj.Differance();

        System.out.println("Diff between summation of even digit and odd digit in "+iNo+" is: "+iRet);
    }
}