import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Habilidades do Adversario")
public class HabilidadesAdversario {
	@Id
	@GeneratedValue
	private int habilidadesAdversario;
	@ManyToMany
	@JoinTable(name = "Habilidades do Adversario", joinColumns = @JoinColumn(name = "chutes"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String chutes;
	
	@ManyToMany
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "socos"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String socos;
	
	@ManyToMany
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "Especial"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String Especial;
	
	@ManyToOne
	@JoinTable(name = "Habilidades do seu Monstro", joinColumns = @JoinColumn(name = "atirou"), inverseJoinColumns = @JoinColumn(name = "tipo_id"))
	private Tipos atirou ;

	public String getChutes() {
		return chutes;
	}

	public void setChutes(String chutes) {
		this.chutes = chutes;
	}

	public String getSocos() {
		return socos;
	}

	public void setSocos(String socos) {
		this.socos = socos;
	}

	public String getEspecial() {
		return Especial;
	}

	public void setEspecial(String especial) {
		Especial = especial;
	}

	public Tipos getAtirou() {
		return atirou;
	}

	public void setAtirou(Tipos atirou) {
		this.atirou = atirou;
	}
	
	
	

}