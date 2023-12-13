package decembre2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class code {
	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("./src/decembre2/input.txt"), StandardCharsets.UTF_8);

		String[] tab = new String[lines.size()];
		int[] tab1 = new int[lines.size()];
		int[] tab2 = new int[lines.size()];
		int[] tab3 = new int[lines.size()];
		int calcule = 0, plus = 0;
		int valeur1, valeur2, valeur3;

		for (int i = 0; i < lines.size(); i++) {
			tab = lines.get(i).split("x");
			tab1[i] = Integer.parseInt(tab[0]);
			tab2[i] = Integer.parseInt(tab[1]);
			tab3[i] = Integer.parseInt(tab[2]);
			valeur1 = tab1[i] * tab2[i];
			valeur2 = tab2[i] * tab3[i];
			valeur3 = tab3[i] * tab1[i];
			if (valeur1 <= valeur2 && valeur1 <= valeur3) {
				plus = valeur1;
			}
			if (valeur2 <= valeur1 && valeur2 <= valeur3) {
				plus = valeur2;
			}
			if (valeur3 <= valeur1 && valeur3 <= valeur2) {
				plus = valeur3;
			}
			calcule += 2 * (valeur1) + 2 * (valeur2) + 2 * (valeur3) + plus;
		}
		System.out.println(calcule + " pied carré de papier cadeau");

		calcule = 0;
		valeur1 = 0;
		valeur2 = 0;
		valeur3 = 0;
		int[] tempo = new int[3];

		// Partie 2
		for (int i = 0; i < lines.size(); i++) {
			tab = lines.get(i).split("x");
			tab1[i] = Integer.parseInt(tab[0]);
			tab2[i] = Integer.parseInt(tab[1]);
			tab3[i] = Integer.parseInt(tab[2]);
			valeur1 = tab1[i];
			valeur2 = tab2[i];
			valeur3 = tab3[i];
			tempo[0] = valeur1;
			tempo[1] = valeur2;
			tempo[2] = valeur3;
			Arrays.sort(tempo);
			valeur1 = tempo[0];
			valeur2 = tempo[1];
			valeur3 = tempo[2];
			calcule += valeur1 + valeur1 + valeur2 + valeur2;
			calcule += valeur1 * valeur2 * valeur3;
		}
		System.out.println(calcule + " pied carré de ruban");
	}
}