import java.util.Scanner;

public class Main {
	boolean exit=false;
	Scanner sc = new Scanner(System.in);
	int selection;
	String currentChoice;
	
	public static void main(String[] args) {
		// Below the variables are defined for what the class needs 
		Main main = new Main();
		main.runMain();
		
        // Below will be the menu design 
	}
	
	public void runMain() {
		printHeader();
		
		// While exit is not true, continue
		while(!exit) {
			printMain();	
		}
	}
		
	private void printHeader() {
		System.out.println("+-----------------------------------------+"); 
        System.out.println(" Welcome to Northumberland College Library "); 
        System.out.println("Please choose a number for an option below:"); 
        System.out.println("+-----------------------------------------+"); 
	}
			
	// printMain method	
	private void printMain() {
		// Print menu
		System.out.println("1.Show all Students");
		System.out.println("2.Add Student");
		System.out.println("3.Show all books ");
		System.out.println("4.Add book");
		System.out.println("5.Search book");
		System.out.println("6.Upgrade book quantity");
		System.out.println("7.Check in");
		System.out.println("8.Check out");
		System.out.println("9.Need Help?");
		System.out.println("0.Exit menu");
		
		// Take user input and select option from menu
		selection = sc.nextInt();
		
		// Use selection in switch statement
		switch (selection)
        {		
			// View all students
        	case 1 :
        		System.out.println("Would you like to view all Students");
        		System.out.println("Do you want to continue? Type Yes / No");
        		if (sc.next().equalsIgnoreCase("no")) {
        			printHeader();
            		printMain();
        		}

        	// Add new student
            case 2 :
            	System.out.println("Would you like to add a new student");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
                
            // View all books
            case 3 :
            	System.out.println("Would you like to view all books?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
                
            // Add new book
            case 4 :
            	System.out.println("Would you like to add a new book?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
                
            // Search for book
            case 5 :
            	System.out.println("Would you like to Search a book?"); // needs switch case for int and String
            	System.out.println("Do you want to continue? Type Yes / No");
            	currentChoice = sc.next();
                if (currentChoice.equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
            	else if (currentChoice.equalsIgnoreCase("yes")) {
            		System.out.println("Select 1 to search by ISBN"); 
                	System.out.println("Select 2 to search by Author's full name");
                	exit = true;
                	break;
                }
                break;
           		    
            // Update quantity of book
            case 6 :
            	System.out.println("Would you like to Upgrade a books quantity?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
                
            // Check in book	
            case 7 :
            	System.out.println("Would you like to check in a book?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
               
            // Check out book		
            case 8 :
            	System.out.println("Would you like to check out a book?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
            		
            // Help with options
            case 9 :
            	System.out.println("Need Help with these options?");
            	System.out.println("Do you want to continue? Type Yes / No");
                if (sc.next().equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
                
                   		
            // 
            case 0 :
            	System.out.println("Are you sure you would like to exit? Type Yes / No");
                currentChoice = sc.next();  
                if (currentChoice.equalsIgnoreCase("no")) {
                	printHeader();
            		printMain();
                }
            	else if (currentChoice.equalsIgnoreCase("yes")){
            		System.out.println("+---------------------------------------+");
            		System.out.println("          Thank you for using            ");
            		System.out.println(" Northumberland College Library Systems  ");
            		System.out.println("+---------------------------------------+");
            		System.exit(0);
            	}
        }
	}
}
