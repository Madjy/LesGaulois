package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(donnerAuteur() + nom + ": << " + texte + " >>." );
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur() + nom + " envoie un grand coup dans la mâchoir de " + nom +".");
        adversaire.recevoirCoup(force / 3);
	}
	
	protected abstract String donnerAuteur();
	
	public void recevoirCoup(int forceCoup) {
		if (forceCoup > force) {
			force = 0;
		} else {
			force -= forceCoup;
		}
		if (force < 1) {
			parler("J'abandonne...");
		} else {
			parler("Aïe !");
		}
	}
}
