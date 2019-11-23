
package CIE;
import java.util.*;

public class internal
{
	public int marks[]=new int[5];
	Scanner a=new Scanner(System.in);
	public void internals()
	{
		System.out.println("Enter five subject internal marks: ");
		for(int i=0;i<5;i++)
		{
			marks[i]=a.nextInt();
		}
	}
}

