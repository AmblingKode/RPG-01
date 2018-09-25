
import java.util.Arrays;

public class Ranger extends AbilityScores {
	public int rangerHealth = 10 + playerConMod;
	
	public Ranger() {
		this.Ranger = true;
		
		inventory[0] = "leather armor";
		inventory[1] = "shortsword";
		inventory[2] = "shortsword";
		inventory[3] = "longbow";
		inventory[4] = "arrows";
		showInventory();

	}
	
	public void showInventory() {
		System.out.println("Here is your inventory");
		for (int i = 0; i < inventory.length - 1; i++)
		{
				System.out.println("Slot " +i +": " +inventory[i]);
		}	
	}


	public static void tutorialBattle() {
		System.out.println("'Okay, so I know it's been a while and that's why...\nWe're going to practice!\nOn this:'");
		System.out.println("An orc suddenly appears in front of you. He looks around, confused, stopping after a minute to focus his attention on you.\nHe doesn't look happy");
		System.out.println("'Remember the different actions you can take.\nYou can either 'attack', 'defend', or 'flee' although fleeing won't get you very far right now.'");
		System.out.println("'He looks like he wants to attack you. You should probably 'defend' right now.'\nThe orc starts charging for you.");
		String defense = mainAdventure.playerInput.nextLine();
		
		while (!(defense.toLowerCase().equals("defend")))
		{
			System.out.println("'You have to defend yourself right now!'\n'Come on! I know you're not that stupid!'\n(try typing 'defend')");
			defense = mainAdventure.playerInput.nextLine();
		}
		System.out.println("'Rangers don't carry shields to defend themselves and since you don't have any potions, you have to stick with a simple 'dodge' for now.'");
		String defenseItem = mainAdventure.playerInput.nextLine();
		
		while (!((defenseItem.toLowerCase().equals("dodge"))))
		{
			if (Arrays.asList(inventory).contains(defenseItem))
			{
				System.out.println("You can't use that to defend. Try again.\n(Remember: because you are a ranger you can 'dodge')");
				defenseItem = mainAdventure.playerInput.nextLine();
			}
			else
			{
				System.out.println("You don't have one of those. Try again.\n(Remember: because you are a fighter you can 'dodge')");
				defenseItem = mainAdventure.playerInput.nextLine();
			}
			
		}
		System.out.println("'Cool! You completely missed the attack! Just remember you can't always get out of the way in time'.\n'It looks like he's trying to get back up so you can 'attack' him while he's down'");
		String attack = mainAdventure.playerInput.nextLine();
		
		while (!(attack.toLowerCase().equals("attack")))
		{
			System.out.println("'You have to attack him while you can!'\n'Come on! I know you're not that slow!'\n(try typing 'attack')");
			attack = mainAdventure.playerInput.nextLine();
		}
		System.out.println("What would you like to use to attack?");
		String attackItem = mainAdventure.playerInput.nextLine();
		
		while (!(attackItem.toLowerCase().equals("shortsword") || (attackItem.toLowerCase().equals("longbow")) || attackItem.toLowerCase().equals("sword") || (attackItem.toLowerCase().equals("bow"))))
		{
			if (Arrays.asList(inventory).contains(attackItem))
			{
				System.out.println("You can't use that to attack. Try again.\n(Remember: because you are a ranger you have a shortsword and a longbow)");
				attackItem = mainAdventure.playerInput.nextLine();
			}
			else
			{
				System.out.println("You don't have one of those. Try again.\n(Remember: because you are a ranger you have a shortsword and a longbow)");
				attackItem = mainAdventure.playerInput.nextLine();
			}
		}
		System.out.println("You start attacking the orc but he easily dodges you. He seems to be even angrier than earlier.\n'Ummm...\nI might have summoned an orc a bit too powerful for you...\nYou should probably 'flee' before he kills you'");
		String retreat = mainAdventure.playerInput.nextLine();
		
		while (!(retreat.toLowerCase().equals("flee")))
		{
			System.out.println("I don't know what you did wrong but you should probably try again before the orc kills you.\n(try typing 'flee')");
			retreat = mainAdventure.playerInput.nextLine();
		}
		
		System.out.println("'Okay so maybe you aren't all that great after all. You can go now. I don't think we'll be needing help from the likes of you anytime soon.'");
		
	}
	











}









	//leather armor
	//two shortswords
	//longbow
	//20 arrows
	/*
	 * *****Ranger
		health
			HP 1d10 or 6 + con mod
			hit dice 1d10
		proficiencies
			armor
				light
				medium
				shields
			saving throws
				strength
				dex
		equiptment
			scale mail/leather armor
			two shortswords
			dungeoneer's pack/explorer's pack
			longbow and a quiver of 20 arrows
			(buff a bit)
	 */
	


