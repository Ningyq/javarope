package pattern;

import java.util.ArrayList;
import java.util.List;

interface Command {
    void execute();
}

class Account {
    private String name = "nyq";
    private int balance = 1000;

    public void open() {
        System.out.println("Open account [ Name: " + name + ", Balance: " + balance + " ]");
    }

    public void close() {
        System.out.println("Close account [ Name: " + name + ", Balance: " + balance + " ]");
    }
}

class OpenAccount implements Command {
    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}

class CloseAccount implements Command {
    private Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.close();
    }
}

class Bank {
    private List<Command> commandList = new ArrayList();

    public void receiveCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}

public class DemoCommand {

    public static void main(String[] args) {
        Account account = new Account();
        OpenAccount openAccount = new OpenAccount(account);
        CloseAccount closeAccount = new CloseAccount(account);

        Bank bank = new Bank();
        bank.receiveCommand(openAccount);
        bank.receiveCommand(closeAccount);

        bank.executeCommands();
    }
}
