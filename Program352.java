//Write a program which accept 2 string from user and check whether contents of two strings are equal or not
//ip="Marvellous Infosystems"
//   "Marvellous Infosystems"
//op=true

import java.util.Scanner;
class StringDemo
{
    public boolean ChkEqaul(String str1,String str2) 
    {
      char Arr1[]=str1.toCharArray();
      char Arr2[]=str2.toCharArray();
      boolean bFlag=true;
      
      if(Arr1.length!=Arr2.length)
      {
        return false;
      }
     
      for(int i=0;i<Arr1.length-1;i++)
      {
        if(Arr1[i]!=Arr2[i])
        {
          bFlag=false;
          break;
        }
      } 
      return bFlag;
    }
}

class Program352
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
    
      System.out.println("Enter First string");
      String str1=sobj.nextLine();

      System.out.println("Enter Second string");
      String str2=sobj.nextLine();
      
      StringDemo sdobj=new StringDemo();
      boolean bRet=sdobj.ChkEqaul(str1,str2);
      
      if(bRet==true)
      {
      System.out.println(str1+", "+str2+" are same strings");
      }
      else 
      {
      System.out.println(str1+", "+str2+" are not same strings");
      }
    }
}