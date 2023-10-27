package personnages;

public class Romain {
	private String nom;
	private int force;
	private String minus;
	public int nbEquipement=0;
	Equipement[] equipement = new Equipement[2];
	private String texte;

	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		} else {
//			parler("J'abandonne...");
//		}
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// 		parler("A�e");
		// } else {
		// 		equipementEjecte = ejecterEquipement();
		// 		parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("A�e");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
			// post condition la force a diminu�e
			assert force < oldForce;
			return equipementEjecte;
		}
	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
		for (int i = 0; i < nbEquipement;) {
			if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
			} else {
				System.out.println("Equipement casque");
				resistanceEquipement += 5;
			}
			i++;
		}
		texte =+ resistanceEquipement + "!";
	}
	parler(texte);
	forceCoup -= resistanceEquipement;
	return forceCoup;
}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
			}
			return equipementEjecte;
		}


	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est deja bien proteger");
			break;
		case 1:
			
				if (equipement[0] == equipement){
					System.out.println("Le soldat "+ nom + " poss�de d�j� un " + equipement + " !");
					break;
				}
				else {
					nbEquipement+=1;
					equipement[0] = Equiement.CASQUE;
					System.out.println("Le soldat "+ nom + "s'equipe avec un " + equipement + " !");

				}
				
		break;
		
		case 0:
			switch(equipement) {
			case CASQUE:
				nbEquipement+=1;
				equipement[0] = Equiement.CASQUE;
				System.out.println("Le soldat "+ nom + "s'equipe avec un " + equipement + " !");
				break;
			case BOUCLIER:
				nbEquipement+=1;
				equipement[0] = Equiement.BOUCLIER;
				System.out.println("Le soldat "+ nom + "s'equipe avec un " + equipement + " !");
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
			
	}
		

	public static void main(String[] args) {
		Romain minus = new Romain("minus",-6);
		minus.prendreParole();
		minus.parler("hi");
		Gaulois asterix = new Gaulois("asterix",8);
		minus.recevoirCoup(1);
		Equipement CASQUE = new Equipement("casque");
		Equipement BOUCLIER = new Equipement("bouclier");
	}
}

