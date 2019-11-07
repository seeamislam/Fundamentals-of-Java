class SumArrays
  {
    public static void main ( String[] args )
    {
	  int[] valA = { 13, -22, 82, 17};
	  int[] valB = {-12, 24, -79, -13};
	  int[] sum = new int[4];
	  sum[0] = valA[0] + valB[0]; 
     sum[1] = valA[1] + valB[1];
     sum[2] = valA[2] + valB[2]; 
     sum[3] = valA[3] + valB[3]; 
	  System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	  
	  //
	  // Now repeat the process above using a for loop.
	  //
	  int[] sumL = new int[4];
	  
	  System.out.println( "index -- sum");
	  for ( int i = 0; i < 4 ; i++)
	  {
	    sumL[i] = valA[i] + valB[i] ;
	    System.out.println( i + " -- " + sumL[i] );
	  }
	}
}