class A
{
int a,b;
public A(int a,int b)
{
a=a;
b=b;
}
public void show()
{
System.out.println(a+" "+b);
}
public static void main(String args[])
{
A a1=new A(20,30);
a1.show();
}
}