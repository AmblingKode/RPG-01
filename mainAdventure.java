
import java.util.Scanner;

public class mainAdventure {
	
	public static String classPicked;
	
	//new scanner setup
	public static Scanner playerInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// setup scanner
		//Scanner playerInput = new Scanner(System.in);
		
		
		//intro + background
		System.out.println("'Welcome Adventurer!\nYou have been selected based on your particular skills to complete a special mission.\nYou see, there's a dungeon on the outskirts of the town that's been causing a few problems for the townspeople.'");
		System.out.println("'You have been tasked with defeating the dungeon and saving the townspeople who have been captured by the monsters who live inside.'");
		System.out.println("'I know it sounds dangerous, and it is, but just think of all the rewards you will earn. After you finish the dungeon everyone will know the name-'");
		System.out.println("'Right, what was your name again?'");
		String characterName = playerInput.nextLine();
		System.out.println("Yes! That's it. Everyone will know the name " +characterName +".");
		
		//this repeats until the adventurer says 'yes' to the quest 
		questStart(characterName);
		
		//after player agrees to help
		System.out.println("'Nice! Awesome! Thank you so much! I promise you won't regret this " + characterName +".'");
		System.out.println("'Okay, now let's evaluate your stats. What race are you again?'");
		System.out.println("'(Type the corresponding number)\n1) Dwarf\n2) Elf\n3) Gnome\n4) Halfling\n5) Human'");
		String raceChoice = playerInput.nextLine();
		
		//generates the player's ability scores
		AbilityScores player = new AbilityScores();
		player.raceScores(raceChoice);
		player.modifierAssignment();
		System.out.println("Oh, you're a " +player.playerRace +" are you? Okay, I've calculated your stats. Here they are:");
		System.out.println("Strength: " + player.playerStrength +"   Modifier: " +player.playerStrMod +"\nDexterity: " +player.playerDexterity +"   Modifier: " +player.playerDexMod +"\nIntelligence: " +player.playerIntelligence +"   Modifier: " +player.playerIntMod +"\nCharisma: " +player.playerCharisma +"   Modifier: " +player.playerCharMod +"\nWisdom: " +player.playerWisdom +"   Modifier: " +player.playerWisMod +"\nConstitution: " +player.playerConstitution + "   Modifier: " +player.playerConMod);
		
		//figuring out player's class
		System.out.println("'Eh, not bad.\nBy the way, you need to stock up on supplies. What class are you?'");
		System.out.println("(Type the corresponding number)\n1) Fighter\n2) Ranger\n3) Rogue -- PREMIUM CONTENT\n4) Wizard -- PREMIUM CONTENT");
		int classChoice = playerInput.nextInt();
		classAssignment(classChoice);
		/////////////////////////////////// while loop to get character info stoofs. - in the class classes
		//intro
		
		//System.out.println("Pretty nice stuff right? I know you're a bit rusty so let's take some time to practice.");
		
		
		
		
		
		
	}
	
	// very first method used; repeats until adventurer accepts his/her quest
	public static void questStart(String characterName) {
		Scanner playerInput = new Scanner(System.in);
		
		System.out.println("'So, what do you say " +characterName +"? Yes or no, will you help us?'");
		String questStartAnswer = playerInput.nextLine();
		
		while (!questStartAnswer.toLowerCase().equals("yes") )
		{
			if (questStartAnswer.toLowerCase().equals("no"))
			{
				System.out.println("'Yeah, well, you were chosen so you kind of have to do it. So, what do you say? Yes or no?'");
			}
			else
			{
				System.out.println("'I'm sorry, that's not an acceptable answer. It's yes or no. try again.'");
			}
		
			System.out.println("'So, what do you say " +characterName +"? Yes or no, will you help us?'");
			questStartAnswer = playerInput.nextLine();
		}
	}
	
	public static void classAssignment(int classChoice)
	{
		if ((classChoice >= 1) && (classChoice <=2))
		{
			if (classChoice == 1)
			{
				AbilityScores playerClass = new Fighter();
				classPicked = "Fighter";
				Fighter.tutorialBattle();
			}
			else if (classChoice == 2)
			{
				AbilityScores playerClass = new Ranger();
				classPicked = "Ranger";
				Ranger.tutorialBattle();
			}
			else if (classChoice == 3)
			{
				//AbilityScores playerClass = new Rogue();
				//classPicked = "Rogue";
			}
			else if (classChoice == 4)
			{
				//AbilityScores playerClass = new Wizard();
				//classPicked = "Wizard";
			}
		}
		else
		{
			while (!((classChoice >= 1) && (classChoice <=2)))
			{
				if ((classChoice == 3) || (classChoice == 4))
				{
					System.out.println("Sorry, this is premium content and is not currently unlocked.");
				}
				else
				{
					System.out.println("'Sorry, that doesn't work. Try again.'");
				}
				System.out.println("(Type the corresponding number)\n1) Fighter\n2) Ranger\n3) Rogue -- PREMIUM CONTENT\n4) Wizard -- PREMIUM CONTENT");
				classChoice = playerInput.nextInt();
			}
			if (classChoice == 1)
			{
				AbilityScores playerClass = new Fighter();
				classPicked = "Fighter";
				Fighter.tutorialBattle();
			}
			else if (classChoice == 2)
			{
				AbilityScores playerClass = new Ranger();
				classPicked = "Ranger";
				Ranger.tutorialBattle();
			}
			else if (classChoice == 3)
			{
				//AbilityScores playerClass = new Rogue();
				//classPicked = "Rogue";
			}
			else if (classChoice == 4)
			{
				//AbilityScores playerClass = new Wizard();
				//classPicked = "Wizard";
			}
		}
		
		
	}
	


}

