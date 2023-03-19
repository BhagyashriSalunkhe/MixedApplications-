//Write java program which accept  marks of N students from user and display class of each student
//less than 35-fail
//less than 50-pass class
//less than 60-second class
//less than 70-first class
//greater than 70-first class with dictinction

import java.util.*;

class MyArray
{
   public void Accept(float Arr[])
   {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter Marks of "+Arr.length+ " Students");
    for(int i=0;i<Arr.length;i++)
      {
        Arr[i]=sobj.nextFloat();
      }
   }

   public void Percentage(float Arr[])
   {
    System.out.println("Class of each student on basis of marks");
     for(int i=0;i<Arr.length;i++)
      {
        if(Arr[i]<35)
        {
            System.out.println(Arr[i]+" Fail");
        }
        else if((Arr[i]>35)&&(Arr[i]<50))
        {
          System.out.println(Arr[i]+" Pass");  
        }
        else if((Arr[i]>50)&&(Arr[i]<60))
        {
          System.out.println(Arr[i]+" Second Class");  
        }
        else if((Arr[i]>60)&&(Arr[i]<70))
        {
          System.out.println(Arr[i]+" First Class");  
        }
        else if((Arr[i]>=70))
        {
          System.out.println(Arr[i]+" First class with distinction");  
        }
      }
    }
}

class Program434
{
    public static void main(String as[])
    {
     Scanner sobj=new Scanner(System.in);
     System.out.println("Enter the number of students");
     int iSize=sobj.nextInt();
     MyArray mobj=new MyArray();
     float Arr[]=new float[iSize];
     mobj.Accept(Arr);
     mobj.Percentage(Arr);
    }
}