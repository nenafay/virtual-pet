package org.wcci.virtualpet;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		VirtualPet audrey = new VirtualPet();
		
		System.out.println("Welcome to your Audrey III virtual pet experience." + 
		"\n" + "Disclaimer: Audrey III is a carnivorous plant who feeds solely on humans and frequently bursts into song." +
		"\n" + "This may get messy." +
		"\n" + "Audrey would like to know your name. Please type it below.");
		String userName = input.nextLine();
		System.out.println("Audrey says, \" Hi, " + userName + "! Let's Play! " +
		"\n" + "You can interact with Audrey in the following ways:");

			while (audrey.isAlive()) { 
				System.out.println("press 1 to feed" +
				"\n" + "press 2 to water" +
				"\n" + "press 3 to serenade" +
				"\n" + "press 4 to leave alone");
				int interaction = input.nextInt();
				audrey.tick();
				input.nextLine();
				if (interaction == 1) {System.out.println("Please type the name of a person you would like Audrey to Eat");
					String plantFood = input.nextLine();
					audrey.eatPerson();
					System.out.println("\"Thanks, " + userName + "! " + plantFood + " was tasty!\"");
				} else if (interaction == 2) {audrey.beWatered();
					System.out.println("\"Ahhhhh! Refreshing!\"");
				} else if (interaction == 3) {audrey.beSungTo();
					System.out.println("\"Ooooh! I love it when you sing!\"");
					audrey.getEntertained();
				} else if (interaction == 4) {audrey.tick();
				} 			
			audrey.getFullness();
			if (audrey.fullness < 4 && audrey.fullness > 1) {
				audrey.isHungry();
				System.out.println("\"FEED ME, " + userName.toUpperCase() +" !\"");
			} else if (audrey.fullness <= 1) {
				audrey.feedsSelf();
				System.out.println("Audrey has eaten an innocent person.\n Oh, the humanity!");
				audrey.eatPerson();
			} else if (audrey.fullness > 7) {
				audrey.grow();
				System.out.println("Audrey sings the themesong from 'Growing Pains'.");
				audrey.getsize();
				if (audrey.size % 3 == 0) {
					System.out.println("Audrey needs to be re-potted." +
							"\n" + "To re-pot Audrey, press 1"
							+ "\n"+ "To do nothing, press 2");
					audrey.roottick();
					int repot = input.nextInt();
					if (repot == 1) {
						audrey.rootConstriction--;
						System.out.println("Audrey sings: \"Ooooh! Talk dirty to me!\"");
						} else {audrey.roottick();
						System.out.println("Audrey says, \"It's gettin tight in here!");
						}
				} else {
				} 
			}else {
			}
			audrey.getRootConstriction();
			if (audrey.rootConstriction > 3) {audrey.hasPerished();
			System.out.println("You were just too lazy to give poor Audrey a new pot."
					+ "\n" + "Now she's dead. We hope you're proud of yourself.");
			System.exit(0);
			}
			audrey.getTurgorPressure();
			if (audrey.turgorPressure < 5 && audrey.turgorPressure > 2) {
				audrey.isWilted();
				System.out.println("Audrey sings: \"Gimme some water!" + 
				"\n" +"'Cause I shot a man at the Mexican border." +
				"\n Cool, cool water!\"");
			} else if (audrey.turgorPressure <= 2) {
				audrey.isDry();
				System.out.println("Audrey sings: \"All my leaves are brown and the sky is gray.\"");
			} else if (audrey.turgorPressure == 0) {
				audrey.hasPerished();
				System.out.println("Audrey has withered away and died due to lack of water." + 
				"/n Your friends are now safe, but so are your enemies.");
				System.exit(0);
			}else {
			}
			audrey.getEntertained();
			if (audrey.entertainment < 4 && audrey.entertainment >=2) {
				audrey.complains();
				System.out.println("Audrey says: \"" + userName.toUpperCase() + ", I'm bored!\n Sing me something jazzy!\"");
			} else if (audrey.entertainment == 1) {
				audrey.isAnnoyed();
				System.out.println("Audrey says: \"" + userName.toUpperCase() + ", Sing to me NOW! \n I'm warning you!");
			} else if (audrey.entertainment > 8) {
				audrey.singsAndDances();
			}else if (audrey.entertainment == 0) {
				audrey.murdersUser();
				System.out.println("Audrey has grown bored with you and decided that you would be worth more as lunch. RIP " + userName + ".");
				System.exit(0);
			}
			System.out.println("\n Stats: \n" + audrey.fullness + " = fullness" +
				"\n" + audrey.turgorPressure + " = soil moisture"
				+ "\n" + audrey.entertainment + " = entertainment"
				 + "\n" + audrey.size + " = size");
				
				
		}
	}
}

	
		
		