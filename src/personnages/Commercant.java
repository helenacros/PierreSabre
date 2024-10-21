package personnages;

public class Commercant extends Humain{

	public Commercant (String nom, int argent) {
		super(nom, "the", argent);
	}
	
    public int seFaireExtorquer() {
    	parler("J'ai tout perdu ! Le monde est trop injuste");
    	setArgent(0);
    	return getArgent();
    }
    
    public void recevoir(int argent) {
    	parler(argent+" sous ! Je te remercie généreux donateurs !");
    	setArgent(getArgent()+argent);
    }

	
}