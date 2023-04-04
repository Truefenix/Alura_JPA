package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import dao.ProdutoDao;
import modelo.Produto;
import util.JPAUtil;

public class B_CadastroProdutoOrganizado {

	public static void main(String[] args) {
		
		Produto alexia = new Produto();
		alexia.setNome("Alexia");
		alexia.setDescricao("Muito Bom");
		alexia.setPreco(new BigDecimal(1200));
		
		EntityManager conexao = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(conexao);
		
		conexao.getTransaction().begin();
		dao.cadastrar(alexia);
		conexao.getTransaction().commit();
		conexao.close();
	}
}
