package singolo;
import java.util.Random;
 class discoteca implements Runnable {
	 boolean dentro=false;
	 registratore register;
discoteca(registratore regist){
	register=regist;
}
	public void run () {
		while(true) {
		//entra
		dentro=true;
		register.count++;
        Random rand=new Random();
		int n=rand.nextInt(2000);
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
	     	}
		
		//esce
		dentro=false;
		register.count--;
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
