#include <iostream>
#include <fstream>
#include <string>

using namespace std;

ifstream myFlux("calmodulin.fasta");

void processFastaFile(){
  if(myFlux) {
    string line;
    while(getline(myFlux, line)) {
         cout << line << endl;
    }
  }
  else {
      cout << "ERREUR: Impossible d'ouvrir le fichier en lecture." << endl;
  }
}

int main() {
  processFastaFile();
  
  return 0;  
}



