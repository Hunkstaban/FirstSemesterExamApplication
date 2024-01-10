package TestDrivenDevelopment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testWithdraw() {
        Account account = new Account("Peter");
        account.withdraw(30);
        assertEquals(70, account.getBalance());

        account.withdraw(40);
        assertEquals(70, account.getBalance());
    }

    @Test
    void testDeposit() {
        Account account = new Account("Jens");
        account.deposit(50);
        assertEquals(150, account.getBalance());

        account.deposit(40);
        assertEquals(150, account.getBalance());
    }
}