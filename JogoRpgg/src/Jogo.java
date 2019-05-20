
import java.util.Random;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jogo implements InterfaceJogo {
	@Id
	private int jogo_id;
	private Scanner ler;
	Tipos2 tipos2 = new Tipos2();
	// Tipos tipos = new Tipos();

	Monstros monstro = new Monstros();
	Adversario adversario = new Adversario();

	public int ataqueAdversarioGelo() {
		int i = 1;
		HabilidadesAdversario habilidadeGELO = new HabilidadesAdversario();
		habilidadeGELO.setSocos("Monstro Adversario lhe aplicou um soco de gelo em ");
		habilidadeGELO.setChutes("Monstro Adversario voltou com um chute de gelo em ");
		habilidadeGELO.setEspecial("Monstro Adversario devolveu um ataque especial de gelo em ");
		int escolhaAtaqueGELO;
		escolhaAtaqueGELO = ataqueAdversario();
		switch (escolhaAtaqueGELO) {
		case 1:
			System.out.println(habilidadeGELO.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;

		case 2:
			System.out.println(habilidadeGELO.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;
		case 3:
			System.out.println(habilidadeGELO.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 4:
			System.out.println(habilidadeGELO.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 5:
			System.out.println(habilidadeGELO.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 6:
			System.out.println(habilidadeGELO.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 7:
			System.out.println("Monstro Adversario Atirou com " + gerarTipo() + " em " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
		}
		return escolhaAtaqueGELO;

	}

	public int ataqueAdversarioFogo() {
		int i = 1;
		HabilidadesAdversario habilidadeFOGO = new HabilidadesAdversario();
		habilidadeFOGO.setSocos("Monstro Adversario lhe aplicou um soco de fogo em ");
		habilidadeFOGO.setChutes("Monstro Adversario voltou com um chute de fogo em ");
		habilidadeFOGO.setEspecial("Monstro Adversario devolveu um ataque especial de fogo em ");
		int escolhaAtaqueFOGO;
		escolhaAtaqueFOGO = ataqueAdversario();
		switch (escolhaAtaqueFOGO) {
		case 1:
			System.out.println(habilidadeFOGO.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;

		case 2:
			System.out.println(habilidadeFOGO.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;
		case 3:
			System.out.println(habilidadeFOGO.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 4:
			System.out.println(habilidadeFOGO.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 5:
			System.out.println(habilidadeFOGO.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 6:
			System.out.println(habilidadeFOGO.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 7:
			System.out.println("Monstro Adversario Atirou com " + gerarTipo() + " em " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
		}
		return escolhaAtaqueFOGO;

	}

	public int ataqueAdversarioAgua() {
		int i = 1;
		HabilidadesAdversario habilidadeAGUA = new HabilidadesAdversario();
		habilidadeAGUA.setSocos("Monstro Adversario lhe aplicou um soco de agua em ");
		habilidadeAGUA.setChutes("Monstro Adversario voltou com um chute de agua em ");
		habilidadeAGUA.setEspecial("Monstro Adversario devolveu um ataque especial de agua em ");
		int escolhaAtaqueAGUA;
		escolhaAtaqueAGUA = ataqueAdversario();
		switch (escolhaAtaqueAGUA) {
		case 1:
			System.out.println(habilidadeAGUA.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;

		case 2:
			System.out.println(habilidadeAGUA.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;
		case 3:
			System.out.println(habilidadeAGUA.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 4:
			System.out.println(habilidadeAGUA.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 5:
			System.out.println(habilidadeAGUA.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 6:
			System.out.println(habilidadeAGUA.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 7:
			System.out.println("Monstro Adversario Atirou com " + gerarTipo() + " em " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
		}
		return escolhaAtaqueAGUA;

	}

	public int ataqueAdversarioTerra() {
		int i = 1;
		HabilidadesAdversario habilidadeTERRA = new HabilidadesAdversario();
		habilidadeTERRA.setSocos("Monstro Adversario lhe aplicou um soco de terra em ");
		habilidadeTERRA.setChutes("Monstro Adversario voltou com um chute de terra em ");
		habilidadeTERRA.setEspecial("Monstro Adversario devolveu um ataque especial de terra em ");
		int escolhaAtaqueTERRA;
		escolhaAtaqueTERRA = ataqueAdversario();
		switch (escolhaAtaqueTERRA) {
		case 1:
			System.out.println(habilidadeTERRA.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;

		case 2:
			System.out.println(habilidadeTERRA.getSocos() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
			break;
		case 3:
			System.out.println(habilidadeTERRA.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 4:
			System.out.println(habilidadeTERRA.getChutes() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
			break;

		case 5:
			System.out.println(habilidadeTERRA.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 6:
			System.out.println(habilidadeTERRA.getEspecial() + " " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
			break;

		case 7:
			System.out.println("Monstro Adversario Atirou com " + gerarTipo() + " em " + monstro.getNome());
			monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
		}
		return escolhaAtaqueTERRA;

	}

	public int score() {
		int recorde = 0;
		Jogo jogo = new Jogo();
		int pontos = jogo.batalha();
		System.out.println("Usuario chegou a " + pontos + " pontos ");
		if (pontos > recorde) {
			recorde = pontos;
		}
		System.out.println("RECORDE ATUAL = " + recorde);
		return pontos;
	}

	public int gerarAdversario() {
		Random gerador = new Random();
		int gerarAdversario = gerador.nextInt(4);
		Jogo jogo1 = new Jogo();
		Adversario a1 = new Adversario();
		Adversario a2 = new Adversario();
		Adversario a3 = new Adversario();
		Adversario a4 = new Adversario();
		this.gerarTipo2();
		if (tipos2.getAtributoTipo().equals("Agua")) {
			a1.setTipoAdversario(tipos2);
			a1.setLevelAdversario(1);
			a1.setNomeAdversario("Monstro de Agua");
			a1.setHpComputador(100);
			jogo1.ataqueAdversarioAgua();

		} else if (tipos2.getAtributoTipo().equals("Fogo")) {
			a2.setTipoAdversario(tipos2);
			a1.setLevelAdversario(1);
			a2.setNomeAdversario("Monstro de Fogo");
			a2.setHpComputador(100);
			jogo1.ataqueAdversarioFogo();

		} else if (tipos2.getAtributoTipo().equals("Gelo")) {
			a3.setTipoAdversario(tipos2);
			a1.setLevelAdversario(1);
			a3.setNomeAdversario("Monstro de Gelo");
			a3.setHpComputador(100);
			jogo1.ataqueAdversarioGelo();

		} else if (tipos2.getAtributoTipo().equals("Terra")) {
			a4.setTipoAdversario(tipos2);
			a1.setLevelAdversario(1);
			a4.setNomeAdversario("Monstro de terra");
			a4.setHpComputador(100);
			jogo1.ataqueAdversarioTerra();
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
		// int gerador = 7 ;
		// return gerador;
	}

	public Tipos2 gerarTipo2() {

		Random gerador = new Random();
		int gerarTipo = gerador.nextInt(4);
		switch (gerarTipo) {
		case 1:
			tipos2.setAtributoTipo("Gelo");
			break;
		case 2:
			tipos2.setAtributoTipo("Fogo");
			break;
		case 3:
			tipos2.setAtributoTipo("Agua");
			break;
		case 4:
			tipos2.setAtributoTipo("Terra");
			break;
		default:
			break;
		}
		return tipos2;
	}

	/*
	 * public Tipos gerarTipo() { Random gerador = new Random(); int gerarTipo =
	 * gerador.nextInt(4); switch (gerarTipo) { case 0: return Tipos.AGUA;
	 * 
	 * case 1: return Tipos.FOGO;
	 * 
	 * case 2: return Tipos.GELO;
	 * 
	 * case 3: return Tipos.TERRA;
	 * 
	 * } return null; }
	 */

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
		System.out.println("---" + monstro.getNome() + " possui para batalhar---");
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

		while (monstro.getHpUsuario() > 0) {
			adversario.setHpComputador(16 + i);

			System.out.println("=======================");
			System.out.println("INIMIGO " + i/* + "- " + gerarAdversario() */ );
			System.out.println("=======================\n");

			while (monstro.getHpUsuario() > 0 && adversario.getHpComputador() > 0) {
				if (monstro.getNome() == null) {
					criarMonstro();
				}

				imprimeHP(monstro.getHpUsuario(), adversario.getHpComputador(), habilidade.getContagem());
				escolhaAtaque = ataqueUsuario();
				switch (escolhaAtaque) {
				case 1:
					System.out.println(monstro.getNome() + " " + habilidade.getSocos());
					adversario.setHpComputador(adversario.getHpComputador() - 7);
					break;
					
				case 2:
					if (habilidade.getContagem() > 0) {
						System.out.println(monstro.getNome() + " " + habilidade.getEspecial());
						adversario.setHpComputador(adversario.getHpComputador() - 20);
						// contagemEspecial--;
						habilidade.setContagem(habilidade.getContagem() - 1);
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
					//escolhaAtaque = ataqueAdversario();
					Jogo jogo = new Jogo();
					jogo.gerarAdversario();
									
					/*
					switch (escolhaAtaque) {
					case 1:
						System.out.println(habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						break;

					case 2:
						System.out.println(habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						break;
					case 3:
						System.out.println(habilidadeAdversario.getChutes() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 4:
						System.out.println(habilidadeAdversario.getChutes() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 5:
						System.out.println(habilidadeAdversario.getEspecial() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
						;
						break;

					case 6:
						System.out.println(habilidadeAdversario.getEspecial() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
						;
						break;

					case 7:
						System.out.println("Monstro Adversario Atirou com " + gerarTipo() + " em " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
					}
					*/
				} else {
					System.out.println("inimigo derrotado");

				}

			}
			
			if (monstro.getHpUsuario() > 0) {
				monstro.setHpUsuario(monstro.getHpUsuario() + 5);
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

	@Override
	public Tipos gerarTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}