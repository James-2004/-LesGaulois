package personnages;

public enum Equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	private String nom;
	
	Equipement(String nom){
		this.nom=nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public static void main(String[] args) {
		Equipement[] equipement = new Equipement[2];
		equipement[0] = CASQUE;
		/*equipement[1] = BOUCLIER;*/
		
		System.out.println(equipement[1]);

	}
}
