

public class Rogue extends AbilityScores {
	public int rogueHealth = 8 + playerConMod;
	
	public Rogue() {
		this.Rogue = true;
		
		inventory[0] = "Rapier";
		inventory[1] = "Shortsword";
		inventory[2] = "Leather Armor";
		inventory[3] = "Dagger";
		inventory[4] = "Dagger";
		showInventory();

	}
	
	public void showInventory() {
		System.out.println("Here is your inventory");
		for (int i = 0; i < inventory.length - 1; i++)
		{
				System.out.println("Slot " +i +": " +inventory[i]);
		}	
	}
}







	//rapier
	//shortsword
	//leather armor
	//two daggers
	//crit chance
	/*
	 * *****Rogue
		health
			HP 1d8 or 5 + con mod
			hit dice 1d8
		proficiencies
			armor
				light
			saving throws
				dex
				int
		equiptment
			rapier/shortsword
			shortbow and 20 arrows/ shortsword
			burglar's pack/dungeoneer's pack/explorer's pack
			leather armor
			two daggers
			theives tools
		(add better crit chance(sneak attack))
			
	 */
	


