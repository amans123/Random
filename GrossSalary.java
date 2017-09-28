import java.util.*;
class Salary
{
public static void main(String[] args)
{
int ta,da,hra,gs;
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary");
int bs=sc.nextInt();
ta=(bs*10)/100;
da=(bs*20)/100;
hra=(bs*40)/100;
gs=bs+ta+da+hra;
System.out.println("Gross salary is" + gs);
}
}
