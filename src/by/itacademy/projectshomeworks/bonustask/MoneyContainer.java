package by.itacademy.projectshomeworks.bonustask;

public class MoneyContainer {
    private Nominal nominal;
    private int countBill;

    public MoneyContainer(Nominal nominal, int countBill) {
        this.nominal = nominal;
        this.countBill = countBill;
    }

    public int getMoney(Nominal nominal, int countBill) {
        return nominal.getNominal() * countBill;
    }

    public MoneyContainer getRemainingMoneyInMoneyContainer(MoneyContainer moneyContainer, int countBill) {
        moneyContainer.setCountBill(moneyContainer.getCountBill() - countBill);
        return moneyContainer;
    }

    public Nominal getNominal() {
        return nominal;
    }

    public void setNominal(Nominal nominal) {
        this.nominal = nominal;
    }

    public int getCountBill() {
        return countBill;
    }

    public void setCountBill(int countBill) {
        this.countBill = countBill;
    }

    @Override
    public String toString() {
        return "MoneyContainer{" +
                "nominal=" + nominal +
                ", countBill=" + countBill +
                '}';
    }
}