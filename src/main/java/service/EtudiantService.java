package service;

import dao.EtudiantDao;
import dao.IEtudiantDao;
import domaine.Etudiant;

public class EtudiantService implements IEtudiantService {

	private IEtudiantDao etudiantdao;
	private Etudiant etudiant;
	
	public EtudiantService(IEtudiantDao ietudiantDao) {
		// TODO Auto-generated constructor stub
		super();
		this.etudiantdao=etudiantdao;
	}

	public EtudiantService(Etudiant etudiant) {
		// TODO Auto-generated constructor stub
		super();
		this.etudiant=etudiant;
	}
	
	public EtudiantService(IEtudiantDao ietudiantDao,Etudiant etudiant) {
		// TODO Auto-generated constructor stub
		super();
		this.etudiantdao=etudiantdao;
		this.etudiant=etudiant;
	}
	
	public Etudiant readEtudiant(int id) {
		// TODO Auto-generated method stub
		return this.etudiantdao.getEtudiantById(id);
	}

	public String createEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return this.etudiantdao.createEtudiant(etudiant);
	}

}
