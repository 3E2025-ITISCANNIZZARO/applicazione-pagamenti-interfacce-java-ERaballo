package pagamenti;

public class Main {
    public static void main(String[] args) {
        Carrello pagamentoCarta = new Carrello(new Carta(159409,"Luigi"));  //creo due oggetti che hanno come attributi i metodi di pagamento che devono usare
        Carrello PagamentoPayPal = new Carrello(new PayPal(50492,"Marco"));
        Carrello PagamentoPayPalIban = new Carrello(new PayPal(5049296));
        pagamentoCarta.paga(); //effettua il pagamento di entrambi i metodi
        PagamentoPayPal.paga();
        PagamentoPayPalIban.paga();
    }
}
