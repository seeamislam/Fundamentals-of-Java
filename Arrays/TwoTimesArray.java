class TwoTimesArray
 {
   public static void main ( String[] args )
   {
     int[] val = {13, -4, 82, 17};
     int[] twice = new int[4];
     twice[0] = val[0] *2 ; 
     twice[1] = val[1] *2 ;
     twice[2] = val[2] *2 ;
     twice[3] = val[3] *2 ;
     System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
     System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
     //
     // Now repeat the process above using a for loop.
     //
     int[] twiceL = new int[4];
     System.out.println( "index -- Original -- New Array");
     for ( int i = 0; i < 4; i++)
     {
       twiceL[i] = val[i] * 2; 
       System.out.println( i + " -- " + val[i] + " -- " + twiceL[i] );
      }
   }
 }