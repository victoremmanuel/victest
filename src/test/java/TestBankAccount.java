
import junit.framework.Assert;
import main.BankAccount;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5.0);
		Assert.assertEquals(5.0, amount);

	}


	//@Test
	public void testDebitWithInSufficientFunds() {
		BankAccount account = new BankAccount(11);
		double amount = account.debit(5.0);
		Assert.assertEquals(10.0, amount);

	}
	
	//@Test
	public void checkBalance() {
		BankAccount account = new BankAccount(10);
		Assert.assertEquals(10.0, account.checkBalance());

	}
}
