import java.util.Scanner;

public class testbankaccount
{
	
    
    public static void main(String[] args)
    {
	int option;
	int money;
	
	
	Scanner key=new Scanner(System.in);

	System.out.println("Press (1,2,3)");
	System.out.println("(1) For Cash WithDrawl");
	System.out.println("(2) For Cash Deposit");
	System.out.println("(3) For Information");
	
	option = key.nextInt(); 

	//Variable Declaration
	
	
	//Variable Initialization
        bankAccount access = new bankAccount();

	switch(option)
	{
		case 1:
		{
		
		System.out.println("Please Enter Amount for Cash WithDrawl:");
		money = key.nextInt();
		access.cashWithDrawl(money);
		access.updateBalance();
		access.remainingBalance();
		return;
		
		}
		
		case 2:
		{
		
		System.out.println("Please Enter Amount for Cash Deposit:");
		money = key.nextInt();
		access.cashDeposit(money);
		access.updateBalance();
		access.remainingBalance();
		return;
		
		}

		case 3:
		{
		
		access.updateBalance();
		access.remainingBalance();
		return;
		
		}
	}

    }	

}
