import java.util.Arrays;
class ClassMinMaxUsingArraySort
  {
    public static void main ( String[] args )
    {
    int max;
    int min;
    int[] marks = {63, 33, 58, 90, 74, 80, 76, 58, 67, 80,
                  86, 78, 79, 62, 20, 70, 63, 82, 62, 85,
                  60, 50, 74, 77, 92, 65, 83, 71, 78, 55, 45, 58};
      Arrays.sort(marks);
      min = marks[0];
      max = marks[marks.length-1];
System.out.print("Marks: ");
   for (int i = 0; i < marks.length; i++)
   {
System.out.print(marks[i] + ", ");
   }
System.out.println();

      System.out.println("The minimum mark is: " + min);
      System.out.print("The maximum mark is: " + max);
	
    	}
}