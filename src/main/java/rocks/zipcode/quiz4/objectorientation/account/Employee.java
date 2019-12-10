package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee {
    private BankAccount account;

    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        account = bankAccount;
    }
}
