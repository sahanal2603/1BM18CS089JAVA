import java.util.*;
class box
{
 public int length;
 public int breadth;
 public void read_data(int a,int b)
 {
  length=a;
  breadth=b;
  System.out.println("length="+length);
  System.out.println("breadth="+breadth);
 }
 public void display_area()
 {
  System.out.println(length*breadth);
 }
}
class a
{
 public static void main(String args[])
 {
  box a1=new box();
  a1.read_data(2,3);
  a1.display_area();
 }
}
