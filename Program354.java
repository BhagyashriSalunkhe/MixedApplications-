//Accept string from user and reverse the contents of that string by toggling the case
//ip="aCBdef"
//op=FEDcbA
import java.util.*;
class StringX
{
    public char Arr[];
    public StringX(String str)
    {
        Arr=str.toCharArray();
    }
    public void ReverseString()
    {
     int iStart=0,iEnd=Arr.length-1;
     char cTemp;
     while(iStart<iEnd)
     {
        cTemp=Arr[iStart];
        Arr[iStart]=Arr[iEnd];
        Arr[iEnd]=cTemp;
        iStart++;
        iEnd--;
     }
    }

    public void DisplayToggle()
    {
       for(int i=0;i<Arr.length;i++)
       {
        if((Arr[i]>='a')&&(Arr[i]<='z'))
        {
          System.out.print(Arr[i]=(char)((int)Arr[i]-32));  
        }
        else if((Arr[i]>='A')&&(Arr[i]<='Z'))
        {
          System.out.print(Arr[i]=(char)((int)Arr[i]+32));  
        }
        else
        {
          System.out.print(Arr[i]=Arr[i]); 
        }
        
       }
       
    }
}
class Program354
{
    public static void main(String as[])
    {
       Scanner sobj=new Scanner(System.in);
       System.out.println("Enter the string");
       String str=sobj.nextLine();
       StringX stobj=new StringX(str);
       stobj.ReverseString();
       stobj.DisplayToggle();
       
    }
}