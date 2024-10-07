package in_Pizzeria;

public class camerieri implements Runnable {
	private buffer buffer;
	private pizzaiolo pizzaiolo;
	private tavoli tavoli;
	private int tavoloPronto=0;
	private int end=0;
camerieri(buffer b,tavoli t,pizzaiolo p){
	buffer=b;
	tavoli=t;
	pizzaiolo=p;
}
	public void run() {
		while (tavoloPronto!=-1) {
			int ordinePreso;
			//ordino
			ordinePreso=tavoli.ordina();
			
			//inserisco ordine nel buffer
			buffer.inserisciOrdine(ordinePreso);
			
			//prendo un ordine dal buffer
			int ordineFare = buffer.prendiOrdine();
			
			//ordino e ricevo le pizze
			int pizze = pizzaiolo.sforna(ordineFare);
			
			//inserisco le pizze nel buffer
			buffer.inserisciOrdinePronto(pizze);
			
			//prendo un'ordine pronto
			int pronto=buffer.prendiOrdinePronto();
			
			//porto l`ordine pronto al tavolo
			tavoloPronto=tavoli.clientiFatti(pronto);
			
			//stampo il tavolo fatto
			if(end==0) {
			synchronized(this) {
			if(tavoloPronto!=-1) {
			System.out.println("tavolo: "+tavoloPronto+"pronto");
			
			//se tutti i tavoli sono fatti
		}else {System.out.println("tavoli tutti pronti!");
		        end=100;
	   }
	  }
     }
	}
 }
}

