package service;

import domaine.Etudiant;

public interface IEtudiantService {

	
	public Etudiant readEtudiant(int id);
	
	public String createEtudiant(Etudiant etudiant);
}
