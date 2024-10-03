package pizzeria;
import java.util.Random;
public class forno {

	int sforna() {
		Random rand=new Random();
		int pizze=1+rand.nextInt(8);
		return pizze;
	}
}
