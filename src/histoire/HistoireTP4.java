package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main (String [] args){
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson",12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.acheter("kimono",50);
		
		System.out.println("\n");
		
		Commercant marco= new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("\n");
		
		Yakuza yaku=new Yakuza("Yaku le Noir","Whisky",30,"Warsong",0);
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		System.out.println("\n");
		
		Ronin roro=new Ronin("Roro","shochu",60,2);
		roro.direBonjour();
		roro.donner(marco);

	}
}
