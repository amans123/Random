class A
{
public static void main(String args[])
{
int ar[]=new int[5];
try
   {
      ar[5]=100;
      System.out.println(ar[5]);
    }
catch(Exception e)
   {
    System.out.println(e);
   }
 finally{
    System.out.println("HELLO");
   }
}
  }