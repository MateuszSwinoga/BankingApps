import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {
    @Test
    public void whenUserDepositMoneyHeHaveMoreMoney(){ // metody testów nazywamy opisowo
        Account account = new Account("Mateusz", "Świnoga");
        account.deposit(100);
        Assert.assertEquals(205, account.getBalance());  // porównanie


    }
}
