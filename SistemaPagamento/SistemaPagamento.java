public abstract class SistemaPagamento {
    
    public void realizarPagamento(double valor) {
		System.out.println("Iniciando processo de pagamento");
		FormaPagamento metodoDePagamento = this.criarFormaDePagamento();
		metodoDePagamento.pagar(valor);
	}

    public abstract FormaPagamento criarFormaDePagamento();
}
