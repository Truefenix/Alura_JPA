package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Categorias;
import modelo.Produto;

public class A_cadastroDeProdutosNoBD {

	public static void main(String[] args) {
		
		Produto eletro = new Produto();
		eletro.setNome("Eletro");
		eletro.setDescricao("Muito Bom");
		eletro.setPreco(new BigDecimal(800));
		eletro.setCategorias(Categorias.CELULARES);
		
		// Persistindo uma Entidade
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("loja"); // loja é qual BD do persistence-unit
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(eletro);
		em.getTransaction().commit();
		em.close();
	}
}
