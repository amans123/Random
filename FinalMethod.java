class A
{
int count=0;
final void show()
{
System.out.println("A");
}
}
class B extends A
{
void show()
{
System.out.println("B");
}

public static void main(String args[])
{
A a1=new A();
a1.show();
}
}