package by.itacademy.projectshomeworks.bonustask;

public enum Nominal {
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);
    private int nominal;

    Nominal(int nominal) {
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }
}