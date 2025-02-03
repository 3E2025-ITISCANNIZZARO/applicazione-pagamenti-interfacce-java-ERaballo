package pagamenti;

public class Carta implements metodoPagamento{

    int numero;
    String proprietario;
    Carta(int numero, String proprietario){
        this.numero=numero;
        this.proprietario=proprietario;
    }

    @Override
    public void Pagamento(){    //richiamo il metodo pagamento dell'interfaccia e gli faccio fare l'azione per la carta
        System.out.println("hai effettuato il pagamento con carta di credito numero: "+ numero+"\n propretario: "+ proprietario); ;
    }
}
