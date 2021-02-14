#include <iostream>
#include <fstream>
#include <string>
#include "fasta.h"

using namespace std;

void processFastaFile(const string fasta){

  ifstream fastaFile(fasta);

  string line;
  
  if(fastaFile) {
    while(getline(fastaFile, line)) {
      std::cout << line << endl;
    }
  }
  else {
    std::cout << "ERROR: can't open the file." << endl;
  }
}

int main(int argc, char* argv[]) {

  string fasta;
  
  // Scans the command line
  for (int i = 1; i < argc; i++) {
    if ((strcmp(argv[i], "-fasta") == 0) && (i < argc-1)) // Compare the first argument with "fasta", if it returns true, it will be compared with (i < arc-1)
	fasta = string(argv[++i]);
  }
  
  processFastaFile(fasta);
  
  return 0;
}
