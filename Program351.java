//Write a java program which accepts 2 strings from user and concat N characters of second string after first string.Value of N should be accepted from user
//note:if third parameter is greater than the size of second string then concat whole string after first string
//ip="Marvellous Infosystems"
//   "Logic Building"
//    5
//op="Marvellous Infosystems Logic"
import java.util.Scanner;
class StringDemo
{
    public String StrNCatX(String src,String dest,int iCnt)
    {
      char Arr[]=dest.toCharArray();
      String str=src+" ";
      if(iCnt>Arr.length)
      {
        str=src+" "+dest;
        return str;
      }
      for(int i=0;i<iCnt;i++)
      {
        str=str + Arr[i];
      } 
      return str;
    }
}

class Program351
{
    public static void main(String as[])
    {
      Scanner sobj=new Scanner(System.in);
    
      System.out.println("Enter First string");
      String str1=sobj.nextLine();

      System.out.println("Enter Second string");
      String str2=sobj.nextLine();

      System.out.println("Enter the number till concate the string");
      int iNo=sobj.nextInt();

      StringDemo sdobj=new StringDemo();
      String sRet=sdobj.StrNCatX(str1,str2,iNo);

      System.out.println("String after concatination is " +sRet);
    }
}