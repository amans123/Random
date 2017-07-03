import java.util.*;
class Number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();

System.out.println("Enter second number");
int b=sc.nextInt();

System.out.println("Enter third number");
int c=sc.nextInt();

if((a>b) && (a>c))
{
System.out.println("largest = " + a);
}
else if((b>a) && (b>c))
{
System.out.println("largest = " + b);
}
else
{
System.out.println("largest = " + c);
}

}

}