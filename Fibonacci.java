//import java.util.*;
class Fact
{
public static void main(String[]args)
{
int a=0,b=1,s,i,sum;
System.out.println( a );
System.out.println( b );

//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();

for(i=0;i<10;i++)
{
s=a+b;
a=b;
b=s;

System.out.println( s );
}
}
}







