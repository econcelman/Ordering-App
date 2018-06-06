import java.text.NumberFormat;
import java.util.Scanner;

public class Order {
	
	
	
	final static double MINZIP = 60441;
	final static double MAXZIP = 60451;
	final static double BESTZIP = 60446; //Flyers exact zip code - Delivery Available
	
	
	private int zipCode, orderMethod;
	private double deliveryFee;
	
	
	public void deliveryMethod() {
		
	zipCode = 60446;	
	deliveryFee = 0;
		
	Scanner scan = new Scanner(System.in);
	  
	    System.out.print("Please type \"1\" for pick-up, and \"2\" for delivery: ");
	  	orderMethod = scan.nextInt();
	  	
	   if (orderMethod == 1) {
	  		System.out.println("You have selected Pick-up.");
	  		System.out.println();
	  		deliveryFee = 0;
	  	   }
	   
	   if (orderMethod == 2) {
	   
	    
	    System.out.println("You have selected delivery");
	   	System.out.println();
		System.out.print("Please enter your zipcode: ");
	  	zipCode = scan.nextInt();
	    System.out.println();
	    
	  	
		System.out.println("The zipcode you entered is: " + zipCode);
	  	System.out.println();
	    
	  
	  		
	  			if (zipCode == BESTZIP)
	  				{
	  				System.out.println();
	  				System.out.println("Delivery Available.");
	  				System.out.println("Delivery Fee = $5.00");
	  				deliveryFee = 5.00;
	  				}
	  			if (zipCode >= MINZIP && zipCode <= 60445 || zipCode >= 60447 && zipCode <= MAXZIP)
	          		{
	  				System.out.println();
	  				System.out.println("Delivery Available with Extra Cost.");
	  				System.out.println("Delivery Fee = $7.00");
	  				deliveryFee = 7.00;
	          		}
	  			if (zipCode < MINZIP || zipCode > MAXZIP) {
	  				System.out.println("Delivery not available for this area.  Please pick up your order");
	  				deliveryFee = 0;
	  				}
	  			
	   		}
	  			
	}
	

		public void placeOrder() {
			
		Scanner scan = new Scanner(System.in);
			
			int choice, amount;
			double sum, orderTotal, total;
			final double TAX = 0.05;
			
			sum = 0;
			
			 System.out.println("Please select from the following menu");
			    System.out.println();

			    System.out.println();
			  	System.out.println("Enter \"1\" for a Flyers' Burger ($4.50)");
			  	System.out.println("Enter \"2\" for Flyers' Fries ($1.50)");
			  	System.out.println("Enter \"3\" for a Flyers' Drink ($1.50)");
			  	System.out.println("Enter \"4\" Flyers' Dessert ($3.00)");
			  	System.out.println();
			  	
			  	
			  
			  do
			  {
				  System.out.println();
				  System.out.println("Please enter your choice.  When you are done ordering, enter \"0\"");
				  choice = scan.nextInt();
				  scan.nextLine();
				  System.out.println();
				  
				  System.out.println();
				  
				  if(choice == 1) { 
					  System.out.println("how many would you like?");
					  amount = scan.nextInt();
					  scan.nextLine();
					  System.out.println("You ordered " + amount + " Flyers' Burger(s)");
					  sum += amount*4.50;
				  }
				  
				  
				  if(choice == 2) { 
					  System.out.println("how many would you like?");
					  amount = scan.nextInt();
					  scan.nextLine();
					  System.out.println("You ordered " + amount + " Flyers' Fries");
					  sum += amount*1.50;
				  }
				  
				  if(choice == 3) { 
					  System.out.println("how many would you like?");
					  amount = scan.nextInt();
					  scan.nextLine();
					  System.out.println("You ordered " + amount + " Flyers' Drink(s)");
					  sum += amount*1.50;
				  }
				  
				  if(choice == 4) { 
					  System.out.println("how many would you like?");
					  amount = scan.nextInt();
					  scan.nextLine();
					  System.out.println("You ordered " + amount + " Flyers' Dessert(s)");
					  sum += amount*3.00;
				  }
			
				  if(choice >=5) {
					  System.out.println("Invalid Entry. Please try Again");
				  }
				    
				    
			  }
			  while (choice != 0);
			  
			  orderTotal = sum;
			
			  
			NumberFormat fmt = NumberFormat.getCurrencyInstance();

			total = orderTotal + (orderTotal * TAX) + deliveryFee;
			  

			  
			System.out.println(); 
			System.out.println("Your Subtotal is: " + fmt.format(orderTotal));
			System.out.println("Delivery fee: " + fmt.format(deliveryFee));
			System.out.println("Your order total with tax and the delivery fee is: " + fmt.format(total));
			System.out.println();
			System.out.println("Thank you for choosing Flyers!");
		}
	
	
	
}

