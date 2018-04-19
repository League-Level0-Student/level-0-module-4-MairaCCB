import javax.swing.JOptionPane;

public class Vowels {
	public static void main(String[] args) {
		String phrase = JOptionPane.showInputDialog("Give me a phrase.");
		boolean containsVowela = phrase.contains("a");
		boolean containsVowele = phrase.contains("e");
		boolean containsVoweli = phrase.contains("i");
		boolean containsVowelo = phrase.contains("o");
		boolean containsVowelu = phrase.contains("u");
		boolean containsVowely = phrase.contains("y");
		boolean containsVowel = containsVowela || containsVowele || containsVoweli;
		containsVowel = containsVowel|| containsVowelo || containsVowelu || containsVowely;
		
		if (containsVowel) {
			JOptionPane.showMessageDialog(null, "Your phrase has at least one vowel.");
		}

		else {
		JOptionPane.showMessageDialog(null, "No vowels in that phrase!!!");
		}

	}
}
