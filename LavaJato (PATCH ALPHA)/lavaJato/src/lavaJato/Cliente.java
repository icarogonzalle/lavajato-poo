package lavaJato;

public class Cliente extends Servicos {
    
	private int idCliente;
    private String nome;
    private String contato;
    private boolean tipoCliente;
    
    //CONSTRUTORES
    public Cliente() {	
    }
    
	public Cliente(Boolean lavagem, Boolean polimento, Boolean lavagemBanco, Boolean enceramento, int idCliente,
			String nome, String contato) {
		super(lavagem, polimento, lavagemBanco, enceramento);
		this.idCliente = idCliente;
		this.nome = nome;
		this.contato = contato;
	}

	public Cliente(Boolean lavagem, Boolean polimento, Boolean lavagemBanco, Boolean enceramento) {
		super(lavagem, polimento, lavagemBanco, enceramento);
	}

	//GETTERS AND SETTERS
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	public boolean isTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(boolean tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
	//METODOS
	@Override
	public String toString() {
		return "Cliente idCliente = " 
				+ idCliente 
				+ ", nome = " 
				+ nome 
				+ ", Contato = " 
				+ contato;
	}

	@Override
	
	public float precos() {
		float preco = super.precos();
		float desconto;

		if (tipoCliente == true) {
			desconto = preco * 0.40f;
		} else {
			desconto = 0;
		}

		return preco - desconto;
	}
}