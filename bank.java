package bank;
import java.util.Scanner;
public class bank {
    int inibal=100000;
    void deposit()
    {
    	int bal;
    	int amount;
    	Scanner sc=new Scanner(System.in);
    	amount=sc.nextInt();
    	System.out.println("enter the account holder name");;
    	String name=sc.next();
    	System.out.println("enter the account number");;
    	int accno=sc.nextInt();
    	inibal=inibal+amount;
    	System.out.println("the existing balance is:"+inibal);
    }
    void withdraw()
    {
    	int bal;
    	int balance;
    	int amount;
    	Scanner sc=new Scanner(System.in);
    	amount=sc.nextInt();
    	System.out.println("enter the account holder name");;
    	String name=sc.next();
    	System.out.println("enter the account number");;
    	int accno=sc.nextInt();
    	inibal=inibal-amount;
    	System.out.println("the existing balance is:"+inibal);
    }
    void fixeddeposit()
    {
    	System.out.println("You have choosen our FIXED DEPOSIT service");
    	System.out.println("Here are our rate of interest plans per year");
    	System.out.println("Tenure   RI regular deposit per year           citizens") ;
    	System.out.println("007 days to 045 days 		        5.50%		         6.00%");
    	System.out.println("046 days to 179 days		        6.50%		         7.00%");
    	System.out.println("180 days to 210 days		        6.50%                 7.00%");
    	System.out.println("211 days to 364 days		        6.50%                  7.00%");
    	System.out.println("1 year                              6.50%                7.00%");
    	System.out.println("1 year 1 day to 1 year 364 days     6.50%                7.00%");
    	System.out.println("2 years to 10 years 6.25% 6.7s% ");
    	System.out.println("enter the amount");
        Scanner input=new Scanner(System.in);
        int amount=input.nextInt();
        System.out.println("enter the duration");
        int duration=input.nextInt();
        if(duration<=45)
        {
        	System.out.println("the rate of interest is"+5.50+"%"+6.00+"%");
        }
        else if(duration>=45 && duration<=179)
        {
        	System.out.println("the rate of interest is"+6.50+"%"+7.00+"%");
        }
        else if(duration>=180 && duration<=210)
        {
        	System.out.println("the rate of interest is"+6.50+"%"+7.00+"%");
        }
        else if(duration>=211 && duration<=364)
        {
        	System.out.println("the rate of interest is"+6.50+"%"+7.00+"%");
        }
        else if(duration>=365)
        {
        	System.out.println("therate of interest is"+6.50+"%"+7.00+"%");
        }
        else if(duration>=366 && duration<=1729)
        {
        	System.out.println("therate of interest is"+6.50+"%"+7.00+"%");
        }
        else if(duration>=730 && duration<=3650)
        {
        	System.out.println("therate of interest is"+6.50+"%"+6.75+"%");
        }
        System.out.println("enter the owner name");
        String owner=input.next();
        System.out.println("enter the successor name");
        String successor=input.next();
        System.out.println("The fixed deposit of rupees:"+amount+"is kept under the name of"+owner+" and successor is "+successor+"for the duration of"+duration+"days");
        System.out.println("in  STATE BANK OF INDIA");;
        System.out.println("********************THANK YOU********************");
        System.out.println("you will receive a system generated message or mail to the given contact number once your fixed deposit is about to mature");
        
        		
        

    }
	public static void main(String[] args) {
		
		bank b=new bank();
		int amount;
		for(;;)
		{
			System.out.println("WELCOME TO STATE BANK OF INDIA");
			System.out.println("Here are our list of services");
			System.out.println("1.deposit\n 2.withdrawn\n 3.fixed deposit\n 4.exit");
			System.out.println("enter your choice");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the amount to be deposited");
			       b.deposit();
			       break;
			case 2:System.out.println("Enter the amount to be withdrawn");
		           b.withdraw();
		           break; 
			case 3:b.fixeddeposit();
			       break;
			case 4:System.out.println("THANK YOU VISIT AGAIN");
			       return;
			
			}
			
		}
	}

}
