package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom,String boisson, int argent,int honneur){
		super(nom,boisson,argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentRonin= (int) (getArgent()*0.1);
		parler(beneficiaire.getNom()+" prend ces "+ argentRonin+" sous");
		beneficiaire.recevoir(argentRonin);
		setArgent(getArgent()-argentRonin);
		honneur+=1;
	}
}
