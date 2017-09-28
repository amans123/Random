interface  i1
{
public void show();
}
class A implements i1
{
public void show()
{
System.out.println("Show of i1");
}
public static void main(String args[])
{
A a1=new A();
a1.show();

i1 b1=new A();
b1.show();

}
}
