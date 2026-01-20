package personnages;

public class Gaulois extends Personnage{
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "Le Gaulois";
	}
}

