#include <iostream>
#include <fstream>
#include <string>

using namespace std;

void processFastaFile(const string fasta){

  ifstream myFlux(fasta);

  string line;
  
  if(myFlux) {
    while(getline(myFlux, line)) {
         cout << line << endl;
    }
  }
  else {
      cout << "ERROR: Impossible to open the file." << endl;
  }
}

int main(int argc, char* argv[]) {

  string fasta;
  
  // Scans the command line
  for (int i = 1; i < argc; i++) {
    if ((strcmp(argv[i], "-fasta") == 0) && (i < argc-1))
	fasta = string(argv[++i]);
  }
  
  processFastaFile(fasta);
  
  return 0;
}
