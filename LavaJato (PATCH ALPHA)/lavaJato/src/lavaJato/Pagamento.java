package lavaJato;

public class Pagamento extends Servicos {

	private double valor;

	
	//CONSTRUTORES
	public Pagamento(double valor) {
		this.valor = valor;
	}

	//GETTERS AND SETTERS
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//METODOS DA FORMA DE PAGAMENTO
	
	public double pagarComPix() {
		System.out.println("Pagamanto via PIX sem taxa adicional.");
		return valor;
	}
	
	public double pagarComDinheiro() {
		System.out.println("Pagamento em dinheiro sem taxa adicional.");
		return valor;
	}
	
	public double pagarComCartao() {
		double taxa = 0.05; // TAXA DE 5% PAGAMENTOS VIA CARTÃO.
		double valorComTaxa = valor + (valor * taxa);
		System.out.println("Pagamento realizado com cartão. Taxa de 5% aplicada.");
		return valorComTaxa;
	}
	
	
}
