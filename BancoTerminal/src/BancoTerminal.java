public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        System.out.println("\n## Valor solicitado para saque:" + valorSolicitado);
        System.out.println("\n## Saldo restante: " + saldo);  
        }else if (saldo < valorSolicitado){
            System.out.println("Saldo insuficiente");  
        }
          
        System.out.println("\nTenha um bom dia!!!");
    }
}
