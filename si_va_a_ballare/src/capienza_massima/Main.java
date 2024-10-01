package capienza_massima;
public class Main {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			registratore register=new registratore();
			Thread reg=new Thread(register);
			reg.start();
			for(int i=0;i<50;i++) {
			discoteca cliente=new discoteca(register);
			Thread nuovo=new Thread(cliente);
			nuovo.start();
			}

		
	}

}
