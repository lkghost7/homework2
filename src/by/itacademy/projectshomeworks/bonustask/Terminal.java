package by.itacademy.projectshomeworks.bonustask;

public class Terminal {

    public static void main(String[] args) {
        MoneyContainer moneyContainer1 = new MoneyContainer(Nominal.TEN, 400);
        MoneyContainer moneyContainer2 = new MoneyContainer(Nominal.TEN, 400);
        MoneyContainer moneyContainer3 = new MoneyContainer(Nominal.TWENTY, 300);
        MoneyContainer moneyContainer4 = new MoneyContainer(Nominal.TWENTY, 300);
        MoneyContainer moneyContainer5 = new MoneyContainer(Nominal.FIFTY, 200);
        MoneyContainer moneyContainer6 = new MoneyContainer(Nominal.FIFTY, 200);
        MoneyContainer moneyContainer7 = new MoneyContainer(Nominal.HUNDRED, 100);
        CashMachine cashMachine = new CashMachine();
        cashMachine.putMoney(moneyContainer1);
        cashMachine.putMoney(moneyContainer2);
        cashMachine.putMoney(moneyContainer3);
        cashMachine.putMoney(moneyContainer4);
        cashMachine.putMoney(moneyContainer5);
        cashMachine.putMoney(moneyContainer6);
        cashMachine.putMoney(moneyContainer7);

        printBankomat(cashMachine);
        cashMachine.getMoney(1360);
        cashMachine.getMoney(20);
        cashMachine.getMoney(990);
        printBankomat(cashMachine);
    }

    private static void printBankomat(CashMachine cashMachine) {
        for (int i = 0; i < cashMachine.getMoneyContainers().length; i++) {
            int money = cashMachine.getMoneyContainers()[i].getMoney(
                    cashMachine.getMoneyContainers()[i].getNominal(),
                    cashMachine.getMoneyContainers()[i].getCountBill()
            );
            System.out.println("Загружен контейнер с купюрами номиналом " +
                    cashMachine.getMoneyContainers()[i].getNominal().getNominal() +
                    " в количестве " + cashMachine.getMoneyContainers()[i].getCountBill() +
                    " общей суммой контейнера = " + money);
        }
    }
}