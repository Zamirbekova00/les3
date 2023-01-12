public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println(" На вашем счету 40000 сом");
    }
    public void withDraw(int sum) throws LimitException {
        if (sum < amount){
            throw new LimitException("На вашем счету недостаточно средств" , amount);
        }else {
            amount = amount + sum;
            System.out.println("Снимали 30000 сом");
        }
    }
}
