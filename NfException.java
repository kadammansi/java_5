class NfException{
public static void main(String args[])
{

String s = "M";
try{
int a =  Integer.parseInt(s);
System.out.println(a);

}
catch(Exception e)
{
System.out.println("String cannot be null");
}
//System.out.println(a);
}
}