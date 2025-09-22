import java.util.*;
class FinallyTest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
try{
int c = a/b;
System.out.println("Division is  :"+c);
}
catch(Exception e)
{
System.out.println("Can not divided by zero");
}
 finally
{
System.out.println("The inputs are : "+a+ " & " +b);
}
}
} 