package personnages;

public class Village {
	private String nom;
	private Chef chef;
	public int nbVillageois=0;
	public int nbVillageoisMaximum;
	Gaulois[] villageois = new Gaulois[nbVillageoisMaximum];
	
	public Village(String nom) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois unGaulois) {
		villageois[nbVillageois] = unGaulois;
		nbVillageois+=1;
	}
	public Gaulois trouverHabitant(int nbRefVillageois) {
		return villageois[nbRefVillageois];
	}
	public static void main(String[] args) {
		Village VillagedesIrréductibles = new Village("VillagedesIrréductibles",30);
		
	}
}

