package errorHandel.bankEx;

public class bankAcc {
    

    private double balance;
	
	// Constructor
	public bankAcc () {
		balance = 0.0;
	}

    public void deposit( double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if( amount > balance){
            try {
                throw new insufficentFund("Insufficient Balance. "
                + "Withdraw process couldn't be completed.");
            } catch (insufficentFund e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        balance-=amount;
    }

    public double getBalance() {
		return balance;
	}
}
