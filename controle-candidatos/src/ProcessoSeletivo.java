import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("### PROCESSO SELETIVO ###");
        /*System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");*/

    }
		
	static void selecaoCandiditos() {
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int totalSelecionados = 0;
		int proximoCandidato = 0; 
		while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double salarioPretendido = salarioPretendido();
			System.out.println("O candidato " + candidato + " solicitau este valor de salário  " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}
			
		}
		System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);
	}
	static double salarioPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
