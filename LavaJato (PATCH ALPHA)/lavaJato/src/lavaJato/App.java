package lavaJato;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("LAVA JATO AUTOMATICO");
		System.out.println("===============================");

		// ENTRADA DADOS DO FUNCIONARIO
		System.out.print("\nDigite o ID do funcionário: ");
		int idFuncionario = scan.nextInt();
		scan.nextLine(); // consumir a quebra de linha pendente

		System.out.print("Informe o nome do funcionário: ");
		String nomeFuncionario = scan.nextLine();

		Funcionario funcionario = new Funcionario(idFuncionario, nomeFuncionario);

		System.out.println("==============================="); // quebra de linha

		// ENTRADA DADOS DO VEÍCULO
		System.out.print("Informe o tipo do veículo: ");
		String tipoVeiculo = scan.nextLine();

		System.out.print("Informe a placa do veículo: ");
		String placaVeiculo = scan.nextLine();

		System.out.print("Digite o modelo do veículo: ");
		String modelo = scan.nextLine();

		// INSTANCIAR O VEICULO E ATRIBUIR O FUNCIONARIO COMO ATENDENTE

		Veiculo veiculo = new Veiculo(tipoVeiculo, placaVeiculo, modelo, funcionario);

		// SAIDA OS DADOS DO VEÍCULO E DO FUNCIONÁRIO RESPONSÁVEL

		System.out.println("===============================");
		System.out.println("DADOS DO VEÍCULO");
		System.out.println("Tipo do veículo: " + veiculo.getTipoVeiculo());
		System.out.println("Placa: " + veiculo.getPlaca());
		System.out.println("modelo: " + veiculo.getModelo());
		System.out.println("Funcionario Responsável: " + veiculo.getAtendente().getNomeFuncionario());

		// ENTRADA DADOS DO CLIENTE

		Cliente cliente = new Cliente();
		System.out.println("===============================\n");
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = scan.next();
		cliente.setNome(nomeCliente);

		System.out.print("Você e mensalista? Por favor, insira '1' para sim e '2' para nao: ");
		boolean isMensalista = scan.next().equals("1");
		cliente.setTipoCliente(isMensalista);

		if (nomeCliente.equalsIgnoreCase("master")) {
			System.out.print("Informe o valor do aumento: ");
			cliente.aumentarPrecos(scan.nextFloat());
			scan.nextLine();

		} else {
			System.out.print("Informe o ID do cliente: ");
			int idCliente = scan.nextInt();
			cliente.setIdCliente(idCliente);
			scan.nextLine();

		}

		System.out.print("Informe o contato do cliente: ");
		String contatoCliente = scan.next();
		cliente.setContato(contatoCliente);

		// SAIDA DADOS DO CLIENTE

		System.out.println("===============================");
		System.out.println("DADOS DO CLIENTE");
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("ID do cliente: " + cliente.getIdCliente());
		System.out.println("Contato do cliente: " + cliente.getContato());
		System.out.println("===============================\n");

		scan.nextLine();

		// ENTRADA DADOS DOS SERVICOS

		System.out.println("Por favor, insira '1' para sim e '2' para nao.");

		System.out.print("Deseja o serviço de lavagem? ");
		cliente.lavagem = scan.nextLine().equalsIgnoreCase("1");

		System.out.print("Deseja o serviço de polimento? ");
		cliente.polimento = scan.nextLine().equalsIgnoreCase("1");

		System.out.print("Deseja o serviço de lavagem do banco? ");
		cliente.lavagemBanco = scan.nextLine().equalsIgnoreCase("1");

		System.out.print("Deseja o serviço de enceramento? ");
		cliente.enceramento = scan.nextLine().equalsIgnoreCase("1");

		// SAIDA DO VALOR A SER PAGO

		float precoTotal = cliente.precos();
		System.out.println("O valor total dos servicos e: " + precoTotal);
		System.out.println("===============================\n");

		// ENTRADA TIPO DE PAGAMENTO

		Pagamento pagamento = new Pagamento(precoTotal);

		System.out.println("Escolha a forma de pagamento.");
		System.out.println("1 - PIX");
		System.out.println("2 - Dinheiro ");
		System.out.println("3 - Cartão");
		System.out.print("Forma de pagamento: ");
		int escolha = scan.nextInt();

		double valorFinal = 0.0;

		switch (escolha) {
		case 1:
			valorFinal = pagamento.pagarComPix();
			break;

		case 2:
			valorFinal = pagamento.pagarComDinheiro();
			break;

		case 3:
			valorFinal = pagamento.pagarComCartao();
			break;

		default:
			System.out.println("Opção inválida.");
			break;
		}
		
		//SAIDA DO VALOR A SER PAGO.
		
		System.out.println("Valor final a ser pago R$: " + valorFinal+ "\n");
		System.out.println("-------------------------------");
		System.out.println("Volte sempre!");
		System.out.println("-------------------------------");

		scan.close();
	}

}
