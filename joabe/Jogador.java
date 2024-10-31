package joabe;

public class Jogador {
	private String nome;
	private int forca;
	private int velocidade;
	private int tecnica;
	private NivelHabilidade nivel;


	public Jogador(String nome) { 
		super();
		this.nome = nome;
		this.forca = 10;
		this.velocidade = 10;
		this.tecnica = 10;
		this.nivel = NivelHabilidade.INICIANTE;
	}


	public String getNome() {
		return nome;
	}



	public int getForca() {
		return forca;
	}



	public int getVelocidade() {
		return velocidade;
	}



	public int getTecnica() {
		return tecnica;
	}

	public NivelHabilidade getNivel() {
		return nivel;
	}

	// Metodo para evoluir a habilidade com limite de 99
	public void evoluirHabilidade(String habilidade, int pontos) {
		switch (habilidade.toLowerCase()) {
		case "forca":
			if (forca + pontos <= 99) forca += pontos;
			break;
		case "velocidade":
			if  (velocidade + pontos <= 99) velocidade += pontos; 
			break;
		case "tecnica":
			if (tecnica + pontos <= 99) tecnica += pontos;
			break;
		default:
			System.out.println("Habilidade inválida!");
		}
		atualizarNivel();
	}
	// Atualiza o nível com base média das habilidade
	private void atualizarNivel() {
		int media = (forca + velocidade + tecnica) / 3;
		if (media < 25) nivel = NivelHabilidade.INICIANTE;
		else if (media < 50) nivel = NivelHabilidade.INTERMEDIARIO;
		else if (media < 75) nivel = NivelHabilidade.AVANCADO;
		else nivel = NivelHabilidade.PROFISSIONAL;
	}

	@Override
	public String toString() {
		return "Jogador:" + nome + " | Força: " + forca + " | Velocidade: " + velocidade + 
				 " | Técnica:" + tecnica + " | Nível: " + nivel;
	}
}

