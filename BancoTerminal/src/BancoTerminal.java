import java.util.Locale;
import java.util.Scanner;


public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 110;
        double valorSolicitado = 10;
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
                System.out.println("\n## Valor solicitado para saque:" + valorSolicitado);
                System.out.println("\n## Saldo restante: " + saldo);  
        }else if (saldo < valorSolicitado){
                System.out.println("Saldo insuficiente");  
        }
          
        System.out.println("\n-- Tenha um bom dia! --");
    }
}
