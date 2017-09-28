import java.util.*;
class Fact
{
public static void main(String[]args)
{
int i,fac=1;
System.out.println("Enter a number to find the factotial");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

for(i=a;i>=1;i--)
{
fac=fac*i;
}
System.out.println("factorial is " + fac);
}
}

