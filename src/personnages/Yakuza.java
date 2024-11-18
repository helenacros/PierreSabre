package personnages;

public class Yakuza extends Humain {
	private int reputation=0;
	private String clan;
	
	
	
	public Yakuza(String nom,String boisson, int argent, String clan) {
		super(nom,boisson,argent); //Seulement sa definition en tant qu'humain
		this.clan=clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" , si tu tiens à la vie donne moi ta bourse !");
		int argentDeMarco=victime.getArgent();
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+argentDeMarco+" de "+victime.getNom()+" ce qui me fait "+ (getArgent()+argentDeMarco)+" sous dans ma poche. Hi ! Hi!");
		
	}
	
	public int perdre() {
		int argent = getArgent();
		setArgent(0);
		reputation -=1;
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai dÃ©shonorÃ© le clan de " + clan);
		return argent;
	}
	
	public void gagner(int gain) {
		setArgent(getArgent() + gain);
		reputation +=1;
		parler("Ce Ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dÃ©pouillÃ© de ses " + gain + " sous.");
	} 
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de : "+clan);
	}
	
}
