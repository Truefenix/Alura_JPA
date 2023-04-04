package dao;

import javax.persistence.EntityManager;

import modelo.Produto;

public class ProdutoDao {

	private EntityManager conexao;

	public ProdutoDao(EntityManager conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Produto produto) {
		this.conexao.persist(produto);
	}
}
