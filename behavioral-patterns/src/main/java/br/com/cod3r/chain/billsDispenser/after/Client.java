package br.com.cod3r.chain.billsDispenser.after;

public class Client {

    public static void main(String[] args) {
        Dispenser atm = new Dispenser();
        System.out.println("Withdrawing $230");
        atm.withdraw(230);
        System.out.println("-----------");
        System.out.println("Withdrawing $66");
        atm.withdraw(66);

        System.out.println("-----------");
        Dispenser binaryDispenser = new Dispenser(new Bill(128), new Bill(64),
                new Bill(32), new Bill(32), new Bill(16), new Bill(8),
                new Bill(4), new Bill(2), new Bill(1));
        System.out.println("Withdrawing $699");
        binaryDispenser.withdraw(699);
        System.out.println("-----------");
        System.out.println("Withdrawing $451");
        binaryDispenser.withdraw(451);
    }
}
