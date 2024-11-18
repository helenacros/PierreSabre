package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom,String boisson, int argent){
		super(nom,boisson,argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentRonin= (int) (getArgent()*0.1);
		parler(beneficiaire.getNom()+" prend ces "+ argentRonin+" sous");
		beneficiaire.recevoir(argentRonin);
		setArgent(getArgent()-argentRonin);
		honneur+=1;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur+honneur;
		parler("Je t'ai retrouvÃ© vermine, tu vas payer pour ce que tu as fais Ã  ce pauvre marchand !");
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakusa !");
			int gain = adversaire.perdre();
			setArgent(getArgent() + gain);
			honneur+=1;
		}
		else {
			honneur-=1;
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(getArgent());
			setArgent(0);
		}
	}
}
