import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
public class fileHandling {
	 public static void main(String[] args) 
            {
                     try
                       {
                         File f1=new File("C:/Users/HP/Desktop/Prodapt/Hello.txt");
                         f1.createNewFile();
                         PrintWriter p =new PrintWriter(new FileOutputStream(f1,true));
                         
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Employee e=null;
			TreeSet<Employee> a= new TreeSet<Employee>(new Compar());
			int choice=0;
			int equals=0;
			do {
				System.out.println("\n1.Create \n2.Display \n3.Raise Salary \n4.Exit \nEnter Choice ");
			    choice=Integer.parseInt(br.readLine());		
				int d=0;		
				if(choice==4) {
					System.out.println("Exiting...!! \n");
					break;
				}
				switch(choice) {
				case 1:   
					    do {
					    	System.out.println("\nWhat kind of an employee you would like to create : ");
				            System.out.println("\n1.Clerk \n2.Programmer \n3.Manager \n4.Quit \nEnter Choice ");
				            d= Integer.parseInt(br.readLine());
                                             if(d==4)
                                              {
                                                System.out.println("Quitting....!! \n");
                                                  break;
                                               }
                                               else
                                                {
                                                   equals=0;
				 
				         		    switch(d) {
				         				case 1 :e=new Clerk();
				         					break;
				         				case 2 :e=new Programmer(); 	        
				         					break;
				         				case 3 :e=new Manager();
				         					break;
                                                                         
				         				default : System.out.println("Please enter a valid Choice \n ");
				         			       }
				         			for(Employee e1: a) 
                                                                {
				         				if(e1.equals(e)) 
                                                                        {
				         					equals=1;
				         					System.out.println("The record already exists..!!");
				         				}
				         				 
				         			}
				         			if(equals==0) a.add(e);
                                                 p.println("--------------------------------------------------------------------------");
                                                    p.println("Name is:"+e.name);
                                                    p.println("Age is:"+e.age);
                                                    p.println("Sal is:"+e.sal);
                                                    p.println("Designation is:"+e.Designation); 
                                                 p.println();
                                                 p.flush();
					    p.println("--------------------------------------------------------------------------");
                                               }
					    }while(d!=4);
					    break;
				case 2 :
					       try {
					    	   		if(e==null) throw new NullPointerException();
					    	   		for(Employee e1: a) 
					    		    e1.display();
					       }
					       catch(NullPointerException ne) {
					    	   System.out.println("No Records to display...!!");
					       }
					       break;
				case 3 :
							try {
									if(e==null) throw new NullPointerException();
									System.out.println("Salaries Raised..!!");
									for(Employee e1 : a) 
										e1.raiseSal();								
								}
							catch(NullPointerException ne) {
								System.out.println("You can raise the salary only if you've created an employee!!");
								}
							break;
				default : System.out.println("Enter a valid Choice ");
						}
				}while(choice!=4);
			         //scan.close();
                       }
                              catch(Exception ex)
                           {
                               System.out.println(ex);
                            }
	 }
}
