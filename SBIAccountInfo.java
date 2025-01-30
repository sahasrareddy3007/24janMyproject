
public class SBIAccountInfo {
			
	    public static void main(String[] args) { 
	        // Create SBIAccount objects 
	        SBIAccount acc1 = new SBIAccount("KRK", "1234567890", 10000); 
	        SBIAccount acc2 = new SBIAccount("Jane Smith", "9876543210", 20000); 
	 
	        // Print account details 
	        System.out.println(acc1); 
	        System.out.println(acc2); 
	 
	        // Perform operations on account 1 
	        System.out.println("\nOperations on Account 1:"); 
	        acc1.deposit(5000); // Deposit 5000 
	        acc1.checkBalance(); // Check balance 
	        acc1.withDraw(3000); // Withdraw 3000 
	        acc1.checkBalance(); 
	        acc1.withDraw(15000); 
	 
	         
	        System.out.println("\nOperations on Account 2:"); 
	        acc2.deposit(10000); 
	        acc2.checkBalance(); 
	        acc2.withDraw(5000); 
	        acc2.checkBalance(); 
	    } 
	}



