package testings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Sam", "Walker", 5000);
    }

    @Test
    void deposit() throws Exception {
        double newBalance = account.deposit(1000, true);
        assertEquals(6000, newBalance);
    }

    @Test
    void withdraw() throws Exception {
        assertEquals(4000, account.withdraw(1000, true));
    }

    @Test
    void getBalance() throws Exception {
        assertEquals(5000, account.getBalance());
    }
}