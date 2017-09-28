class ABC
{
public void p()
{
int res=100/0;
System.out.println(res);
}

public void m()
{
p();
}

public void n()
{
m();
}

public static void main(String args[])
{
ABC a1=new ABC();
try
{
a1.n();
}
catch(Exception e)
{
System.out.println(e);
}
}
}