package lavaJato;

public class Veiculo {
    private String tipoVeiculo;
    private String placa;
    private String modelo;
    //funcionario responsavel pela lavagem
    private Funcionario atendente;

    //CONSTRUTOR
    public Veiculo(String tipoVeiculo, String placa, String fabricante, Funcionario atendente) {
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
        this.modelo = fabricante;
        this.atendente = atendente;
    }

    // GETTERS AND SETTERS
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setFabricante(String fabricante) {
        this.modelo = fabricante;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }
}