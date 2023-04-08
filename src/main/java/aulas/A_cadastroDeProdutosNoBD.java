package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.CategoriaDao;
import modelo.Categorias;
import modelo.Produto;

public class A_cadastroDeProdutosNoBD {

	public static void main(String[] args) {
		
		Categorias celular = new Categorias("CELULAR");
		Produto eletro = new Produto();
		
		eletro.setNome("Eletro");
		eletro.setDescricao("Muito Bom");
		eletro.setPreco(new BigDecimal(800));
		
		// Persistindo uma Entidade
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("loja"); // loja é qual BD do persistence-unit
		EntityManager em = factory.createEntityManager();
		
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		categoriaDao.cadastrar(celular);
		em.persist(eletro);
		em.getTransaction().commit();
		em.close();
	}
}
