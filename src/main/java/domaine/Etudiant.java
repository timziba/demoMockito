package domaine;

public class Etudiant {
	private int idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	
	public Etudiant(int idEtudiant,String nomEtudiant,String prenomEtudiant) {
		this.idEtudiant=idEtudiant;
		this.nomEtudiant=nomEtudiant;
		this.prenomEtudiant=prenomEtudiant;
	}
	
	public Etudiant() {
		
	}
	
	

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	
	
	
	
}
