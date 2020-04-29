package bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);

        Optional<User> userResult = bank.findByPassport("3434");
        assertThat(true, is(userResult.isPresent()));
        assertThat(userResult.get(), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertFalse(bank.findByRequisite("34", "5546").isPresent());
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));

        Optional<Account> searchAccout = bank.findByRequisite("3434", "5546");
        assertThat(searchAccout.isPresent(), is(true));
        assertThat(searchAccout.get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);

        Optional<Account> searchAccout = bank.findByRequisite(user.getPassport(), "113");
        assertThat(searchAccout.isPresent(), is(true));
        assertThat(searchAccout.get().getBalance(), is(200D));
    }

    @Test
    public void whenFindByPasswordNull() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();

        Optional<User> result = bank.findByPassport("32");

        if (result.isPresent()) {
            result.get().getUsername();
        }

    }
}