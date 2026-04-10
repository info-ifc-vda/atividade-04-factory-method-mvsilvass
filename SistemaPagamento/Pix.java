public class Pix implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando com PIX no valor de " + valor);
        System.out.println("Pagamento ACEITO...");
    }


}

