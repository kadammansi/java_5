class ArrayTest1
{
public static void main(String args[])
{
try{
int arr[] = { 3,5,4,6,7};
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = a+b;
System.out.println("Addition is :" +c);
}
catch (Exception e1)
{
System.out.println("Enter two Argument from the console");
}
}
}
