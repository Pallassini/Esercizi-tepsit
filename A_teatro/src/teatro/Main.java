package teatro;

public class Main {

	public static void main(String[] args) {
		Biglietteria biglietteria=new Biglietteria();
		timer timer=new timer();
		Thread tim= new Thread(timer);
		tim.start();
		for (int i=0;i<1;i++) {
			clienti primo=new clienti(biglietteria,timer);
			Thread nuovo= new Thread(primo);
			nuovo.start();
		}

	}

}
