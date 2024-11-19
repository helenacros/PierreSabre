package personnages;

public class GrandMere extends Humain{
	
	public GrandMere(String nom, int argent) {
		super(nom,"tisane",argent);
	}
	
	
	private enum TypeHumain {
		HABITANT("Habitant"),COMMERCANT("Commercant"),RONIN("Ronin"),SAMOURAI("Samourai"),YAKUZA("Yakuza"),GRANDMERE("Grand-mère");
		
		private String nom;
		
		private TypeHumain(String nom){
			this.nom=nom;
		}
		public String toString(){
			return nom;
			
		}
	}
	
	
	@Override 
	protected void memoriser(Humain nvHumain) {
		if (nbConnaissance<=5) {
		super.memoriser(nvHumain);
		}
		else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire");
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types= TypeHumain.values();
		TypeHumain humain=types[ (int) (Math.random() * 5)]; // car c'est un tableau de TypeHumain
		return humain.nom; // car c'est un attribut de la classe 
	}
	
	public void ragoter() {
		for(int i=0; i<nbConnaissance ; i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que "+memoire[i].getNom()+" est un traitre. Petit chenapan !");
			}
			else {
				parler("Je crois que "+memoire[i].getNom()+" est un "+humainHasard()+".");
			}
		}
		
	}
}
