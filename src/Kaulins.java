import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	

static int mestKaulinu() {
	Random rand = new Random();
	int skaitlis = rand.nextInt(6)+1;

	return skaitlis;
}
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int reizes = 0, izvele, lielakais=0;
List<Integer> pedejie = new ArrayList<Integer>();
do {
System.out.println("1-Mest kauliņu |2-Apskatīt pēdējo |3 - Apskatīt lielāko |4-Apturēt");
izvele = scan.nextInt();
switch(izvele){
	case 1:
	do {
System.out.println("Cik reizes mest kauliņu");
	reizes = scan.nextInt();
	
	}while(reizes < 1);
	pedejie.add(mestKaulinu());
	break;
	case 2:
	System.out.println("Pēdējā metiena skaitļi ir ");
for(Integer i : pedejie){
		System.out.println(i+" ");
}
System.out.println();
	break;
	case 3:
	
	for(int i=0; i<pedejie.size(); i++){
		if(pedejie.get(i)>lielakais){
			lielakais = pedejie.get(i);
		}

	}
	System.out.println("Lielākais skaitlis pedeja metiena ir "+lielakais);
	break;
	case 4:
	System.out.println("Programma apturēta!");
	break;
}
}while(izvele!=4);

scan.close();
	}

}