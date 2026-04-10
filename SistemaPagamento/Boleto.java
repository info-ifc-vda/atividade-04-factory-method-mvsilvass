public class Boleto implements FormaPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando com BOLETO no valor de " + valor);
        System.out.println("Pagamento ACEITO...");
    }

}
