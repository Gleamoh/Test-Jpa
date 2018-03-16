import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {

		// Créer une instance d’entityManagerFactory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Créer une instance d’entityManager

		// Vérifier que vous vous connectez bien à la base de données
		entityManager.close();
		entityManagerFactory.close();
	}

}
