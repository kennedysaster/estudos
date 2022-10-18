package aulaum;

import java.util.Iterator;
import java.util.Scanner;

public class mediaaluno {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String maioridade = "Maior de idade";
		String menoridade = "Menor de Idade";
		String elet = "Ativo para votação";
		String nelet = "Não ápto para votação";

		System.out.println("Qual seu Nome :");
		String nome = scan.next();
		System.out.println("Qual sua idade :");
		int idade = scan.nextInt();
		System.out.println("Possui título de eleitor ? DIGIE 1 PARA SIM e 2 PARA NÃO :");
		int possui = 1;
		possui = scan.nextInt();

		if (idade >= 16 && possui == 1) {
			String somadados = maioridade + " e " + "Possui titulo de eleitor";
			System.out.println(somadados);
			

		} else if (idade >= 16 && possui == 2) {
			int protP = 2022;
			System.out.println(maioridade + " e não possui titulo de eleitor");

			System.out.println("INFORME SEU DADOS PESSOAS PARA EMISSAO DO TITULO");
			System.out.println("-----------------------------------------------");
			System.out.println("Seu Nome:");
			System.out.println(nome);
			System.out.println("Sua idade:");
			System.out.println(idade);
			System.out.println("Nome da Mãe:");
			String maeN = scan.next();
			System.out.println("Endereço:");
			String enderc = scan.next();

					
			System.out.println("-----------SOLICITAÇÃO DE TITULO DE ELEITOR --------------");
			
			System.out.println("-SOLICITANTE : " + nome + "---------");
			System.out.println("-IDADE SOLICITANTE : " + idade + "--------");
			System.out.println("-NOME DA MÃE : " + maeN + "---------");
			System.out.println("-ENDEREÇO : " + enderc + "-------");
			System.out.println("Seu numero de protocolo : " + protP + idade + "GO");
			System.out.println("-----------------------------------------------------------");
			
			System.out.println("Seus dados foram recebidos, aguarde o númeor do documento");
			
			
			System.out.println("-----------TSE AGRADECE SEU CONTATO --------------");

		}

		if (idade <= 16 && possui == 1)

		{
			System.out.println(menoridade + " INVÁLIDO, não pode ter titulo de Eleitor");

			System.out.println("-------------------------------------");
			System.out.println("-----------TSE AGRADECE SEU CONTATO --------------");
		}

		if (idade <= 16) {
			int midadeAdulto = (18 - idade);
			System.out.println("--------SUA MAOIRIDADE--------------------");
			System.out.println("Em " + midadeAdulto + " anos poderá iniciar a emissão de seu Título");
			System.out.println("-------------------------------------");
			System.out.println("-----------TSE AGRADECE SEU CONTATO --------------");
		}

	}

}
