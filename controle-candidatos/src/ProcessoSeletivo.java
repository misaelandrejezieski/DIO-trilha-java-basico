import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("### PROCESSO SELETIVO 001 ###");
        /*System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");*/
        //selecaoCandiditos();
        //imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            ligandoCandidatos(candidato);
            System.out.println("-----------------------------------");
        }        
    
    }
	
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");


        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);

        }
    
    }   


	static void selecaoCandiditos() {
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int totalSelecionados = 0;
		int proximoCandidato = 0; 
		while(totalSelecionados < 5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double salarioPretendido = salarioPretendido();
			System.out.println("\nO candidato " + candidato + " solicitau este valor de salário  " + salarioPretendido);
            System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
			if(salarioBase <= salarioPretendido) {
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

	
	static void ligandoCandidatos(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
		}while(continuarTentando && tentativasRealizadas<5);
		
		if(atendeu){
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        }
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(5)==1;	
	}
}