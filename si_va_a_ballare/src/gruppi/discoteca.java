package gruppi;
import java.util.Random;
class discoteca implements Runnable {
	 boolean dentro=false;
	 registratore register;
discoteca(registratore regist){
	register=regist;
}
	public void run () {
		Random rand=new Random();
		int gruppo=rand.nextInt(10);
		while(true) {
		//entra
		dentro=true;
		register.count=register.count+gruppo;
       Random randomm=new Random();
		int n=randomm.nextInt(2000);
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
	     	}
		
		//esce
		dentro=false;
		register.count=register.count-gruppo;
		Random random=new Random();
		int n2=random.nextInt(2000);
		try {
			Thread.sleep(n2);
		} catch (InterruptedException e) {
			e.printStackTrace();
	     	}
		}
	}
}
