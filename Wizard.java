
public class Wizard extends AbilityScores {
	public int wizardHealth = 6 + playerConMod;
	
	public Wizard() {
		this.Wizard = true;
		
		inventory[0] = "Quarterstaff";
		inventory[1] = "Magic";
		inventory[2] = "Spellbook";
		inventory[3] = "Robes";
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








	//quarterstaff
	//magic
	//spellbook
	//robes
	/*
	 * *****Wizard
		health
			1st lvl: 6 + con mod
			HP 1d6 or 4 + con mod
			hit dice 1d6
		proficiencies
			saving throws
				int
				wis
		equiptment
			quarterstaff/dagger
			component pouch/arcane focus
			scholar's pack/explorer's pack
			spellbook
	 */
	



