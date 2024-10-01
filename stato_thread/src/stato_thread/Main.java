package stato_thread;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("inserisci Thread: ");
		int threads=scanner.nextInt();
		System.out.println("inserisci num: ");
		int num=scanner.nextInt();
		principale princ= new principale(threads);
		Thread stampa=new Thread(princ);
		stampa.start();
     for (int i=0;i<threads;i++) {
    	 contatori conta=new contatori(num,princ);
    	 Thread nuovo =new Thread(conta);
    	 nuovo.start();
     }
	}

}
