//**********************************************************
// Assignment: J5A2
//
// Description: 
//
// Author: Seeam
//
// Date Start: (Enter date started)
// Date Completed: (Enter date completed)
//
// Completion time: 14 minutes
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************

public class UsingFor
{
  public static void main (String[] args)
  {
  
int counter;

for (counter = 1; counter <= 10; counter++)
{
System.out.print(counter + " ");
}

System.out.println();


for (counter = 10; counter >= 1; counter--)
{
System.out.print(counter + " ");
}

System.out.println();

for (counter = 1; counter < 28; counter += 3)
{
System.out.print(counter + " ");
}

System.out.println();

for (counter = 30; counter > 12; counter -= 4)
{
System.out.print(counter + " ");
}


}
}