package produttore_consumatore;

public class buffer {
int pari=0;
int dispari=0;
int[]array=new int[100];
int i=0;
synchronized void push(int n) {
	array[i]=n;
	i++;
  }
 synchronized void pop() {
	if(i>0) {
	i--;
	if(array[i]%2==0) {
		pari++;
	}else {dispari++;}
	System.out.println(array[i]);
	System.out.println("i pari sono: "+pari);
	System.out.println("i dispari sono: "+dispari);
	
	}
 }
}
