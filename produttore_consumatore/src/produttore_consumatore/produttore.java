package produttore_consumatore;
import java.util.Random;
public class produttore implements Runnable {
	buffer array;
	int numero;
	int countNumX=0;
produttore(buffer buf,int num){
	array=buf;
	numero=num;
}
public void run() {
	while(true) {
		Random n=new Random();
		Random a=new Random();
		Random v=new Random();
		int Xnum=n.nextInt(numero);
		int attesa=100+v.nextInt(1001);
		int inserire=a.nextInt(1023);
		//dorme 120ms se non ha raggiunto il num
		if(countNumX!=numero) {
			countNumX++;
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//inserisco il numero
		array.push(inserire);
		try {
			Thread.sleep(attesa);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
 }
}
