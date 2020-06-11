package demomockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dao.IEtudiantDao;
import domaine.Etudiant;
import service.EtudiantService;

class TestEtudiantService {

	@Test
	void testReadEtudiant() {
		
		//1 Mocker l'interface dao
		
		IEtudiantDao dao = Mockito.mock(IEtudiantDao.class);
		
		//2 creation du sevice
		EtudiantService etudiantService = new EtudiantService(dao);
		
		//3 Imposer un comportement faire le stubbing du mock
		Etudiant etudiant = new Etudiant(1, "Fatima", "BA");
		
		Mockito.when(dao.getEtudiantById(1)).thenReturn(etudiant);
		
		//4 Appeler une methode du service
		Etudiant etudiant2 = etudiantService.readEtudiant(1);
		
		//5 Comparer le resultat reel avec le resultat attendu
		Assertions.assertEquals(etudiant2.getIdEtudiant(), 1);
		Mockito.verify(dao).getEtudiantById(1);
	}

}
