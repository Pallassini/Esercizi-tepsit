package in_Pizzeria;
import java.util.Random;
public class pizzaiolo {
	
 synchronized int sforna(int n) {
	int pizze=0;
	Random random=new Random();
	while(pizze<n) {
	//tempo di cottura pizze
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	//faccio pizze casuali da 1 a 8
	int sfornate=1+random.nextInt(8);
	pizze=pizze+sfornate;
	}
	 pizze=n;
	 return pizze;
 }
}
