import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,temp,num,small=0;
Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
      num=s.nextInt();
   System.out.println("enter "+num+" num");
   small=s.nextInt();
    for(i=1;i<num;i++)
{
  temp=s.nextInt();
  if(temp>small)
continue;
else
small=temp;
 }
System.out.println("smallest num is "+small);

	}
}
