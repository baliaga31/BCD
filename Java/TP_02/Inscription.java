package tp2;

public class Inscription {
	
	/******************** Partie attributs ****************************************/
	private int codeInscription;
	private int codePays;
	
	/******************** Partie Constructeurs ************************************/
	public Inscription(){
		System.out.println("appel constructeur sans parametre");
	}
	
	public Inscription(int codeInsc, int codePa){
		this.codeInscription = codeInsc;
		this.codePays = codePa;
	}
	
	/******************** Partie Accesseurs ***************************************/
	public int getCInsc() {
		return this.codeInscription;
	}
	
	public void setCInsc(int codeInsc) {
		this.codeInscription = codeInsc;
	}
	
	public int getCPa() {
		return this.codePays;
	}
	
	public void setCPa(int codePa) {
		this.codePays = codePa;
	}
	
	/******************** Partie méthodes *****************************************/	
	
	
}