public class TryCatch
{
 public static void main(String args[])
 {
   int arr[]={8,6,4,2,5};
   System.out.println(arr[3]);
   System.out.println(arr[1]);

   try
   {
      System.out.println(arr[5]);
   }
   catch(Exception e)
   {
     System.out.println("XYZ");
   }
   System.out.println(arr[1]);

 }
}