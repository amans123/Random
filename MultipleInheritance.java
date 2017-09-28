interface i1
{
public void show();
}
interface i2
{
public void display();
}
abstract class A implements i1,i2
{
public void show()
{
System.out.println("show of i1");
}
}
class B extends A{
public void display()
{
System.out.println("display of a");
}
public static void main(String args[])
{
B obj=new B();
obj.show();
obj.display();
}
}
