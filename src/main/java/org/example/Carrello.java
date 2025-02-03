package pagamenti;

public class Carrello{
    metodoPagamento metodo;

    public Carrello(metodoPagamento metodo){
        this.metodo = metodo;
    }
    public void paga(){
        metodo.Pagamento();
    }
}
