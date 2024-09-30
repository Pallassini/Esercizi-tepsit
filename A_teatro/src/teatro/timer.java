package teatro;
public class timer implements Runnable {
	boolean v=true;
	public void run() {
		timer();
	}
	void timer() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		v=false;
	}
}
