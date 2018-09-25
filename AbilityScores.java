
import java.util.Random;

	
public class AbilityScores {
	public static Random generator = new Random();
	
	public boolean Fighter;
	public boolean Ranger;
	public boolean Rogue;
	public boolean Wizard;
	
	public int playerStrength = generator.nextInt(5)+10;
	public int playerStrMod;
	public int playerDexterity = generator.nextInt(5)+10;
	public int playerDexMod;
	public int playerIntelligence = generator.nextInt(5)+10;
	public int playerIntMod;
	public int playerCharisma = generator.nextInt(5)+10;
	public int playerCharMod;
	public int playerWisdom = generator.nextInt(5)+10;
	public int playerWisMod;
	public int playerConstitution = generator.nextInt(5)+10;
	public int playerConMod;
	
	public int health;
	public int armorClass = 16;
	public static String[] inventory = new String[10];
	
	
	public String size;
	public int speed;
	public String[] advantages = new String[10];
	public String playerRace;
	
	
	public void modifierAssignment() {
		playerStrMod = (playerStrength-10)/2;
		playerDexMod = (playerDexterity-10)/2;
		playerIntMod = (playerIntelligence-10)/2;
		playerCharMod = (playerCharisma-10)/2;
		playerWisMod = (playerWisdom-10)/2;
		playerConMod = (playerConstitution-10)/2;
		
	}
	
	
	
	public void raceScores(String race) {
		while (!(race.equals("1")) && !(race.equals("2")) && !(race.equals("3")) && !(race.equals("4")) && !(race.equals("5")))
		//while ((race<=0)||(race>=6))
		{
			System.out.println("Sorry, I didn't catch that. Can you answer again?");
			System.out.println("(Type the corresponding number)\n1) Dwarf\n2) Elf\n3) Gnome\n4) Halfling\n5) Human");
			race = mainAdventure.playerInput.nextLine();
		}
		//Dwarf
		if (race.equals("1"))
		{
			playerRace = "Dwarf";
			playerConstitution += 2;
			size = "Medium";
			speed = 25;
			advantages[0] = "Darkvision";
			
			
		}
		//Elf
		else if (race.equals("2"))
		{
			playerRace = "Elf";
			playerDexterity += 2;
			size = "Medium";
			speed = 30;
			advantages[0] = "Darkvision";
			
			
			
		}
		//Gnome
		else if (race.equals("3"))
		{
			playerRace = "Gnome";
			playerIntelligence += 2;
			size = "Small";
			speed = 25;
			advantages[0] = "Darkvision";
			
			
			
		}
		//Halfling
		else if (race.equals("4"))
		{
			playerRace = "Halfling";
			playerDexterity += 2;
			size = "Small";
			speed = 25;
			//lucky can reroll any time a d20 rolls a 1
			advantages[0] = "Lucky";
			
			
			
		}
		//Human
		else if (race.equals("5"))
		{
			playerRace = "Human";
			playerStrength += 1;
			playerCharisma += 1;
			size = "Medium";
			speed = 30;
			
			
			
		}
		/*
		else
		{
			System.out.println("Sorry, I didn't catch that. Can you answer again?");
			System.out.println("(Type the corresponding number)\n1) Dwarf\n2) Elf\n3) Gnome\n4) Halfling\n5) Human");
			race = mainAdventure.playerInput.nextInt();
		}
		*/
		
	}
		
}

