package pizzeria;
import java.util.Scanner;
public class Mainn {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("numero persone: ");
		int persone = scanner.nextInt();
		//creo il forno
		forno Forno=new forno();
		//creo le persone ai tavoli
		tavoli nuovi=new tavoli();
		nuovi.creatavoli();
		//creo i camerieri
		camerieri cameriere1=new camerieri(nuovi,Forno);
		camerieri cameriere2=new camerieri(nuovi,Forno);
		camerieri cameriere3=new camerieri(nuovi,Forno);
		Thread cam1=new Thread(cameriere1);
		Thread cam2=new Thread(cameriere2);
		Thread cam3=new Thread(cameriere3);
		cam1.start();
		cam2.start();
		cam3.start();
	}

}
