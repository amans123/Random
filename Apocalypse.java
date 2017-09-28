//import java.util.*;
class Fact
{
public static void main(String[]args)
{
int i,j,k,l;

for(i=1;i<=3;i++)
{
 for(j=1;j<=3-i;j++)
  { 
    System.out.print(" ");
  }
   for(k=1;k<=i-1;k++)
    { 
      System.out.print("*");
       }
    for(l=1;l<=i;l++)
      {
        System.out.print("*");
      }
     System.out.println();

}
}
}

//Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();









