import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	
static int mestKaulinu(int reizes) {
	int skaitlis = 0;
	Random rand = new Random();
	for(int i=0; i<reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
	}
	return skaitlis;
}
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int reizes = 0, izvele, pedejais = 0;
do {
System.out.println("1-Mest kauliņu |2-Apskatīt pēdējo |3-Apturēt");
izvele = scan.nextInt();
switch(izvele){
	case 1:
	do {
System.out.println("Cik reizes mest kauliņu");
	reizes = scan.nextInt();
	pedejais = mestKaulinu(reizes);
	}while(reizes < 1);
	break;
	case 2:
	System.out.println("Pēdējais uzmestais ir "+pedejais);	
	break;
	case 3:
	System.out.println("rogramma apturēta!");
	break;
}
}while(izvele!=2);

scan.close();
	}

}