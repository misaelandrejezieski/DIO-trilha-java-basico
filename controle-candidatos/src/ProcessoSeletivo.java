public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("### PROCESSO SELETIVO ###");


    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("A sua candidatura foi aceite.");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COMO CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDAR DEMAIS CANDIDATOS.");
        }


    }
}
