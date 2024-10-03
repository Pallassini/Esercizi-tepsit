package produttore_consumatore;
public class consumatore implements Runnable {
	buffer array;
consumatore(buffer buf){
	array=buf;
}
public void run() {
	while(true) {
		array.pop();
	}
  }
}
