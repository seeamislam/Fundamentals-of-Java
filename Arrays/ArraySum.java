class ArraySum
 {
   public static void main ( String[] args )
   {

     int[] intArray1 = {0, 1, 2, 3};
     int intSum1 = intArray1[0] + intArray1[1] + intArray1[2] + intArray1[3];
     System.out.println( "Sum of all numbers in first array = " + intSum1 );


     // Now repeat the process above using a for loop.

     int[] intArray2 = {4, 5, 6, 7};
     int intSum2 = 0;
     
     for ( int i = 0 ; i < 4 ; i++)
     {
       intSum2 += intArray2[i];
     }
     System.out.println( "Sum of all numbers in second array = " + intSum2 );
   }
 }