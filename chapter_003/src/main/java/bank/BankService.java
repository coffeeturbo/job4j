package bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            users.get(user.get()).add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> resultUser = Optional.empty();
        var result = users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .distinct()
                .findFirst()
                .orElse(null);

        if (result != null) {
            resultUser = Optional.of(result);
        }

        return resultUser;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> result = Optional.empty();
        Optional<User> user = findByPassport(passport);
        Account search = null;

        if (user.isPresent()) {
            search = users.get(user.get())
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }

        if (search != null) {
            result = Optional.of(search);
        }

        return result;
    }

    public boolean transferMoney(String srcPassport,
                                 String srcRequisite,
                                 String destPassport,
                                 String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Optional<Account> source = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> target = findByRequisite(destPassport, destRequisite);
        if (source.isPresent()
                && target.isPresent()
                && source.get().getBalance() >= amount
        ) {
            source.get().setBalance(source.get().getBalance() - amount);
            target.get().setBalance(target.get().getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}
