package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account>  accountList = new ArrayList<>();
        accountList.add(new Account("1232313", 0));
        users.put(user, accountList);
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.get(user).add(account);
                break;
            }
        }
    }

    public User findByPassport(String passport) {

        User resultUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                resultUser = user;
                break;
            }
        }

        return resultUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        result = account;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport,
                                 String srcRequisite,
                                 String destPassport,
                                 String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account target = findByRequisite(destPassport, destRequisite);
        if (source != null && target != null) {
            source.setBalance(source.getBalance() - amount);
            target.setBalance(target.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}
