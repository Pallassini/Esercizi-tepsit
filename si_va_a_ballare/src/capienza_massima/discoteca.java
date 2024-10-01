package capienza_massima;
import java.util.Random;
class discoteca implements Runnable {
	 boolean dentro=false;
	 registratore register;
	 boolean v=true;
	 int names;
discoteca(registratore regist){
	register=regist;
}
	public void run () {
		Random rand=new Random();
		int gruppo=rand.nextInt(10);
		while(true) {
		//entra
		if(register.count+gruppo<=162) {
		dentro=true;
		register.count=register.count+gruppo;
       Random randomm=new Random();
		int n=randomm.nextInt(2000);
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
	     	}//se è pieno
		}else{dentro=false;
		     register.i++;
		    if(v==true) {
		    	names=register.i;
		    	v=false;
		    }
		    register.GruppiFuori[register.i]=names;
		    
			while(dentro==false) {
				if(register.count+gruppo<=162) {
					register.i--;
						dentro=true;
				}
			}
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
