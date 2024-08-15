package br.com.cod3r.proxy.bank.services;

public class ATM implements BankOperations {
    private final Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("ATM Proxy sending request to Bank");
        bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String passwd, Long amount) {
        if (amount > 300) {
            System.out.println("Maximum withdraw amount is 300");
            return;
        }
        System.out.println("ATM Proxy sending request to Bank");
        bank.withdraw(account, passwd, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("Change password is not allowed here");
    }
}
