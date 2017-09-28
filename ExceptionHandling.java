class MyException extends Exception
{
public MyException(String S)
{
super(S);
}
}

class ABC
{
public static void validate(int num) throws MyException
{
if(num<18)
{
throw new MyException("not valid");
}
else
{
System.out.println("It is ok");
}
}
public static void main(String args[])
{
try
{
validate(15);
}
catch(Exception e)
{
System.out.println(e);

}

}
}