import java.util.*;
class Number
{
public static void main(String[] args)
{
int t;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();

//Scanner sd=new Scanner(System.in);
System.out.println("Enter second number");
int b=sc.nextInt();

//Scanner se=new Scanner(System.in);
System.out.println("Enter third number");
int c=sc.nextInt();

//Scanner sf=new Scanner(System.in);
System.out.println("Enter fourth number");
int d=sc.nextInt();

//Scanner sg=new Scanner(System.in);
System.out.println("Enter fifth number");
int e=sc.nextInt();

t=a+b+c+d+e;
System.out.println("Total is " + t);
avg=t/5.0;
System.out.println("Average is " + avg);

}

}