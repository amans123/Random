class A
{
static int count=0;
public A()
{
count ++;
System.out.println(count);
}

public static void main(String args[])
{
A a1=new A();
A a2=new A();
A a3=new A();
}
}
