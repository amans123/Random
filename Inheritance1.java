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
//obj.display();
obj.show();
obj.look();
C obj1=new C();
obj1.display();
obj1.show();
//obj.look();

}
}

class B extends A
{
public void look()
{
System.out.println("hello from c");
}
}
