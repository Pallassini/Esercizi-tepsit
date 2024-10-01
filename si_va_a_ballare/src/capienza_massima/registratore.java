package capienza_massima;

public class registratore implements Runnable{
public int count;
int []GruppiFuori=new int[100];
int i=0;
	public void run() {
		while(true) {
			for(int k=0;k<i;k++) {
			System.out.println("il gruppo: ("+GruppiFuori[k]+")"+"è fuori!");
			}
			System.out.println("persone nel locale: "+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}