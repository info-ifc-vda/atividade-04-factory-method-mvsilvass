public class Cartao implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("VALIDANDO DO CARTAO...");
        System.out.println("Pagando com CARTAO no valor de " + valor);
        System.out.println("Pagamento ACEITO...");
    }
    
}
