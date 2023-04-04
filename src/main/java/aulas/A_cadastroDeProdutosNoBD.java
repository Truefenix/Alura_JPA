package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.modelo.Produto;

public class A_cadastroDeProdutosNoBD {

	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Xiaomi");
		celular.setDescricao("Muito Bom");
		celular.setPreco(new BigDecimal(800));
		
		// Persistindo uma Entidade
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("loja"); // loja é qual BD do persistence-unit
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}
}
