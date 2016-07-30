import java.util.Scanner;


public class Test {

	
		  
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);   
	          
	        Queue a = new Queue();          
	          
	       int choice;   
	             
	        do 
	        {
	            
	            System.out.println("1. enqueue");
	            System.out.println("2. dequeue");
	            System.out.println("3. display");
	            System.out.println("4.Exit");
	            System.out.println("5.getsize");
	            choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 :
	                System.out.println("Enter integer element to enter");
	                a.enQueue( scan.nextInt() );
	                a.display();
	                break;                         
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = "+ a.deQueue());
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
	            case 5:
	            default : 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }           
	              
	                 
	 
	        } while (choice!=4); 
	        if(scan!=null)
	        	scan.close();
	        	
	    }
	    
	    	
	}