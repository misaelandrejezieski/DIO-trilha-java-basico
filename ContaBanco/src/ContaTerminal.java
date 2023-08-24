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
    
    String nome = scan.nextLine();

    System.out.println("Digite seu saldo:");
    double saldo = scan.nextDouble();
    System.out.println("\n---------------------------------------");
    System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.\n" +
    "Agencia: "+ agencia + "\nConta: " + numConta + " \nSaldo: " + saldo + "\nTENHA UM BOM DIA.");
    System.out.println("\n---------------------------------------");
    scan.close();
    }
}
