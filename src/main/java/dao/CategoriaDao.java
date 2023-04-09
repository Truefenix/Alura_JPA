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
	
	// Atualiza -> para o estado Managed
	public void atualizar(Categorias categoria) {
		this.conexao.merge(categoria);
	}
	
	// Deleta
	public void remover(Categorias categoria) {
		categoria = conexao.merge(categoria); // para deletar sempre no managed
		
		this.conexao.remove(categoria); // deleta a categoria recebida
	}
}
