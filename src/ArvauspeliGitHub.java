import java.util.Scanner;

public class ArvauspeliGitHub {

	public static void main(String[] args) {
		
		// Tuodaan ensin skanneri käyttäjänsyötettä varten sekä laskuri arvauksia varten ja muuttuja nimelle
		Scanner in = new Scanner(System.in);
		int arvaukset = 0;
		String nimi;
			
			// Lisätään do while looppi, jolla pyydetään käyttäjää arvaamaan nimi
			// Toistetaan niin kauan kunnes arvaa nimen oikein "Pentti" tai syöttää "loppu"
			do
			{
			System.out.println("Arvaa nimi");			
			nimi = in.nextLine();
			
				// If lauseke joka tarkistaa oliko nimi "loppu" ja silloin ei lisää arvauskertojen määrää
				if (!nimi.equals("loppu"))
					arvaukset++;
				
				// If lauseke joka tarkistaa oliko arvaus "Pentti"
				if(nimi.equals("Pentti"))
				System.out.println("Arvasit oikein, paljon onnea!");
			
			
			  // Do While loopin loppu
			} while (!nimi.equals("Pentti") && !nimi.equals("loppu"));
			  
			  // Lisätään koodin loppuun montako kertaa käyttäjä arvasi
			  System.out.println("Arvasit " + arvaukset + " kertaa.");
			  
	} // Mainin loppu

}
