package gruppi;
public class registratore implements Runnable{
public int count;
	public void run() {
		while(true) {
			System.out.println(count);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
