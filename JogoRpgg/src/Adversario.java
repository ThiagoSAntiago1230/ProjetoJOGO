
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Adversario")
public class Adversario {
	@Id
	@GeneratedValue
	public int id;
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "hpComputador"), inverseJoinColumns = @JoinColumn(name = "id_jogo"))
	public int hpComputador;

	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "nomeAdversario1"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String nomeAdversario;
	
	public String getNomeAdversario() {
		return nomeAdversario;
	}

	public void setNomeAdversario(String nomeAdversario) {
		this.nomeAdversario = nomeAdversario;
	}

	public Tipos2 tipoAdversario;
	
	@ManyToMany
	@JoinTable(name = "Level Adversario", joinColumns = @JoinColumn(name = "levelAdversario5"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public int levelAdversario;
	
	

	public int getLevelAdversario() {
		return levelAdversario;
	}

	public void setLevelAdversario(int levelAdversario) {
		this.levelAdversario = levelAdversario;
	}

	public String getNomeAdversario1() {
		return nomeAdversario;
	}

	

	public int getHpComputador() {
		return hpComputador;
	}

	public void setHpComputador(int hpComputador) {
		this.hpComputador = hpComputador;
	}

	

	public Tipos2 getTipoAdversario() {
		return tipoAdversario;
	}

	public void setTipoAdversario(Tipos2 tipoAdversario) {
		this.tipoAdversario = tipoAdversario;
	}
	
	
}
