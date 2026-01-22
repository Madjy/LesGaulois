package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Grade;
import sites.Village;
import sites.Camp;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 2, Grade.CENTURION);
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);

		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);

		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 5, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);

		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);

		village.ajouterGaulois(agecanonix);
		village.ajouterGaulois(assurancetourix);
		village.ajouterGaulois(asterix);
		village.ajouterGaulois(obelix);
		village.ajouterGaulois(prolix);

		village.afficherVillagois();
		camp.afficherCamp();

		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		village.changerChef(abraracourcix);

		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
