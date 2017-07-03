import java.util.*;
class Number
{
public static void main(String[] args)
{
int i,sum=0;
//Scanner sc=new Scanner(System.in);
//System.out.println("0 for male and 1 for female");
//int a=sc.nextInt();
for(i=13;i<=56;i++)
{
if(i%2==0)
{
sum=sum+i;
}
}
System.out.println(sum);
}

}