class ClassAverageUsingArray
  {
    public static void main ( String[] args )
    {
    double sum = 0;
    double average;
    int max = 0;
    int min = 100;
    int[] marks = {63, 33, 58, 90, 74, 80, 76, 58, 67, 80,
                  86, 78, 79, 62, 20, 70, 63, 82, 62, 85,
                  60, 50, 74, 77, 92, 65, 83, 71, 78, 55, 45, 58};
   for (int i = 0; i < marks.length; i++)
   {
   sum = sum + marks[i];
   }
   average = Math.round((sum/marks.length)*100)/100.0;
   System.out.println("The average mark is: " + average);
   
   for (int i = 0; i <marks.length; i++)
   {
   max = Math.max(max, marks[i]);
   min = Math.min(min, marks[i]);
   }
      System.out.println("The minimum mark is: " + min);
      System.out.print("The maximum mark is: " + max);
	
    	}
}