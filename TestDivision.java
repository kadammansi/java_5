//Exception Handling
public class TestDivision
{
public static void main(String args[])
{
int a=4 ,b=0;
int d = a-b;
System.out.println("Substraction is :"+d);
try{
int c= a/b;
}
catch(Exception e1)
{
System.out.println("You can not divided by zero" +e1);
}
int e = a+b;
System.out.println("Addition is :" +e);

}
}



