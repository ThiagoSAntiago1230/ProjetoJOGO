
import java.util.Random;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Jogo implements InterfaceJogo {
	@Id
	private int jogo_id;
	
	private Scanner ler;

	Monstros monstro = new Monstros();
	Tipos tipo = new Tipos();
	Adversario adversario = new Adversario();

	
	public int score() {
		int recorde = 0;
		Jogo jogo = new Jogo();
		int pontos = jogo.batalha();
		System.out.println("Usuario chegou a " + pontos + " pontos ");
		if(pontos > recorde) {
			recorde = pontos;
		}
		System.out.println("RECORDE ATUAL = " + recorde);
		return pontos;
	}
	
	public int gerarAdversario() {
		Random gerador = new Random();
		int gerarAdversario = gerador.nextInt(4);
		adversario.setLevelAdversario(1);
		//PERGUNTAR AO PROFESSOR

		Adversario a1 = new Adversario();
		a1.setTipoAdversario(gerarTipo());
		if (a1.getTipoAdversario() == Tipos.AGUA) {
			a1.setLevelAdversario(levelAdversario);
			
		}
		/*
		adversario.setNomeAdversario1("Monstro sombrio de "+ gerarTipo()+ " level: "+ adversario.getLevelAdversario());
		adversario.setNomeAdversario2("Monstro motivado de "+ gerarTipo()+ " level: "+ adversario.getLevelAdversario());
		adversario.setNomeAdversario3("Monstro desmotivado de "+ gerarTipo()+ " level: "+ adversario.getLevelAdversario());
		adversario.setNomeAdversario4("Monstro infeliz de "+ gerarTipo()+ " level: "+ adversario.getLevelAdversario());
		*/
		switch (gerarAdversario) {
		case 0:
			System.out.println(adversario.getNomeAdversario1());
			break;
		case 1:
			System.out.println(adversario.getNomeAdversario2());
			break;
		case 2:
			System.out.println(adversario.getNomeAdversario3());
			break;
		case 3:
			System.out.println(adversario.getNomeAdversario4());
			break;
			
		}
		return gerarAdversario;
		
	}
	
	public int ataqueUsuario() {
		ler = new Scanner(System.in);
		System.out.println("Escolha seu ataque:");
		System.out.println("(1) - soco");
		System.out.println("(2) - Especial");
		return ler.nextInt();

	}

	public int ataqueAdversario() {
		Random gerador = new Random();
		return gerador.nextInt(5) + 1;
		//int gerador = 7 ;
		//return gerador;
	}
	
	public Tipos gerarTipo() {
		Random gerador = new Random();
		int gerarTipo = gerador.nextInt(4);	
		switch (gerarTipo) {
		case 0:
			return Tipos.AGUA;
			break;
		case 1:
			return Tipos.FOGO;
			break;
		case 2:
			return Tipos.GELO;
			break;
		case 3:
			return Tipos.TERRA;
			break;
			
		}
		return null;
	}

	public int criarMonstro() {
		ler = new Scanner(System.in);
		System.out.println("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: ");
		monstro.setNome(ler.nextLine());
		return 1;
	}

	public void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
		System.out.println("============================");
		System.out.println("===STATUS DO SEU MONSTRO====");
		System.out.println("---HP do " + monstro.getNome() + ": " + hpUsuario);
		System.out.println("---"+ monstro.getNome()+" possui para batalhar---");
		System.out.println("- Socos normais");
		System.out.println("- Ataque especial - possui " + contagemEspeciais);
		System.out.println("============================");
		System.out.println("---HP Computador: " + hpComputador);
		System.out.println("============================");
	}

	public int batalha() {

		int escolhaAtaque;
		int i = 1;
		monstro.setHpUsuario(2);
		
		Adversario adversario = new Adversario();
		adversario.setHpComputador(100);
		
		Habilidades habilidade = new Habilidades();
		habilidade.setSocos("Aplicou um soco");
		habilidade.setEspecial("Aplicou um ataque especial");
		habilidade.setContagem(5);
		
		HabilidadesAdversario habilidadeAdversario = new HabilidadesAdversario();
		habilidadeAdversario.setSocos("Monstro Adversario lhe aplicou um soco em ");
		habilidadeAdversario.setChutes("Monstro Adversario voltou com um chute em ");
		habilidadeAdversario.setEspecial("Monstro Adversario devolveu um ataque especial em ");
		//habilidadeAdversario.setAtirou("Monstro Adversario Atirou com "+ gerarTipo() +" em " );
	

		while (monstro.getHpUsuario() > 0) {
			adversario.setHpComputador(16 + i);

			System.out.println("=======================");
			System.out.println("INIMIGO " + i/* + "- " + gerarAdversario()*/ );
			System.out.println("=======================\n");

			while (monstro.getHpUsuario() > 0 && adversario.getHpComputador() > 0) {
				if (monstro.getNome() == null) {
					criarMonstro();
				}

				imprimeHP(monstro.getHpUsuario(), adversario.getHpComputador(), habilidade.getContagem());
				escolhaAtaque = ataqueUsuario();
				switch (escolhaAtaque) {
				case 1:
					System.out.println(monstro.getNome() + " " +  habilidade.getSocos());

					adversario.setHpComputador(adversario.getHpComputador() - 7);
					// hpComputador -=7
					break;
				case 2:
					if (habilidade.getContagem() > 0) {
						System.out.println(monstro.getNome() + " " + habilidade.getEspecial());
						adversario.setHpComputador(adversario.getHpComputador() - 20);
						//contagemEspecial--;
						habilidade.setContagem(habilidade.getContagem()-1);
					} else {
						System.out.println(monstro.getNome() + " não possui mais Ataques especiais!.");
					}
					break;

				default:
					System.out.println("Opção invalida.");
					System.out.println("tente 1 ou 2");
					batalha();
					System.exit(0);
					break;
				}
				if (adversario.getHpComputador() > 0) {
					escolhaAtaque = ataqueAdversario();
					switch (escolhaAtaque) {
					case 1:
						System.out.println( habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						break;

					case 2:
						System.out.println( habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2+ (int) (i / 5));
						break;
					case 3:
						System.out.println( habilidadeAdversario.getChutes()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3+ (int) (i / 5));
						break;

					case 4:
						System.out.println( habilidadeAdversario.getChutes()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3+ (int) (i / 5));
						break;

					case 5:
						System.out.println( habilidadeAdversario.getEspecial()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5+ (int) (i / 5));
						;
						break;
					
					case 6:
						System.out.println( habilidadeAdversario.getEspecial()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5+ (int) (i / 5));
						;
						break;
	
					case 7:
						System.out.println("Monstro Adversario Atirou com "+ gerarTipo() +" em "+ monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
					}
				} else {
					System.out.println("inimigo derrotado");

				}

			}
			if (monstro.getHpUsuario() > 0) {
				monstro.setHpUsuario(monstro.getHpUsuario()+5);
				if (monstro.getHpUsuario() > 2) {
					monstro.setHpUsuario(2);
				}
				if (i % 10 == 0) {
					habilidade.setContagem(+1);
					if (habilidade.getContagem() > 5) {
						habilidade.setContagem(5);
					}
				}
			} else {
				System.out.println(monstro.getNome() + " morreu");
			}
			i++;
		}
		return i;
		
	}
}
