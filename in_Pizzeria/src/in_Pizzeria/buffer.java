package in_Pizzeria;

public class buffer {
private int[]ordini=new int[20];
private int indexOrdini=0;
private int[]ordiniPronti=new int[20];
private int indexOrdiniPronti=0;

synchronized int prendiOrdine() {
	return ordini[indexOrdini];
}
synchronized int prendiOrdinePronto() {
	return ordiniPronti[indexOrdiniPronti];
}
synchronized void inserisciOrdine(int ord) {
	ordini[indexOrdini]=ord;
  }
synchronized void inserisciOrdinePronto(int ord) {
	ordiniPronti[indexOrdiniPronti]=ord;
	
 }
}
