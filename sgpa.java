

import java.util.*;
class abc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);		
int a[]=new int[6];
int b[]=new int[6];
int c[]=new int[6];
int m=0;
int i;
int n=0;
double z;
student p=new student();
System.out.println("Enter student name:");
String x=s.nextLine();
System.out.println("Enter student usn:");
String y=s.nextLine();
System.out.println("Enter student marks and the credits for respective subjects:");
for(i=0;i<6;i++)
{
a[i]=s.nextInt();
b[i]=s.nextInt();
}
for(i=0;i<6;i++)
{
if(a[i]>=90)
c[i]=(10*b[i]);
else if(a[i]<90 && a[i]>=75)
c[i]=(9*b[i]);
else if(a[i]<75 && a[i]>=60)
c[i]=(8*b[i]);
else if(a[i]<60 && a[i]>=40)
c[i]=(7*b[i]);
else
c[i]=0;
}
for(i=0;i<6;i++)
{
m=m+c[i];
}
for(i=0;i<6;i++)
{
n=n+b[i];
}
z=m/n;
p.info(x,y,z);
}
}
class student
{
public String name;
public String usn;
public double cgpa;
public void info(String x,String y,double z)
{
name=x;
usn=y;
cgpa=z;
System.out.println("student info:\nname="+name+"\nUSN="+usn+"\nCGPA="+cgpa);
}
}

