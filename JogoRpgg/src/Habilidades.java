import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Habilidades do seu Monstro")
public class Habilidades {
	@Id
	@GeneratedValue
	private int habilidades;

	@ManyToMany
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "socos"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String socos;

	@ManyToMany
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "especial"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String especial;

	@ManyToMany
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "chutes"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String chutes;

	private int contagem;

	public int getContagem() {
		return contagem;
	}

	public void setContagem(int contagem) {
		this.contagem = contagem;
	}

	public String getSocos() {
		return socos;
	}

	public void setSocos(String socos) {
		this.socos = socos;
	}

	public String getEspecial() {
		return especial;
	}

	public void setEspecial(String especial) {
		this.especial = especial;
	}

	public String getChutes() {
		return chutes;
	}

	public void setChutes(String chutes) {
		this.chutes = chutes;
	}

}