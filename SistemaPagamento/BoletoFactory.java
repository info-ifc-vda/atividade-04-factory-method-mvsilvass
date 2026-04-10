public class BoletoFactory extends SistemaPagamento {

    @Override
    public FormaPagamento criarFormaDePagamento() {
        return new Boleto();
    }

}
