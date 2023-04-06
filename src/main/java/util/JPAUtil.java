package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	/*
	 * Essa classe só criou a conexão Entity com a função que retorna ela.
	 */

	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("loja");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}
