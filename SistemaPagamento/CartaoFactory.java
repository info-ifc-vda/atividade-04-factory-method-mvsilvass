public class CartaoFactory extends SistemaPagamento{

    @Override
    public FormaPagamento criarFormaDePagamento() {
        return new Cartao();
    }
    
}
