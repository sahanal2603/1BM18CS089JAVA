import java.util.*;
import SEE.external;
import CIE.internal;
import CIE.student;


public class pkg
{
	public static void main(String args[])
	{
		external o1=new external();
		internal o2=new internal();
		System.out.println("\n**DETAILS**");
		System.out.println("\nName: "+o1.name+"\nUSN: "+o1.usn+"\nSem: "+o1.sem);
		System.out.println("Final marks: ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+": ");
			System.out.println((o1.mark[i]+o2.marks[i]));
		}
	}
}
