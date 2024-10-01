package stato_thread;

public class principale implements Runnable {
int []contatori;
int MAX;
int index=-1;
int completati=0;
principale(int n){
	contatori=new int[n];
	MAX=n;
}
public void run() {
	//stampo l`array
while(true) {
	for(int i=0;i<MAX;i++) {
		//completato
		if(contatori[i]==-1) {
			System.out.println("Thread ("+i+") COMPLETATO");
			completati++;
		}else{ System.out.println("Thread ("+i+") ATTIVO: "+contatori[i]);
	  }
	}
	if(completati==MAX) {
		break;
	}
	completati=0;
	
	
	
	
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }
System.out.println("TUTTI I THREAD SONO COMPLETATI");
  }
}
