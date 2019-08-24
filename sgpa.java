import java.util.*;
class veh
{
 public int model;
 public int year;
 public void display_advice(int x,int y)
 {
   year=y;
   if(year<=10)
    System.out.println("Service");
   else
    System.out.println("Change");
 }
}
class a
{
 public static void main(String args[])
 {
  veh a1=new veh();
  a1.display_advice(4,12);
 }
}
