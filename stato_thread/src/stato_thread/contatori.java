package stato_thread;
import java.util.Random;
public class contatori implements Runnable {
	principale princ;
	int num;
	int MAX;
	int mioIndex;
	contatori(int n,principale pri){
		princ=pri;
		num=n;
		
	}
public void run() {
	synchronized(this){
//set dell`indice
	princ.index++;
	mioIndex=princ.index;
	
//inizializzo il numero a cui deve arrivare
	Random random=new Random();
	int rand=random.nextInt(num);
	MAX=rand;
	num=0;
	}
	
//entro nel contatore
	while(num<MAX) {
		princ.contatori[mioIndex]=num;
		num++;
		try {
			Thread.sleep(120);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	//completato
	princ.contatori[mioIndex]=-1;
   }
}
