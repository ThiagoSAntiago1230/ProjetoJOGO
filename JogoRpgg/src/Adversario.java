
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
public class Adversario {
	@Id
	@GeneratedValue
	public int id;
	@ManyToOne
	@JoinTable(name = "HPSA", joinColumns = @JoinColumn(name = "hpComputador"), inverseJoinColumns = @JoinColumn(name = "VIDA"))
	public int hpComputador;
	@ManyToOne
	@JoinTable(name = "Nome Adversario", joinColumns = @JoinColumn(name = "nomeAdversario"), inverseJoinColumns = @JoinColumn(name = "NOME"))
	public String nomeAdversario;
	@ManyToOne
	@JoinTable(name = "Tipo Adversario", joinColumns = @JoinColumn(name = "tipoAdversario"), inverseJoinColumns = @JoinColumn(name = "VIDA"))
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
