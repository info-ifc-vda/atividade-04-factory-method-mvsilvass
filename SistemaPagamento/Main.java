import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SistemaPagamento sistema = null;

		while (true) {
			System.out.println("=== SISTEMA DE PAGAMENTO ===");
			System.out.println("1. Cartao");
			System.out.println("2. Pix");
			System.out.println("3. Boleto");
			System.out.println("4. Transferencia");
			System.out.println("0. SAIR DE PAGAMENTOS");
			System.out.print("\nEscolha a forma de pagamento: ");

			int opcao = scanner.nextInt();

			if (opcao == 0) break;
			switch (opcao) {
				case 1 -> sistema = new CartaoFactory();
				case 2 -> sistema = new PixFactory();
				case 3 -> sistema = new BoletoFactory();
				case 4 -> sistema = new TransferenciaFactory();
				default -> System.out.println("Opcao invalida!");
			}

			if (sistema != null) {
				System.out.print("Digite o valor: R$ ");
				double valor = scanner.nextDouble();

				System.out.println("\n--- Processando ---");
				sistema.realizarPagamento(valor);
				System.out.println("-------------------");
			} else {
				System.out.println("Nao foi possivel processar o pagamento.");
			}

			sistema = null;
		}

		System.out.println("SAINDOOO....");
		scanner.close();
	}
}