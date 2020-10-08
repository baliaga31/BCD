package tp2;

import java.io.IOException;
import java.util.Scanner;

public class MainEtudiant {

	public static void main(String[] args) throws IOException {
		
		 
		 /***********************Constructeurs *******************************************/
			// creation d'un nouvel etudiant de nom est inconu
			Etudiant etud0 // declare la variable etud0
				= new Etudiant(); // creer l'objet/instance Etudiant
							// appel du constructeur sans parametre
							// this = etud0
		
			//Création d'un nouvel étudiant dont le nom est paul  
			Etudiant etud1 = new Etudiant("Paul");  // creer l'objet/l'instance Etudiant
													// appel du constructeur avec 1 parametre (nom)
													// this = etud0
													// valeur reelle du parametre = "Paul"
		
			//En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les autres étudiants  
			Etudiant etud2 = new Etudiant("Jean", 24);
			Etudiant etud3 = new Etudiant("Abdoulkhader", 23);
			Etudiant etud4 = new Etudiant("Astrid", 26);
			Etudiant etud5 = new Etudiant("Paolo", 27);
			Etudiant etud6 = new Etudiant("Zoe", 26, 12, 14, 17);			
		
		/***********************************Accesseurs*****************************************/
		
		/* Affichage des informations grâce à l'accesseur get */
		
			//Affichage du nom de etud1
			System.out.println("Le nom de l'étudiant 1 est: " + etud1.getNom());
			
			//Ecrire ci-dessous les informations des autres étudiants (toutes les informations connues par étudiant)
			System.out.println("Le nom de l'étudiant 2 est: " + etud2.getNom() + ", il a " + etud2.getAge() + " ans.");
			System.out.println("Le nom de l'étudiant 3 est: " + etud3.getNom() + ", il a " + etud3.getAge() + " ans.");
			System.out.println("Le nom de l'étudiant 4 est: " + etud4.getNom() + ", il a " + etud4.getAge() + " ans.");
			System.out.println("Le nom de l'étudiant 5 est: " + etud5.getNom() + ", il a " + etud5.getAge() + " ans.");
			System.out.println("Le nom de l'étudiant 6 est: " + etud6.getNom() + ", il a " + etud6.getAge() + " ans. Note programmation :" + etud6.getNote_prog()+"/20 Note Systeme : "+ etud6.getNote_sys()+"/20 Note Stage : " + etud6.getNote_stage()+"/20");
		
		/* Modification d'information grâce à l'accesseur set */
		
			// Modification du nom de etud1 
			etud1.setNom("Paul-Henri");

			// Ecrire ci-dessous le code pour modifier l'âge de Jean
			etud2.setAge(24);
			System.out.println("Le nom de l'étudiant 3 est: " + etud2.getNom() + ", il a " + etud2.getAge() + " ans.");
			
			//Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
			etud6.setNote_prog(15);
			
			// Ecrire ci-dessous le code pour ajouter les notes des autres étudiants
			etud2.setNote_prog(8);
			etud2.setNote_sys(7);
			etud2.setNote_stage(11);

			etud3.setNote_prog(10);
			etud3.setNote_sys(14);
			etud3.setNote_stage(11);
			
			etud4.setNote_prog(12);
			etud4.setNote_sys(5);
			etud4.setNote_stage(18);

			etud5.setNote_prog(2);
			etud5.setNote_sys(10);
			etud5.setNote_stage(11);

		/* Verification que les modifications ont bien été prises en compte */
		
			//Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher les nouvelles informations, grâce à l'accesseur get
			System.out.println("Le nom de l'étudiant 6 est: " + etud6.getNom() + ", il a " + etud6.getAge() + " ans. Note programmation :" + etud6.getNote_prog() + "/20 Note Systeme : " + etud6.getNote_sys() + "/20 Note Stage : " + etud6.getNote_stage() + "/20");
			System.out.println("Le nom de l'étudiant 2 est: " + etud2.getNom() + ", il a " + etud2.getAge() + " ans. Note programmation :" + etud2.getNote_prog() + "/20 Note Systeme : " + etud2.getNote_sys() + "/20 Note Stage : " + etud2.getNote_stage() + "/20");
			System.out.println("Le nom de l'étudiant 3 est: " + etud3.getNom() + ", il a " + etud3.getAge() + " ans. Note programmation :" + etud3.getNote_prog() + "/20 Note Systeme : " + etud3.getNote_sys() + "/20 Note Stage : " + etud3.getNote_stage() + "/20");
			System.out.println("Le nom de l'étudiant 4 est: " + etud4.getNom() + ", il a " + etud4.getAge() + " ans. Note programmation :" + etud4.getNote_prog() + "/20 Note Systeme : " + etud4.getNote_sys() + "/20 Note Stage : " + etud4.getNote_stage() + "/20");
			System.out.println("Le nom de l'étudiant 5 est: " + etud5.getNom() + ", il a " + etud5.getAge() + " ans. Note programmation :" + etud5.getNote_prog() + "/20 Note Systeme : " + etud5.getNote_sys() + "/20 Note Stage : " + etud5.getNote_stage() + "/20");
			
		/*************************** Les méthodes ************************************/
		
		
		/* Utilisation de la méthode toString  */
			
			//Utilisation de la méthode toString pour afficher l'étudiant etud1
		
			System.out.println("Informations concernant l'étudiant 1 : " + etud1);
			
			//Faire la même chose pour tous les étudiants et vérifier que les données sont correctes
			System.out.println("Informations concernant l'etudiant 2 : " + etud2);
			System.out.println("Informations concernant l'étudiant 3 : " + etud3);
			System.out.println("Informations concernant l'étudiant 4 : " + etud4);
			System.out.println("Informations concernant l'étudiant 5 : " + etud5);
			System.out.println("Informations concernant l'étudiant 6 : " + etud6);
		
		/* Utilisation de la méthode saisie */
		
			// Créer un nouvel étudiant etud7 grace au constructeur vide
			Etudiant etud7 = new Etudiant();
	
			// Ouvrir le scanner
			Scanner sc = new Scanner(System.in);
		
			//Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant etud7 (vous choisissez les valeurs)
			etud7.saisie(sc);
			
			//Vérifier grâce à la méthode toString que les informations concernant etud7 ont bien été initialisées
			System.out.println("Information concernant l'etudiant 7 : " + etud7);
			
		
		/* Utilisation de la méthode moyenne */
			
			// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple
			
			System.out.println("La moyenne de Paul-Henri est: " + etud1.moyenne());
			
			
			//Ecrire ci dessous le code pour calculer et afficher la moyenne des autres étudiants
			System.out.println("La moyenne de Jean est: " + etud2.moyenne());
			System.out.println("La moyenne de Abdoulkhader est: " + etud3.moyenne());
			System.out.println("La moyenne de Astrid est: " + etud4.moyenne());
			System.out.println("La moyenne de Paolo est: " + etud5.moyenne());
			System.out.println("La moyenne de Zoe est: " + etud6.moyenne());
			System.out.println("La moyenne de " + etud7.getNom() + " est: " + etud7.moyenne());
			
		/* Utilisation de la méthode mention pour chaque étudiant. Code à écrire ci-dessous */	
			System.out.println("L'etudiant " + etud1.getNom() + " est " + etud1.mention());
			//System.out.println("L'etudiant " + etud2.getNom() + "est " + etud2.mention());
			
		
		/* Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire ci-dessous */
			
			
		

	}

}