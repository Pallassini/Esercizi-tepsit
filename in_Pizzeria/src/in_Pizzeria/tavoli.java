package in_Pizzeria;
import java.util.Random;
public class tavoli {
private int[]tavoli=new int[20];
private int indexTavoli=-1;
private int[]clientiFatti=new int[20]; 
private int indexClientiFatti=-1;

//inserisco le persone a tavola
tavoli(){
	for(int i=0;i<20;i++) {
	Random random=new Random();
	int clienti= 1+random.nextInt(5);
	tavoli[i]=clienti;
	}
 }

synchronized int ordina() {
	indexTavoli++;
	if(indexTavoli<19) {
	return tavoli[indexTavoli];}else {
		return -1;
	}
 }

synchronized int clientiFatti(int n) {
	if(indexClientiFatti<19) {
	indexClientiFatti++;
	clientiFatti[indexClientiFatti]=n;
	return indexClientiFatti;}else{
		//tutti i clienti soddisfatti
		return -1;
	}
 }
}