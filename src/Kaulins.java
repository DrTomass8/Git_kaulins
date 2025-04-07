import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	
static int mestKaulinu(int reizes) {
	int skaitlis = 0;
	Random rand = new Random();
	for(int i=0; i<reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		if(leilakais<skaitlis){
			lielakais=skaitlis;
	}
	}
	System.out.println("Lielākais skaitlis metienu piegajienā ir +lielakais");
	return skaitlis;
}
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int reizes = 0, izvele;
List<Integer> pedejie = new ArrayList<Integer>();
do {
System.out.println("1-Mest kauliņu |2-Apskatīt pēdējo |3 - Apskatīt lielāko |4-Apturēt");
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
	System.out.println("Pēdējais uzmestais ir ");
for(int i=0; i<pedejie.size(); i++){
		pedejie.get(i);
}
	break;
	case 3:
	itn lielakais=0;
	for(int i=0; i<pedejie.size(); i++){
		if(pedejie.get(i)>lielakais){
			lielakais = pedejie.get(i);
		}
		System.out.println("Lielākais skaitlis pedeja metiena ir "+lielakais);
	}
	break;
	case 4:
	System.out.println("rogramma apturēta!");
	break;
}
}while(izvele!=2);

scan.close();
	}

}
