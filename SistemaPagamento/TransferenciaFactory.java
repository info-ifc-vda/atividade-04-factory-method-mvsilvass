public class TransferenciaFactory extends SistemaPagamento {

    @Override
    public FormaPagamento criarFormaDePagamento() {
        return new Transferencia();
    }
}
