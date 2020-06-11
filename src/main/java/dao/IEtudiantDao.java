package dao;

import domaine.Etudiant;

public interface IEtudiantDao {

	public String createEtudiant(Etudiant etudiant);
	public Etudiant getEtudiantById(int id);
}
