package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount account;
    private Double hours = 0.0;
    private Double wage;

    public Employee() {
        wage = 35.0;
        account = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {
        wage = 35.0;
        account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        account = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) { hours += numberOfHours;}

    @Override
    public Double getHoursWorked() {
        return hours;
    }

    @Override
    public Double getHourlyWage() {
        return wage;
    }

    @Override
    public Double getMoneyEarned() {
        return hours * wage;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) { account.deposit(amountToIncreaseBy);}

    @Override
    public void withdrawal(Double amountToDecreaseBy) { account.withdrawal(amountToDecreaseBy);}

    @Override
    public Double getBalance() {
        return account.getBalance();
    }
}
