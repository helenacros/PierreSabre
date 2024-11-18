package personnages;

public class Traitre extends Samourai {
	private int maitrise=0;
	
	public Traitre(String nom, String boisson, String seigneur, int argent) {
		super(nom,boisson,seigneur,argent);
		this.maitrise=0;
	}
	
	@Override 
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : "+maitrise+" Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (maitrise<3) {
			int argentRanconner=commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			maitrise++;
			parler(" Si tu veuc ma protection contre les Yakuzas, il va falloir payer ! Donne moi "+argentRanconner+" sous ou gare à toi");
			commercant.parler("Tout de suite grand "+this.getNom());
			
		}
		else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me démasquer ");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance <1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif ..");
		}
		else {
			 Humain humain =memoire[ (int) (Math.random() * nbConnaissance)];
			 int don=getArgent()*1/20;
			 String nomAmi=humain.getNom();
			 parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
			 parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don +" sous.");
			 humain.gagnerArgent(don);
			 perdreArgent(don);
			 humain.parler("Merci "+getNom()+". Vous êtes quelqu'un de bien.");
			
		}
		if(maitrise >1) {
			maitrise-=1;
		}
	}
}
