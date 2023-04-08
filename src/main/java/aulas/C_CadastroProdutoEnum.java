package aulas;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import dao.CategoriaDao;
import dao.ProdutoDao;
import modelo.Categorias;
import modelo.Produto;
import util.JPAUtil;

public class C_CadastroProdutoEnum {

public static void main(String[] args) {
		
		Categorias celular = new Categorias("CELULAR");
		Produto samsung = new Produto( "Samsung", "Muito Bom", new BigDecimal(1000), celular);
		
		EntityManager conexao = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(conexao);
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		
		conexao.getTransaction().begin();
		categoriaDao.cadastrar(celular);
		produtoDao.cadastrar(samsung);
		conexao.getTransaction().commit();
		conexao.close();
	}
}
