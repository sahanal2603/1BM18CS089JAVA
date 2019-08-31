import java.util.*;
class Book
{
 public void read();
 {
  String name;
  String author;
  String price;
  String no_of_pages;
  public void get_data();
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Book name:");
   this.name=s.next();
   System.out.println("Enter Author name:");
   this.author=s.next();
   System.out.println("Enter Price of book:");
   this.price=s.next();
   System.out.println("Enter no. of pages in book:");
   this.no.of.pages=s.next();
  }
  public String toString()
  {
   String s=new String();
   s="Book Description \n1.Book name: "+this.name+"\n2.Author name: "+this.author+"\n3.Price: "+this.price+"\n4.No.of pages:               "+this.no.of.pages+"";
 return s;
}
}

class lab4
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of objects: ");
  int n=s.nextInt();
  Book b[]=new Book(n);
  for(int i=0;i<n;i++)
  {
    b[i]=new Book();
  }
  for(int i=0;i<n;i++)
  {
    System.out.println("Enter"+i+"book details: ");
    b[i].get_data();
    System.out.println(b[i]);
  }
 }
}
