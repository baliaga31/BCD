package tp2;

import java.util.Scanner;


/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'étudiant, par defaut, la valeur sera "nom inconnu"
	private String nom = "nom inconnu";
	
	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)
	private int age; // par defaut la valeur est 0
	private double note_prog; // par defaut la valeur est 0
	private double note_sys; // par defaut la valeur est 0
	private double note_stage; // par defaut la valeur est 0
	
	// ecriture alternative
	//private double noteProg, noteSyst, noteStage
	
	/***************************************************************************/
	
	
	
	/********************Partie Constructeurs ***************************/
	
	//Constructeur par défaut qui ne contient aucun parametre et aucun attribut
	public Etudiant(){
		System.out.println("appel constructeur sans parametre");
	}
	
	
	//Constructeur qui contient seulement un parametre pour initialiser l'attribut nom 
	public Etudiant(String name){ // le nom du parametre est formel cf f(x) = x^2 f(y) = y^2
		this.nom = name; // this done acces a l'atribut 'nom' de l'objet
			// this represente, dans une operation, l'objet pour lequel
			// sur lequel on execute l'operation
	}
	
	// classe = boite {}
	// constructeur = boite incluse dans la classe {}
	// porte de nom
	// on cherche la declaration la plus proche en partant de la boite la plus interne
	// et en remontant de boite en boite si besoin
	
		
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf les notes de l'étudiant
	public Etudiant(String name, int age_etu) {
		this.nom = name;
		this.age = age_etu;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age de l'étudiant
	public Etudiant(String name, double prog, double sys, double stage) {
		this.nom = name;
		this.note_prog = prog;
		this.note_sys = sys;
		this.note_stage = stage;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tous les attributs
	public Etudiant(String name, int age_etu, double prog, double sys, double stage) {
		this.nom = name;
		this.age = age_etu;
		this.note_prog = prog;
		this.note_sys = sys;
		this.note_stage = stage;
	}
		
	
	/***********************************************************************/
	
	
	/*************************************Partie Accesseurs ***********************/
	
	/* Accesseurs de l'attribut nom : 
		getNom qui retourne la valeur du nom (lecture)
		setNom qui initialise la valeur du nom (ecriture, modification)
	 */
	
	// signature - entete
	// operation 'public', qui retroune une String, qui s'appelle 'getNom'
	// avec une lliste de parametre vide '()'
	// get + identificateur de l'attribut commencant par majuscule
	// conventionnel mais recommande
	public String getNom() {
		return this.nom;
	}
	
	
	public void setNom(String name) {
		this.nom = name;
	}
	
	/* Vous devez ci-dessous créer les accesseurs pour les autres attributs : */
		
	//Accesseurs de l'age
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age_etu) {
		this.age = age_etu;
	}
	
	//Accesseurs des notes
	public double getNote_prog() {
		return this.note_prog;
	}
	
	public void setNote_prog(int prog) {
		this.note_prog = prog;
	}
	
	public double getNote_sys() {
		return this.note_sys;
	}
	
	public void setNote_sys(int sys) {
		this.note_sys = sys;
	}
	
	public double getNote_stage() {
		return this.note_stage;
	}
	
	public void setNote_stage(int stage) {
		this.note_stage = stage;
	}
	
/***********************************************************************************/
	
	
	
	
	
/****************************** Partie méthodes ***************************************/	
	
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant. 
	Méthode à décommenter et à modifier ci-dessous */
		
	
		public String toString() {
			return "Etudiant : " + this.nom + " " + this.age +" ans Note Programmation :" + this.note_prog + " Note Systeme : " + this.note_sys + " Note Stage : " + this.note_stage;
		}
	
	
	/* Méthode saisie qui permet à l'utilisateur de saisir les informations des étudiants et de les initialiser. 
	 Méthode à écrire intégralement en vous inspirant du TP1  */
		public void saisie(Scanner sc) {
			System.out.println("Veuillez saisir le prenom : ");
			this.nom = sc.nextLine(); // read user input
			System.out.println("Bien enregistre ? \n" + nom + "\n Quel age il a ? ");
			this.age = sc.nextInt();
			System.out.println("Veuillez saisir la note de programmation : ");
			this.note_prog = sc.nextDouble();
			System.out.println("Veuillez saisir la note systeme : ");
			this.note_sys = sc.nextDouble();
			System.out.println("Veuillez saisir la note de stage : ");
			this.note_stage = sc.nextDouble();
		}
	
	
	/* Méthode moyenne à décommenter et à remplir */
	
		public double moyenne(){
		 	return (this.note_prog + this.note_sys + this.note_stage)/3;
		}
	
	
	/* Méthode mention à écrire ci-dessous. 
	 Cette méthode utilise la méthode moyenne définie précédemment 
	 et retourne une chaine de caractère qui correspond à la mention de l'étudiant dont les valeurs possibles sont :
	 Ajourné, passable, AB, Bien, TB */
		public String mention() {
			double moyenne = this.moyenne();
			if (moyenne < 10) 
				 return "Ajourne";
			else
				if (moyenne < 12)
					return "Passable";
				else
					if (moyenne < 14)
						return "Assez Bien:";
					else
						if (moyenne < 16)
							return "Bien";
					else return "Tres Bien";
		}
	
	
	/* Methode ligneResultat à écrire ci-dessous 
	 * Cette méthode utilise le résultat de moyenne et de mention
	 * et retourne une chaine de caractère précisant :
	 * le nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des modules obtenus
	 */
	
	

}

