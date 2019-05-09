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
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "nomeAdversario"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String nomeAdversario;
	
	@ManyToMany
	@JoinTable(name = "Adversario", joinColumns = @JoinColumn(name = "tipoAdversario"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	public String tipoAdversario;
	
	

	public int getHpComputador() {
		return hpComputador;
	}

	public void setHpComputador(int hpComputador) {
		this.hpComputador = hpComputador;
	}

	public String getNomeAdversario() {
		return nomeAdversario;
	}

	public void setNomeAdversario(String nomeAdversario) {
		this.nomeAdversario = nomeAdversario;
	}

	public String getTipoAdversario() {
		return tipoAdversario;
	}

	public void setTipoAdversario(String tipoAdversario) {
		this.tipoAdversario = tipoAdversario;
	}
	
	
}
