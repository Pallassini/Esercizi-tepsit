package teatro;
public class clienti implements Runnable {
    Biglietteria biglietteria;
    boolean v=true;
    timer countdown;
	clienti(Biglietteria bigle,timer tim){
		biglietteria=bigle;
		countdown=tim;
	}
	public void run() {
		while(v) {
		//v=countdown.v;
	    synchronized(this){
	    	biglietteria.prenota();
	        System.out.println(biglietteria.biglietto);
	      }
	    }
	    }
	}

