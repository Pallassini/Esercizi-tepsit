package multi_stanza;
import java.util.Random;
class discoteca implements Runnable {
	 boolean dentro=false;
	 registratore register;
discoteca(registratore regist){
	register=regist;
}
	public void run () {
		//num persone gruppo
		Random rand=new Random();
		int gruppo=rand.nextInt(10);
		
		while(true) {
		
		//entra
			Random rand2=new Random();
			int stanza=rand2.nextInt(3);
			if(stanza==0) {
				register.stanza1=register.stanza1+gruppo;
				}
		if(stanza==1) {
		register.stanza2=register.stanza2+gruppo;
		}
		if(stanza==2) {
			register.stanza3=register.stanza3+gruppo;
			}
		if(stanza==3) {
			register.stanza4=register.stanza4+gruppo;
			}
       Random randomm=new Random();
		int n=randomm.nextInt(2000);
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
	     	}
		//esce
		if(stanza==0) {
			register.stanza1=register.stanza1-gruppo;
			}
	if(stanza==1) {
	register.stanza2=register.stanza2-gruppo;
	}
	if(stanza==2) {
		register.stanza3=register.stanza3-gruppo;
		}
	if(stanza==3) {
		register.stanza4=register.stanza4-gruppo;
		}
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
