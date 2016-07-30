import java.util.Scanner;
public class Test {		  
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);   
	        List a = new List();          
	          
	       int choice;   
	             
	        do 
	        {
	            
	            System.out.println("1. Insert");
	            System.out.println("2. Remove");
	            System.out.println("3. display");
	            System.out.println("4.Exit");
	            choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 :
	                System.out.println("Enter integer element to enter");
	                a.insert( scan.nextInt() );
	                a.display();
	                break;                         
	            case 2 : 
	                try
	                {
	                	System.out.print("Delete Element::");
	                    System.out.println("Popped Element = "+ a.delete(scan.nextInt()));
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }  
	                a.display();
	                break;                         
	            case 3 : 
	                a.display();
	                break;                         
	            case 4 : 
	                System.out.println("Thank You");
	                break;                
	                           
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }           
	              
	                 
	 
	        } while (choice!=4); 
	        if(scan!=null)
	        	scan.close();
	        	
	    }
	    
	    	
	}