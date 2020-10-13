#!/usr/bin/python3

import sys, os, re

pyScriptName = sys.argv[0]
fastaFileName = sys.argv[1]
outputFileName = sys.argv[2]
maxMissedCleavage = sys.argv[3]

# Read fasta file
fasta_dict = {}

with open(fastaFileName, "r") as fasta_file, open(outputFileName, "w") as output_peptides:
    sequence_id = ""
    for line in fasta_file:
        if line.startswith(">"):
            sequence_id = line.strip()
            fasta_dict[sequence_id] = ""
        else:
            fasta_dict[sequence_id] += line.strip()

    # Cleave a protein in different peptide with trypsin
    for id in fasta_dict.keys():
        print(id)
        seq = fasta_dict[id]
        site = []
        peptide = []
        for aa in range(0,len(seq)-1): # This line is necessary to avoid 
            if seq[aa] in 'KR' and seq[aa+1] != 'P':
                site.append(aa+1)
            #if seq[aa] == 'K' and seq[aa+1] != 'P':
            #    site.append(aa+1)

        if site[-1] != len(seq):
            site.append(len(seq))

        # Missed cleavage and print the different peptides
        print("Missed cleavage: {}".format(maxMissedCleavage))

        if int(maxMissedCleavage) == 0:
            for pep in range(0, len(site)-1):
                peptide.append(seq[site[pep]:site[pep+1]])
        elif int(maxMissedCleavage) == 1:
            for pep in range(0,len(site)-2):
                peptide.append(seq[site[pep]:site[pep+2]])
        
        # Write the id and the peptides a in txt file
        output_peptides.write(id + "\n")
        for frag in peptide:
            output_peptides.write(frag + "\n")

fasta_file.close()
output_peptides.close()
