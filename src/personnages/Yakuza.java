package personnages;

public class Yakuza extends Humain {
	private int reputation=0;
	private String clan;
	
	
	public Yakuza(String nom,String boisson, int argent, String clan) {
		super(nom,boisson,argent); //Seulement sa definition en tant qu'humain
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+" , si tu tiens à la vie donne moi ta bourse !");
		int argentDeMarco=victime.getArgent();
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+argentDeMarco+" de "+victime.getNom()+" ce qui me fait "+ (getArgent()+argentDeMarco)+" sous dans ma poche. Hi ! Hi!");
		
	}
	

}
