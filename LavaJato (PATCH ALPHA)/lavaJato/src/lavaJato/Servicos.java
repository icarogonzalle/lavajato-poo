package lavaJato;

public class Servicos {
	Boolean lavagem;
	Boolean polimento;
	Boolean lavagemBanco;
	Boolean enceramento;

	
	//CONSTRUTORES
	public Servicos() {

	}

	public Servicos(Boolean lavagem, Boolean polimento, Boolean lavagemBanco, Boolean enceramento) {
		this.lavagem = lavagem;
		this.polimento = polimento;
		this.lavagemBanco = lavagemBanco;
		this.enceramento = enceramento;
	}

	//PRECO FIXO
	float pcLavagem = 20;
	float pcPolimento = 30;
	float pcLavagenBanco = 50;
	float pcEnceramento = 50;

	//METODO AUMENTAR PREÇO, CASO SEJA NECESSARIO
	public void aumentarPrecos(float valorAumento) {
		pcLavagem += valorAumento;
		pcPolimento += valorAumento;
		pcLavagenBanco += valorAumento;
		pcEnceramento += valorAumento;
	}

	
	// METODOS
	public float precos() {
		float preco = 0;
		if (lavagem) {
			preco = preco + pcLavagem;
		}
		if (polimento) {
			preco = preco + pcPolimento;
		}
		if (lavagemBanco) {
			preco = preco + pcLavagenBanco;
		}
		if (enceramento) {
			preco = preco + pcEnceramento;
		}
		return preco;
	}

	public void receberServicos(Boolean lavagem, Boolean polimento, Boolean lavagemBanco, Boolean enceramento) {
		this.lavagem = lavagem;
		this.polimento = polimento;
		this.lavagemBanco = lavagemBanco;
		this.enceramento = enceramento;
	}

}
