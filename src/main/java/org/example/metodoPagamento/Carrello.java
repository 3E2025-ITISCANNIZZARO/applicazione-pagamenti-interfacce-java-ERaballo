Public class Carrello{
    MetodoPagamento metodo;

    public Carello(MetodoPagamento metodo){
        this.metodo = metodo;
    }
    public void paga(){
        metodo.paga();
    }
}