public class Transferencia implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Transferindo no valor de " + valor);
        System.out.println("Pagamento ACEITO...");
    }
    
}
