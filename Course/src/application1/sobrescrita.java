package application1;

import entities.Account2;
import entities.BusinessAccount2;
import entities.SavingsAccount;

public class sobrescrita {

	public static void main(String[] args) {
		Account2 acc1 = new Account2(1001,"Alex",1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account2 acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account2 acc3 = new BusinessAccount2(1003,"Bob",1000.0,500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		//Polimorfismo
		
//		Account2 x = new Account2(1020, "Alex", 1000.0);
//		Account2 y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//		x.withdraw(50.0);
//		y.withdraw(50.0);
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());
	}

}
