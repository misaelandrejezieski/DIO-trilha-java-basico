public void TerminalEletronico() {
    
            System.out.println("Por favor, digite o valor solicitado:");
            double valorSolicitado = scan.nextInt();
            
            if(valorSolicitado > saldo ){
                    saldo = saldo - valorSolicitado;
                    System.out.println("\nSeu saldo é de: " + saldo);
            }
}