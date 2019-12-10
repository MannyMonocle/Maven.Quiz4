package rocks.zipcode.quiz4.objectorientation.account;

import java.util.HashMap;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private Integer index = -1;
    private HashMap<Integer,BankAccount> accounts = new HashMap<>();


    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return accounts.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        index++;
        accounts.put(index,bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.containsValue(bankAccount);
    }
}
