package pizzeria;
import java.util.Random;
public class tavoli {
int[] tavo=new int[20];
int totpizze=0;
boolean[] tavoliFatti=new boolean[20];
int IndexTavolo;
int IndexOrdine=-1;

void creatavoli(){
for(int i=0;i<20;i++) {
	Random t=new Random();
	int personeTavolo=t.nextInt(5);
	tavo[i]=personeTavolo;
}
}
synchronized int ordine() {
	if(IndexOrdine<19) {
	IndexOrdine++;
	System.out.println("l`ordine del tavolo "+IndexOrdine+" è: "+tavo[IndexOrdine]);
	return tavo[IndexOrdine];}else {
	return 0;}
}

 synchronized void porta(int pizze) {
	 //se tutti i tav sono fatti
	 if(tavoliFatti[19]==true) {System.out.println("consegnati tutti i tavoli");while(true) {
		 
	 }}
	 //se il tav non è fatto
    if(totpizze<tavo[IndexTavolo]) {
		totpizze=totpizze+pizze;
	}else {System.out.println("tavolo"+IndexTavolo+"completato");
		//se il tav è fatto
	    totpizze=totpizze-tavo[IndexTavolo];
		IndexTavolo++;
		tavoliFatti[IndexTavolo]=true;
    }

 }
}

