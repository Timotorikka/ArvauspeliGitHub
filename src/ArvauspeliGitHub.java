import java.util.Scanner;

public class ArvauspeliGitHub {

	public static void main(String[] args) {
		
		// Tuodaan ensin skanneri käyttäjänsyötettä varten sekä laskuri arvauksia varten ja muuttuja nimelle
		Scanner in = new Scanner(System.in);
		int arvaukset = 0;
		String nimi;
			
			// Lisätään do while looppi, jolla pyydetään käyttäjää arvaamaan nimi ja toistetaan niin kauan kunnes arvaa oikein
			do
			{
			System.out.println("Arvaa nimi");			
			nimi = in.nextLine();			
			if(nimi.equals("Pentti"))
				System.out.println("Arvasit oikein, paljon onnea!");
			
			
			} while (!nimi.equals("Pentti"));

	} // Mainin loppu

}
