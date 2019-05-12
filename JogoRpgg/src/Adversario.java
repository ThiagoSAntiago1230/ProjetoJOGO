
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
	public String nomeAdversario1;
	
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "nomeAdversario2"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String nomeAdversario2;
	
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "nomeAdversario3"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String nomeAdversario3;
	
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "nomeAdversario4"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String nomeAdversario4;
	
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "tipoAdversario5"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String tipoAdversario;
	
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
		return nomeAdversario1;
	}

	public void setNomeAdversario1(String nomeAdversario1) {
		this.nomeAdversario1 = nomeAdversario1;
	}

	public String getNomeAdversario2() {
		return nomeAdversario2;
	}

	public void setNomeAdversario2(String nomeAdversario2) {
		this.nomeAdversario2 = nomeAdversario2;
	}

	public String getNomeAdversario3() {
		return nomeAdversario3;
	}

	public void setNomeAdversario3(String nomeAdversario3) {
		this.nomeAdversario3 = nomeAdversario3;
	}

	public String getNomeAdversario4() {
		return nomeAdversario4;
	}

	public void setNomeAdversario4(String nomeAdversario4) {
		this.nomeAdversario4 = nomeAdversario4;
	}

	public int getHpComputador() {
		return hpComputador;
	}

	public void setHpComputador(int hpComputador) {
		this.hpComputador = hpComputador;
	}

	public String getNomeAdversario() {
		return nomeAdversario1;
	}

	public void setNomeAdversario(String nomeAdversario) {
		this.nomeAdversario1 = nomeAdversario;
	}

	public String getTipoAdversario() {
		return tipoAdversario;
	}

	public void setTipoAdversario(String tipoAdversario) {
		this.tipoAdversario = tipoAdversario;
	}
	
	
}
