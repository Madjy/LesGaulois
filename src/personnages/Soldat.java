package personnages;

public class Soldat extends Romain{
	
	Grade grade;
	
	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	public enum Grade{
		SOLDAT, TESSERIUS, OPTIO, CENTURION;
	}
	
	
}
