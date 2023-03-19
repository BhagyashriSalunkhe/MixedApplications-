//Write a program which accept 2 string from user and check whether first N contents of two strings are equal or not
//note:If third parameter is greater than the size of second string then concate whole string after first string
//ip="Marvellous Infosystems"
//   "Marvellous Logic Building"
//    10
//op=true

import java.util.Scanner;
class StringDemo
{
    public String StrNCatX(String src,String dest,int iCnt)
    {
      char Arr1[]=src.toCharArray();
      char Arr2[]=dest.toCharArray();
      String str1="String is not same till the number you have entered";
      String str2="String is same till the number you have entered";
      if(iCnt>Arr2.length)
      {
        str1=src+" "+dest;
        return str1;
      }
      else
      {
         boolean bFlag=true;
         for(int i=0;i<iCnt;i++)
         {
           if(Arr1[i]!=Arr2[i])
           {
             bFlag=false;
             break;
           }
         } 
         if(bFlag==true)
         {
          return str2;
         }
         else
         {
          return str1;
         }
        
      }
    }
}

class Program353
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
    
      System.out.println("Enter First string");
      String str1=sobj.nextLine();

      System.out.println("Enter Second string");
      String str2=sobj.nextLine();

      System.out.println("Enter the number till check the string");
      int iNo=sobj.nextInt();

      StringDemo sdobj=new StringDemo();
      String sRet=sdobj.StrNCatX(str1,str2,iNo);

      System.out.println(sRet);
    }
}