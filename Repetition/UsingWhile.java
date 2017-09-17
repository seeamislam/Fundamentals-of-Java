//**********************************************************
// Assignment: J5A1
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

public class UsingWhile
{
  public static void main (String[] args)
  {
  
int counter = 0;
while (counter < 10)
{
counter++;
System.out.print(counter + " ");
}


System.out.println();

while (counter <=10 && counter > 0)
{
System.out.print(counter + " ");
counter--;
}

System.out.println();

counter = 1;
while (counter < 26)
{
System.out.print(counter + " ");
counter+=3;
}

System.out.println();

counter = 30;
while (counter > 11)
{
System.out.print(counter + " ");
counter-=4;
}

}
}