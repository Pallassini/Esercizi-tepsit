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
	IndexOrdine++;
	return tavo[IndexOrdine];
}
 synchronized void porta(int pizze) {
	 if(tavoliFatti[20]==true) {System.out.println("consegnati tutti i tavoli");
    if(totpizze<tavo[IndexTavolo]) {
		totpizze=totpizze+pizze;
	}else {
		IndexTavolo++;
		tavoliFatti[IndexTavolo]=true;
    }
}
 }
}

