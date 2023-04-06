package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="descricao")
	private String descricao;
	@Column(name="preco")
	private BigDecimal preco;
	
	@Column(name="dataCadastro")
	private LocalDate dataCadastro = LocalDate.now();
	
	@Enumerated(EnumType.STRING)
	private Categorias categorias;
	
	// Construtores
	public Produto() {}

	public Produto(String nome, String descricao, BigDecimal preco, Categorias categorias) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categorias = categorias;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
}
