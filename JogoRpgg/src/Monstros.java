import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Monstros")
public class Monstros {
	@Id
	@GeneratedValue
	private int monstros;
	@ManyToMany
	@JoinTable(name = "Monstros", joinColumns = @JoinColumn(name = "hpUsuario"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private int hpUsuario;
	@ManyToMany
	@JoinTable(name = "Monstros", joinColumns = @JoinColumn(name = "nome"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String nome;
	@ManyToMany
	@JoinTable(name = "Monstro", joinColumns = @JoinColumn(name = "tipo"), inverseJoinColumns = @JoinColumn(name = "tipo_id"))
	private String tipo;

	public int getHpUsuario() {
		return hpUsuario;
	}

	public void setHpUsuario(int hpUsuario) {
		this.hpUsuario = hpUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}