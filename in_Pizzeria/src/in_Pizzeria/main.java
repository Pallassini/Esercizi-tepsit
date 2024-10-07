package in_Pizzeria;

public class main {

	public static void main(String[] args) {
		buffer buf=new buffer();
		tavoli tav=new tavoli();
		pizzaiolo armando=new pizzaiolo();
		Thread []threads=new Thread[3];
		threads[0]=new Thread(new camerieri(buf,tav,armando));
		threads[1]=new Thread(new camerieri(buf,tav,armando));
		threads[2]=new Thread(new camerieri(buf,tav,armando));
		
		threads[0].start();
		threads[1].start();
		threads[2].start();
	}
}
