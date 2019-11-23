
package SEE;

import java.util.*;
import CIE.internal;

public class external extends internal
{
	public int mark[]=new int[5];
	Scanner x=new Scanner(System.in);
	public void externals()
	{
		System.out.println("Enter five subject external marks: ");
		for(int j=0;j<5;j++)
			mark[j]=x.nextInt();
	}
}

