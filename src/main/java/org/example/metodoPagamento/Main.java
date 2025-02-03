public class Main {
    public static void main(String[] args) {
        Carrello pagamentoCarta = new Carrello(new Carta());
        Carrello PagamentoPayPal = new Carrello(new PayPal());
        pagamentoCarta.Paga();
        PagamentoPayPal.Paga();
    }
}
