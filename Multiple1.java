interface  i1
{
public void show();
}
interface i2
{
public void disp();
}
class A implements i1,i2
{
public void show()
{
System.out.println("Show of i1");
}
public void disp()
{
System.out.println("Show of i2");
}
public static void main(String args[])
{
//A a1=new A();
//a1.show();

i1 b1=new A();
b1.show();

i2 b2=new A();
b2.disp();

}
}
