package personnages;

public class Romain {
	private String nom;
	private int force;
	private String minus;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("minus",-6);
		minus.prendreParole();
		minus.parler("hi");
		Gaulois asterix = new Gaulois("asterix",8);
		minus.recevoirCoup(1);
	}
}

