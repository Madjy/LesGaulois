package sites;

import personnages.Soldat;
import personnages.Soldat.Grade;

public class Camp {
	private Soldat commandant;
	private Soldat[] membre = new Soldat[3];
	private int nbSoldats = 0;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain.");
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat nouveauSoldat) {
		if (nbSoldats < membre.length) {
			membre[nbSoldats] = nouveauSoldat;
			nbSoldats ++;
			nouveauSoldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() + ".");
		} else {
			commandant.parler("Désolé "+nouveauSoldat.getNom()+" notre camp est complet !");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+ commandant.getNom()+" contient les soldats : ");
		for (int i=0; i<nbSoldats;i++) {
			System.out.println("- "+membre[i].getNom());
		}
	}
	
	public void changerCommandant(Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade()== Grade.CENTURION) {
			commandant = nouveauCommandant;
			for (int i=0; i<membre.length;i++) {
				if (membre[i].getNom()==commandant.getNom()) {
					membre[i]=null;
					nbSoldats--;
				}
			}
			nouveauCommandant.parler("Moi "+ nouveauCommandant.getNom()+" je prends la direction du camp romain.");
		} else {
			nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		}
	}
}
