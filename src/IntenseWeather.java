import javax.swing.JOptionPane;

public class IntenseWeather {
public static void main(String[] args) {
	
	for(int l = 1; l < 9; l++) {
		
	String T = JOptionPane.showInputDialog("What is the temperature (F)");
	int temp = Integer.parseInt(T);
		
	if(temp < 0) {
		JOptionPane.showMessageDialog(null, "Don't turn into a popsicle!");
	}
	
	else if(0 <= temp && temp < 40){
		JOptionPane.showMessageDialog(null, "Wear a jacket!");
	}
	
	else if(40 <= temp && temp < 90) {
		JOptionPane.showMessageDialog(null, "The weather is not too bad!");
	}
	
	else{
		JOptionPane.showMessageDialog(null, "Don't forget your sunscreen!");
	}
	}
}
}
