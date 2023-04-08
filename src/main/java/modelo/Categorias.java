package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	public Categorias() {}
	public Categorias(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) { this.nome = nome; }
	public String getNome() { return nome; }
}
