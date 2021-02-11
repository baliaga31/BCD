#include <iostream>
#include <fstream>
#include <string>

using namespace std;

ifstream myFlux("calmodulin.fasta");  //Ouverture d'un fichier en lecture


int main() {
  
  if(myFlux)
    {
      //Tout est prêt pour la lecture.
      string line;
      while(getline(myFlux, line)) //Tant qu'on n'est pas à la fin, on lit
      {
         cout << line << endl;
         //Et on l'affiche dans la console
         //Ou alors on fait quelque chose avec cette ligne
         //À vous de voir
      }
    }
  else
    {
      cout << "ERREUR: Impossible d'ouvrir le fichier en lecture." << endl;
    }

  return 0;
  
}



