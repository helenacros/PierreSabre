package personnages;

public class Humain {

	private int MAX=30;
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance=0; 
	protected Humain[] memoire = new Humain[MAX];
	
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
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	protected void memoriser(Humain autreHumain) {
		if(nbConnaissance <MAX) {
			memoire[nbConnaissance]=autreHumain;
			nbConnaissance+=1;
		}
		else {
			for(int i=0;i<nbConnaissance-1;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissance-1]=autreHumain;
		}	
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	
	public void listerConnaissance() { 
		System.out.print(prendreParole()+"Je connais beaucoup de monde : ");
		for (int i = 0; i < nbConnaissance; i++) {
	        if (memoire[i] != null) {
	            System.out.print(memoire[i].getNom());
	            if (i < nbConnaissance - 1) {  
	                System.out.print(", ");
	            }
	        }
	    }
	    System.out.println(); 
	}

	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte );
	}

	private String prendreParole() {
		return " ( " + nom + " ) - ";
	}
	
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle "+ getNom() + " et j'aime boire du "+ boisson);
	}
	
	public void boire(){
		parler("Mmmm, un bon verre de "+ getBoisson()+"! GLOUPS !");
	}
	
	
	public int gagnerArgent(int gain) {
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




