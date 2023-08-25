import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //todo: Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter os valores digitados no terminal
        //Exibir a mensagem final "conta criada"
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Agência:");
    int agencia = scan.nextInt();

    System.out.println("Por favor, digite o numero da conta:");
    int numConta = scan.nextInt();

    System.out.println("Por favor, digite seu nome:");
    scan.nextLine();
    String nome = scan.nextLine();

    System.out.println("Digite seu saldo:");
    double saldo = scan.nextDouble();
    System.out.println("\n---------------------------------------");
    System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.\n" +
    "Agencia: "+ agencia + "\nConta: " + numConta + " \nSaldo: " + saldo + "\nTENHA UM BOM DIA.");
    System.out.println("\n---------------------------------------");

    scan.close();
    }

    public class BankAccount {
        private String accountHolderName;
        private int accountNumber;
        private double balance;
    
        public BankAccount(String accountHolderName, int accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    
        public String getAccountHolderName() {
            return accountHolderName;
        }
    
        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }
    
        public int getAccountNumber() {
            return accountNumber;
        }
    
        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
    
    public class ElectronicService {
        private BankAccount bankAccount;
    
        public ElectronicService(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
        }
    
        public void deposit(double amount) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("Depósito bem-sucedido. Novo saldo: " + bankAccount.getBalance());
        }
    
        public void withdraw(double amount) {
            if (bankAccount.getBalance() >= amount) {
                bankAccount.setBalance(bankAccount.getBalance() - amount);
                System.out.println("Retirada bem-sucedida. Novo saldo: " + bankAccount.getBalance());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    
        public void transfer(double amount, BankAccount recipient) {
            if (bankAccount.getBalance() >= amount) {
                bankAccount.setBalance(bankAccount.getBalance() - amount);
                recipient.setBalance(recipient.getBalance() + amount);
                System.out.println("Transferência bem-sucedida. Novo saldo: " + bankAccount.getBalance());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }
    
}
