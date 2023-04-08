package dao;

import javax.persistence.EntityManager;

import modelo.Categorias;

public class CategoriaDao {

	private EntityManager conexao;

	public CategoriaDao(EntityManager conexao) {
		this.conexao = conexao;
	}

	// Cadastrar a categoria
	public void cadastrar(Categorias categoria) {
		this.conexao.persist(categoria);
	}
}
