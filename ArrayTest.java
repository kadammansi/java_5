class ArrayTest{
public static void main(String args[])
{
try{
int arr[] = {1,3,4,5,6};
System.out.println(arr[5]);
System.out.println(arr[1]);
}
catch(Exception e1)
{
System.out.println("Array size is 5 and you are accesing 6th index");

}
}
}