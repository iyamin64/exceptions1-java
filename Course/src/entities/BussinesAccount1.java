package entities;

public class BussinesAccount1 extends Account1{
	
	private Double loanLimit;
	
	public BussinesAccount1(){
	}

	public BussinesAccount1(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void Loan(Double amount) {
		if (amount <= loanLimit){
			deposit(amount);
			//balance += amount - 10.0; // estava como private, alterado para protected

		}
	}
	

}
