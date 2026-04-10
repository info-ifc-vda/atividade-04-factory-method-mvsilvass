public class PixFactory extends SistemaPagamento{

    @Override
    public FormaPagamento criarFormaDePagamento() {
        return new Pix();
    }
    
}
