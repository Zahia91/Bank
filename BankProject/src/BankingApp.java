

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class BankingApp {
		

		public static void main(String[] args) {
			
					AccountBank account = new AccountBank();
					
					account.setfName("John");
					account.setlName("Smith");
					account.setAccountBalance(5000);
					account.setPinNumber(4209);
					
					
					int pinNumber = 0 ;
					while(pinNumber != account.getPinNumber()) {
						
						Scanner scan = new Scanner(System.in);
						
						System.out.println("Please enter your pin number : ");
						
						
						try {
						pinNumber = scan.nextInt();
						
						
						}
						
						catch(InputMismatchException ex) {
							
							System.out.println("Please enter a number ");
						}
						if (pinNumber == account.getPinNumber()) {
							
							System.out.println("Welcome " + account.getfName() + " " +  account.getlName() + " to your Atm\n");
							System.out.println(" Please choose one option\n1widhdraw\n2Deposit\n3check Balance ");
							
							Scanner inputUser = new Scanner(System.in);
							
							int options = inputUser.nextInt();
							
								
							if (options == 1) {
								
								System.out.println("Please enter the amount to withdraw ");
								
								Scanner withdrawMoney = new Scanner(System.in);
								
								double withdraw = withdrawMoney.nextDouble();
								
								System.out.println("Thanks "+ "" + account.getfName()+ "" + account.getlName() +" " + "for your visit today ");
								
								 double balanceafterwithdraw = account.getAccountBalance() - withdraw ;
								 
								 System.out.println("Your account balance is " + balanceafterwithdraw);
								
							}
							
							else if (options == 2) {
								
								System.out.println("Please enter the amount to deposit ");
								
								Scanner depositMoney = new Scanner(System.in);
								Double deposit = depositMoney.nextDouble();
							
								System.out.println("Thanks" + " " + account.getfName() + " " + account.getlName() + " " + " for your visit today");
								
								double balanceAfterDeposit = account.getAccountBalance() + deposit;
								System.out.println("Your account balance is " + balanceAfterDeposit);
							}
							
							
							else if (options == 3) {
								
								System.out.println(" Your account Balance is " + account.getAccountBalance());
							}
							
							
							
							
							}
						else {
							
							System.out.println("Wrong password try again\n ");
							
						}
						
						}
						
					
					}
					
					
	}			
						
					
					
					
					
					
					
					
					
					
					
					
				
				
				
				
				
				

			
		


	




	