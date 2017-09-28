class A
{
public void show()
{
System.out.println("HEllo from A");
}
 }
class C extends A
{
public void display() 
{
System.out.println("Hello from B");
}


public static void main(String args[])
{
B obj=new B();
obj.display();
obj.show();
obj.look();
}
}

class B extends C
{
public void look()
{
System.out.println("hello from c");
}
}
