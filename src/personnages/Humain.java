package personnages;

public class Humain {

	private String nom;
	private String boisson;
	private int argent;
	
	public String getNom() { 
		return nom; 
	}
	
	public String getBoisson() { 
		return boisson; 
	}
	
	public int getArgent() { 
		return argent; 
	}
		
	public Humain(String nom,String boisson,int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.setArgent(argent);
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte );
	}

	private String prendreParole() {
		return " ( L'humain : " + nom + " ) ";
	}
	
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle "+ getNom() + " et j'aime boire du "+ boisson);
	}
	
	public void boire(){
		parler("Mmmm, un bon verre de "+ getBoisson()+"! GLOUPS !");
	}
	
	
	private int gagnerArgent(int gain) {
		return setArgent(getArgent() + gain);
	}
	
	public int perdreArgent(int perte) {
		assert(getArgent()-perte >=0);
		return setArgent(getArgent() - perte);
		
	}
	
	public void acheter(String bien, int prix){
		assert(prix>0);
		if (getArgent()>prix) {
			parler("J'ai "+ getArgent()+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que"+getArgent()+" sous en poche. Je ne peux même pas m'offre un "+bien+" à "+prix+" sous...");
		
		}
	}

	public int setArgent(int argent) {
		this.argent = argent;
		return argent;
	}
}




