package pagamenti;

public class PayPal implements metodoPagamento{
    int iban=0;
    int numero;
    String proprietario;
     PayPal(int iban){
         this.iban=iban;
     }
     PayPal(int numero, String proprietario){
         this.numero=numero;
         this.proprietario=proprietario;
     }
    @Override
    public void Pagamento(){  //richiamo il metodo dell'interfaccia e gli faccio fare l'azione per il pagamento PayPal
        if (iban==0){
            System.out.println("hai effettuato il pagamento con carta di credito su PayPal numero: "+ numero+" e proprietario: "+ proprietario);
        }
        else{
            System.out.println("hai effettuato il pagamento su PayPal con iban: "+ iban);
        }


    }
}

