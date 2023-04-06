package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import dao.ProdutoDao;
import modelo.Categorias;
import modelo.Produto;
import util.JPAUtil;

public class C_CadastroProdutoEnum {

public static void main(String[] args) {
		
		Produto samsung = new Produto( "Samsung", "Muito Bom", new BigDecimal(1000), Categorias.CELULARES);
		
		EntityManager conexao = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(conexao);
		
		conexao.getTransaction().begin();
		dao.cadastrar(samsung);
		conexao.getTransaction().commit();
		conexao.close();
	}
}
