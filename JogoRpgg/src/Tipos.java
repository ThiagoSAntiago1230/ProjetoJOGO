
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tipos")
public class Tipos {
	@Id
	@GeneratedValue
	private int tipo_id;
	@ManyToMany
	@JoinTable(name = "Tipos", joinColumns = @JoinColumn(name = "gelo"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String gelo;
	@ManyToMany
	@JoinTable(name = "Tipos", joinColumns = @JoinColumn(name = "fogo"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String fogo;
	@ManyToMany
	@JoinTable(name = "Tipos", joinColumns = @JoinColumn(name = "terra"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String terra;
	@ManyToMany
	@JoinTable(name = "Tipos", joinColumns = @JoinColumn(name = "agua"), inverseJoinColumns = @JoinColumn(name = "jogo_id"))
	private String agua;

	
	
	
	public String getGelo() {
		return gelo;
	}

	public void setGelo(String gelo) {
		this.gelo = gelo;
	}

	public String getFogo() {
		return fogo;
	}

	public void setFogo(String fogo) {
		this.fogo = fogo;
	}

	public String getTerra() {
		return terra;
	}

	public void setTerra(String terra) {
		this.terra = terra;
	}

	public String getAgua() {
		return agua;
	}

	public void setAgua(String agua) {
		this.agua = agua;
	}

	
	
}
