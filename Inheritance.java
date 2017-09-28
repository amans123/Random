class A
{
public void show()
{
System.out.println("HEllo from A class A");
}
 }
class B extends A
{
public void show()
{
System.out.println("Hello From A class B");
}
public void display() 
{
System.out.println("Hello from B");
}


public static void main(String args[])
{
B obj=new B();
obj.display();
obj.show();
}
}

