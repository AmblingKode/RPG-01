import java.util.Arrays;

public class Fighter extends AbilityScores {
	public int fighterHealth = 10 + playerConMod;
	
	public Fighter() {
		this.Fighter = true;
		
		inventory[0] = "chain mail";
		inventory[1] = "sword";
		inventory[2] = "wooden shield";
		inventory[3] = "crossbow";
		inventory[4] = "bolts";
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
		System.out.println("What would you like to use to defend?");
		String defenseItem = mainAdventure.playerInput.nextLine();
		
		while (!((defenseItem.toLowerCase().equals("shield")||(defenseItem.toLowerCase().equals("wooden shield")))))
		{
			if (Arrays.asList(inventory).contains(defenseItem))
			{
				System.out.println("You can't use that to defend. Try again.\n(Remember: because you are a fighter you have a wooden shield)");
				defenseItem = mainAdventure.playerInput.nextLine();
			}
			else
			{
				System.out.println("You don't have one of those. Try again.\n(Remember: because you are a fighter you have a wooden shield)");
				defenseItem = mainAdventure.playerInput.nextLine();
			}
			
		}
		System.out.println("'Cool! You blocked all of the damage! Just remember it won't always protect you that much'.\n'It looks like he's trying to get back up so you can 'attack' him while he's down'");
		String attack = mainAdventure.playerInput.nextLine();
		
		while (!(attack.toLowerCase().equals("attack")))
		{
			System.out.println("'You have to attack him while you can!'\n'Come on! I know you're not that slow!'\n(try typing 'attack')");
			attack = mainAdventure.playerInput.nextLine();
		}
		System.out.println("What would you like to use to attack?");
		String attackItem = mainAdventure.playerInput.nextLine();
		
		while (!((attackItem.toLowerCase().equals("sword")||(attackItem.toLowerCase().equals("crossbow")))))
		{
			if (Arrays.asList(inventory).contains(attackItem))
			{
				System.out.println("You can't use that to attack. Try again.\n(Remember: because you are a fighter you have a sword and a crossbow)");
				attackItem = mainAdventure.playerInput.nextLine();
			}
			else
			{
				System.out.println("You don't have one of those. Try again.\n(Remember: because you are a fighter you have a sword and a crossbow)");
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

	








	
	
	//chain mail
	//Sword
	//Wooden Shield  
	//light crossbow
	//20 bolts
	/*
	 *Fighter
		health
			HP 1d10
			hit dice 1d10 or 6 + Constitution mod
		proficiencies
			armor
				all armor
				shields
			saving throws
				str
				con
	 */

