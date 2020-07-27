package lesson_05;

public class BankAccount {
    int id;
    String name;
    double balance;

    double refillAccount(double refill) {
        balance += refill;
        return balance;
    }
    double withdrawAccount(double withdrawal) {
        balance -= withdrawal;
        return balance;
    }

    void showOldBalanceInfo() {
        System.out.printf("Старий залишок на рахунку %s, ID: %d, дорівнює %.2f грн %n", name, id, balance);
    }

    void showNewBalanceInfo() {
        System.out.printf("Новий залишок на рахунку %s, ID: %d, дорівнює %.2f грн %n", name, id, balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "LA";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Julia";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Andriy";
        HisAccount.balance = 124.12;

        MyAccount.showOldBalanceInfo();
        MyAccount.refillAccount(20.55);
        MyAccount.showNewBalanceInfo();

        YourAccount.showOldBalanceInfo();
        YourAccount.refillAccount(191.18);
        YourAccount.withdrawAccount(25);
        YourAccount.showNewBalanceInfo();

        HisAccount.showOldBalanceInfo();
        HisAccount.withdrawAccount(32.77);
        HisAccount.showNewBalanceInfo();
    }
}

/*
output:
        Старий залишок на рахунку LA, ID: 1, дорівнює 12,35 грн
        Новий залишок на рахунку LA, ID: 1, дорівнює 32,90 грн

        Старий залишок на рахунку Julia, ID: 2, дорівнює 2,00 грн
        Новий залишок на рахунку Julia, ID: 2, дорівнює 168,18 грн

        Старий залишок на рахунку Andriy, ID: 3, дорівнює 124,12 грн
        Новий залишок на рахунку Andriy, ID: 3, дорівнює 91,35 грн  */
