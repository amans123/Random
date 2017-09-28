class A
{
public static void main(String args[])
{
int c=100;
int ar[]=new int[5];

try
{
int res=c/0;
System.out.println(res);
}
catch(ArithmeticException ae)
{
System.out.println(ae);
}
catch(ArrayIndexOutOfBoundsException aiobe)
{
System.out.println(aiobe);
}
catch(Exception e)
{
System.out.println(e);
}


 
}
  }