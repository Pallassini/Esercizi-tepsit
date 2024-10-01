package multi_stanza;
public class Main {

	public static void main(String[] args) {
		registratore register=new registratore();
		Thread reg=new Thread(register);
		reg.start();
		for(int i=0;i<20;i++) {
		discoteca cliente=new discoteca(register);
		Thread nuovo=new Thread(cliente);
		nuovo.start();
		}

	}

}
