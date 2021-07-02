import java.util.Scanner;
import java.util.Comparator;
abstract class Employee
   {
     String name;
     int age;
     int sal;
     String Designation;
     
     Scanner sc=new Scanner(System.in);

      public Employee()
         {
           
        System.out.println("Enter your name:");
         name=sc.next().toUpperCase();
        System.out.println("Enter your age:");
         age=sc.nextInt();
         }
     
       public abstract void raiseSal();

        public void display()
         {
         System.out.println(" Name        :"+this.name);
         System.out.println(" Age         :"+this.age);
         System.out.println(" Sal         :"+this.sal);
        System.out.println(" Designation :"+this.Designation);
         }
         
     
    public boolean equals (Object obj)
	{
		Employee a= (Employee)obj;
		if(this.name.equals(a.name) && this.age==(a.age)&& this.Designation.equals(a.Designation) && this.sal==a.sal)
	        return true;
		else return false;
	}
 }
