import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of animal would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int happy = 1; happy < 20; happy++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", pet, 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cuddle", "pet", "feed" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				cuddle();
			}

			else if (task == 1) {
				pet();
			}

			else {
				feed();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
if(happinessLevel >= 80) {
	JOptionPane.showMessageDialog(null, "Your pets happy!");
	break;
}
		}
	}

	static // 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	void cuddle() {
		happinessLevel += 5;
		JOptionPane.showMessageDialog(null, "Cuddle, cuddle. Your pets happiness is " + happinessLevel);
	}

	static void feed() {
		happinessLevel += 10;
		JOptionPane.showMessageDialog(null, "Yum, yum. Your pets happiness is " + happinessLevel);
	}

	static void pet() {
		happinessLevel += 7;
		JOptionPane.showMessageDialog(null, "Pet, pet. Your pets happiness is " + happinessLevel);
	}
}