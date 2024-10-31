package joabe;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoTime {
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}

	public void evoluirJogador() {
		System.out.println("Escolha o jogador pelo numero:");
		for (int i = 0; i < jogadores.size(); i++) {
			System.out.println(i + " - " + jogadores.get(i).getNome());
		}

		int escolha = scanner.nextInt();
		Jogador jogadorEscolhido = jogadores.get(escolha);

		System.out.println("Esolha a habilidade a evoluir (forca, velocidade, tecnica): ");
		String habilidade = scanner.next();
		System.out.println("Informe os pontos a adicionar (max 99) : ");
		int pontos = scanner.nextInt();

		jogadorEscolhido.evoluirHabilidade(habilidade, pontos);
		System.out.println(jogadorEscolhido);
	}

	public void exibirJogadores() {
		for (Jogador jogador : jogadores) {
			System.out.println(jogador);
		}
	}
     
	public static void main (String[] args) {
		GerenciamentoTime gerenciamento = new GerenciamentoTime();
		
		// Adicionado jogadores de exemplo
		gerenciamento.adicionarJogador(new Atacante("João"));
		gerenciamento.adicionarJogador(new Atacante("Carlos"));
		gerenciamento.adicionarJogador(new Atacante("Miguel"));
		gerenciamento.adicionarJogador(new Atacante("Bruno"));
		
		gerenciamento.exibirJogadores();
		
		//Exemplo de evolução de jogador
		gerenciamento.evoluirJogador();
		gerenciamento.exibirJogadores();
		
		
		
	}

}

