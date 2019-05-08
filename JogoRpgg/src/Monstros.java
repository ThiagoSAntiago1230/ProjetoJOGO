import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Monstros {
	@Id
	@GeneratedValue
	private int idMonstros;
	
	@ManyToOne
	@JoinTable(name = "HPSM", joinColumns = @JoinColumn(name = "hpUsuario"), inverseJoinColumns = @JoinColumn(name = "VIDA"))
	private int hpUsuario;
	
	@ManyToOne
	@JoinTable(name = "Nome Monstro", joinColumns = @JoinColumn(name = "nomeUsuario"), inverseJoinColumns = @JoinColumn(name = "NOME"))
	private String nome;
	
	@ManyToOne
	@JoinTable(name = "Tipo Monstro", joinColumns = @JoinColumn(name = "tipoMonstro"), inverseJoinColumns = @JoinColumn(name = "TIPO"))
	private String tipo;
	
	/*                            EM ANDAMENTO
	public Monstros(int hpUsuario, int hpComputador, String nome, String tipo) {
		this.hpUsuario = hpUsuario;
		this.hpComputador = hpComputador;
		this.nome = nome;
		this.tipo = tipo; ZZZZZZZZZZZZZ
	}
*/
	
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
	
/*(versão anterior)
	public int getHpComputador() {
		return hpComputador;
	}

	public void setHpComputador(int hpComputador) {
		this.hpComputador = hpComputador;
	}	*/

}
