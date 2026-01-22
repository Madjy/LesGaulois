package sites;

import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Grade;

public class Village {
	
	private Gaulois chef;
	private Gaulois[] membre = new Gaulois[4];
	private int nbGaulois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterGaulois(Gaulois nouveauGaulois) {
		if (nbGaulois < membre.length) {
			membre[nbGaulois] = nouveauGaulois;
			chef.parler("Bienvenue " + nouveauGaulois.getNom() + " !");
			nbGaulois ++;
		} else {
			chef.parler("Désolé "+nouveauGaulois.getNom()+" mon village est déjà bien rempli");
		}
	}
		
	public void afficherVillagois(Village village) {
		System.out.println("Le village de "+village.getChef().getNom()+" est habité par :");
		for (int i=0; i<village.nbGaulois;i++) {
			System.out.println("- "+membre[i].getNom());
		}
	}
	
	public void changerChef(Gaulois nouveauChef) {
		chef.parler("Je laisse mon grand bouclier au grand "+nouveauChef.getNom());
		chef = nouveauChef;
		for (int i=0; i<membre.length;i++) {
			if (membre[i].getNom()==chef.getNom()) {
				membre[i]=null;
			}
		}
		chef.parler("Merci !");
	}
}