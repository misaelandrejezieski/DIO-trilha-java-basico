
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //todo: Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter os valores digitados no terminal
        //Exibir a mensagem final "conta criada"
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta:");
    int numConta = scan.nextInt();

    System.out.println("Por favor, digite o numero da agência:");
    scan.nextLine();
    String agencia = scan.nextLine();

    System.out.println("Por favor, digite seu nome:");
    String nome = scan.nextLine();

    System.out.println("Digite seu saldo:");
    double saldo = scan.nextDouble();

    System.out.println("\n---------------------------------------");
    System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta +
    " e seu saldo R$ " + saldo + " já disponível para saque.");
    System.out.println("\n---------------------------------------");

    scan.close();
    }

        
    
}
