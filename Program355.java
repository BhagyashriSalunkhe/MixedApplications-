//Accept string from user and check whether the string is palindrome or not without considering its case
//ip="1abccBA1"
//op=true

import java.util.*;
class StringX
{
    public boolean ChkPallindrome(String str)
    {
        str=str.toLowerCase();
        char Arr[]=str.toCharArray();
        int iEnd=Arr.length-1;
        int iStart=0;
        boolean bFlag=true;
        while(iStart<iEnd)
        {
           
            if(Arr[iStart]!=Arr[iEnd])
            {
              bFlag=false;
              break;
            }
            iStart++;
            iEnd--;
        }
        return bFlag;
    }
}
class Program355
{
    public static void main(String as[])
    {
       Scanner sobj=new Scanner(System.in);
       System.out.println("Enter the string");
       String str=sobj.nextLine();
       StringX stobj=new StringX();
       boolean bRet=stobj.ChkPallindrome(str);
       if(bRet==true)
        {
        System.out.println(str+" is Pallindrome");
        }
       else
       {
        System.out.println(str+" is not Pallindrome");
       }
       
    }
}