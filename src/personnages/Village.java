package personnages;

public class Village {
	private String nom;
	private Chef chef;
	public int nbVillageois=0;
	public int nbVillageoisMaximum;
	Gaulois[] villageois = new Gaulois[nbVillageoisMaximum];
	public int compteur=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
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
	public void afficherVillageois() {
		System.out.println("dans"+nom+"vivent:"+villageois[compteur]);
		compteur+=1;
	}
	
	
	public static void main(String[] args) {
		Village VillagedesIrréductibles = new Village("VillagedesIrréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// tableau est de n-1 longeur
		Chef Abraracourcix = new Chef("Abraracourcix",6,VillagedesIrréductibles);
		Abraracourcix.ajouterHabitant(Abraracourcix);
		Gaulois asterix = new Gaulois("asterix",8);
		asterix.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//

	}
	
}

