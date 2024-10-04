package pizzeria;

public class camerieri implements Runnable {
	tavoli persone;
	forno Forno;
	int pizzeSfornate;
	camerieri(tavoli tav,forno forn){
		persone=tav;
		Forno=forn;
	}
public void run() {
	while(true) {
		//prendo l`ordine
		int ordine=persone.ordine();
		//comincia a sfornare finche non soddisfa  l`ordine
			pizzeSfornate=Forno.sforna();
			//portano le pizze sfornate
			persone.porta(pizzeSfornate);
		
		
		
	}
 }
}
