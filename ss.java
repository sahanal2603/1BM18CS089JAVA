import java.util.*;
class account
{
 public int id;
 public String name;
 public String ano;
 public double balance;
 public String type;
 public void accept_data()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter id,name,account number,balance and type of account");
  id=s.nextInt();
  name=s.next();
  ano=s.next();
  balance=s.nextDouble();
  type=s.next();
 }
 public void si()
 { 
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no. of years and rate of interest");
  int t=s.nextInt();
  int r=s.nextInt();
  double si=((balance*t*r)/100);
  System.out.println("SI="+si);
 }
}
 
class abc
{
 public static void main(String args[])
 {
  account a1=new account();
  a1.accept_data();
  a1.si();
 }
}

