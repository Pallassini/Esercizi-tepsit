package multi_stanza;

public class registratore implements Runnable{
public int stanza1;
public int stanza2;
public int stanza3;
public int stanza4;
	public void run() {
		while(true) {
			System.out.println("stanza 1:"+stanza1);
			System.out.println("stanza 2:"+stanza2);
			System.out.println("stanza 3:"+stanza3);
			System.out.println("stanza 4:"+stanza4);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

