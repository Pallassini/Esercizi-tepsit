package singolo;

public class registratore implements Runnable{
public int count;
	public void run() {
		while(true) {
			System.out.println(count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
