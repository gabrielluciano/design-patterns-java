package br.com.cod3r.chain.billsDispenser.before;

public class Dispenser {

    public void withdraw(Integer ammount) {
        Integer remaining = ammount;
        System.out.println("Calculating bills set for $" + ammount);
        if (remaining >= 50) {
            int bills = remaining / 50;
            remaining %= 50;
            printBills(bills, 50, remaining);
        }
        if (remaining >= 10) {
            int bills = remaining / 10;
            remaining %= 10;
            printBills(bills, 10, remaining);
        }
        if (remaining >= 1) {
            int bills = remaining / 1;
            remaining %= 1;
            printBills(bills, 1, remaining);
        }
    }

    private void printBills(int bills, int value, int remaining) {
        System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, value, remaining);
    }
}
