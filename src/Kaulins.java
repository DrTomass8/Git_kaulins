import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	
static void mestKaulinu(int reizes) {
	int skaitlis, lielakais=0;
	Random rand = new Random();
	for(int i=0; i<reizes; i++) {
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita skaitlis: "+skaitlis);
	if(lielakais<skaitlis)
		lielakais=skaitlis;
	}
	System.out.println("Lielākais skaitlis no visiem uzmestajiem: "+lielakais);
}
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int reizes = 0, izvele;
do {
System.out.println("1-Mest kauliņu |2-Apturēt");
izvele = scan.nextInt();
switch(izvele){
	case 1:
	do {
System.out.println("Cik reizes mest kauliņu");
	reizes = scan.nextInt();
	
	}while(reizes < 1);
	break;
	case 2:
	System.out.println("rogramma apturēta!");
	break;
}
}while(izvele!=2);
mestKaulinu(reizes);
scan.close();
	}

}
