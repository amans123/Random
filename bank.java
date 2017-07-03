import java.util.*;
class Number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("0 for male and 1 for female");
int a=sc.nextInt();

if(a==0)
{
System.out.println("male");
}
else
{
System.out.println("female");
}

System.out.println("Enter age");
int b=sc.nextInt();

if(b>50)
{
System.out.println("Senior citizen");
}
else
{
System.out.println("Not senior citizen");
}

if(a==0 && b>50)
{
System.out.println("The roi is 12%");
}
else if(a==0 && b<50)
{
System.out.println("The roi is 10%");
}

else if(a==1 && b>50)
{
System.out.println("The roi is 15%");
}

else if(a==1 && b<50)
{
System.out.println("The roi is 13%");
}



}

}