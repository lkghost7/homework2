package by.itacademy.projectshomeworks.bonustask;

public class CashMachine {
    public String ascColorsBegin = (char) 27 + "[34;43m";
    public String ascColorsBeginRed = (char) 27 + "[35m";
    public String ascColorsEnd = (char) 27 + "[0m";
    private MoneyContainer[] moneyContainers = new MoneyContainer[7];

    public CashMachine() {
    }

    public CashMachine(MoneyContainer[] moneyContainer) {
        this.moneyContainers = moneyContainer;
    }

    public MoneyContainer[] getMoneyContainers() {
        return moneyContainers;
    }

    public MoneyContainer[] putMoney(MoneyContainer moneyContainer) {
        for (int i = 0; i < this.moneyContainers.length; i++) {
            if (this.moneyContainers[i] == null) {
                this.moneyContainers[i] = moneyContainer;
                return this.moneyContainers;
            }
        }
        return this.moneyContainers;
    }

    public void getMoney(int countMoney) {
        int currentMoney = countMoney;
        System.out.println("Вы запросили у банкомата сумму в " + currentMoney + " рублей...");
        for (int i = this.getMoneyContainers().length - 1; i > 0; i--) {
            int nominal = this.getMoneyContainers()[i].getNominal().getNominal();
            if ((nominal == 100) && (currentMoney >= nominal)) {
                currentMoney = getCurrentMoney(currentMoney, i, nominal);
            }
            if ((nominal == 50) && (currentMoney >= nominal)) {
                currentMoney = getCurrentMoney(currentMoney, i, nominal);
            }
            if ((nominal == 20) && (currentMoney >= nominal)) {
                currentMoney = getCurrentMoney(currentMoney, i, nominal);
            }
            if ((nominal == 10) && (currentMoney >= nominal)) {
                currentMoney = getCurrentMoney(currentMoney, i, nominal);
            }
        }
    }

    private int getCurrentMoney(int currentMoney, int i, int nominal) {
        System.out.println(ascColorsBeginRed + "*********************************************" +
                "**********" + ascColorsEnd);
        int balance;
        int amountsBanknotes = currentMoney / nominal;
        MoneyContainer currentContainer = this.getMoneyContainers()[i];
        currentContainer.getRemainingMoneyInMoneyContainer(currentContainer, amountsBanknotes);
        currentMoney = currentMoney - (amountsBanknotes * nominal);
        balance = currentMoney % nominal;
        System.out.println(ascColorsBegin + "Вы получили " + amountsBanknotes + " купюр достоинством в " + nominal + ascColorsEnd);
        System.out.println("Осталось распределить сумму в " + currentMoney);
        System.out.println("остаток: " + balance);
        return currentMoney;
    }
}