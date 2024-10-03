package produttore_consumatore;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("numero Thread: ");
		int threads = scanner.nextInt();
		System.out.println("numero: ");
		int num = scanner.nextInt();
		buffer buffer=new buffer();
		 for(int i=0;i<threads;i++) {
			 consumatore nuovoC= new consumatore(buffer);
	        	Thread cons=new Thread(nuovoC);
	        	produttore nuovo= new produttore(buffer,num);
	        	Thread prod=new Thread(nuovo);
	        	prod.start();
	        	cons.start();
	        }

	}

}
