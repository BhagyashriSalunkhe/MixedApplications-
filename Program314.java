//write a java program which accepts string from user and check whether it contains vowels in it or not
//ip="marvellous"//op=true
//ip="xyz"//op=false

import java.util.Scanner;
class Vowel
{
  public char Arr[];

  public Vowel(String str)
  {
    Arr=str.toCharArray();
  }
  public boolean ChkVowel()
  {
     boolean bFlag=false;
    for(int iCnt=0;iCnt<Arr.length;iCnt++)
    {
        if((Arr[iCnt]=='a')||(Arr[iCnt]=='e')||(Arr[iCnt]=='i')||(Arr[iCnt]=='o')||(Arr[iCnt]=='u')||(Arr[iCnt]=='a')||(Arr[iCnt]=='A')||(Arr[iCnt]=='E')||(Arr[iCnt]=='I')||(Arr[iCnt]=='O')||(Arr[iCnt]=='U'))
        {
           bFlag=true;
           break;
        }
    }
    return bFlag;
  }
}

class Program314
{
    public static void main(String asd[])
    {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sobj.nextLine();
      Vowel vobj=new Vowel(str);
      boolean bRet=vobj.ChkVowel();
      if(bRet==true)
      {
        System.out.println(str+" contains Vowels");
      }
      else
       {
        System.out.println(str+" dont have Vowels");
      }
    }
}