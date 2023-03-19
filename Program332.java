//Write a java program which accept  number from user and return the count of odd digits
//ip=2395
//op=3  
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
  public int CountOdd()
  {
    int iDigit=0,OddCount=0;
    while(iNo!=0)
    {
        iDigit=iNo%10;
        if(iDigit%2!=0)
        {
          OddCount++;
        }
        iNo=iNo/10;
    }
    return OddCount;
  }
}
class Program332
{
    public static void main(String as[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number");
        int iNo=sobj.nextInt();

        Number nobj=new Number(iNo);
        int iRet=nobj.CountOdd();

        System.out.println("Count of odd digit in "+iNo+" are: "+iRet);
    }
}