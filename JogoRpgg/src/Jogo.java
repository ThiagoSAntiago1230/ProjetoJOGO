import java.util.Random;
import java.util.Scanner;

public class Jogo implements InterfaceJogo {

	private Scanner ler;

	Monstros monstro = new Monstros();
	
	Tipos tipo = new Tipos();


	public int ataqueUsuario() {
		ler = new Scanner(System.in);
		System.out.println("Escolha seu ataque:");
		System.out.println("(1) - soco");
		System.out.println("(2) - Especial");
		return ler.nextInt();

	}

	public int ataqueComputador() {
		Random gerador = new Random();
		return gerador.nextInt(5) + 1;

	}
	
	
	public int gerarTipo() {
		Random gerador = new Random();
		//return gerador.nextInt(4)+1;
		int gerarTipo = gerador.nextInt(4)+1;
		//int gerartipo = gerarTipo();
		switch (gerarTipo) {
		case 1:
			tipo.setAgua("Agua");
			break;
		case 2:
			tipo.setFogo("Fogo");
			break;
		case 3:
			tipo.setGelo("Gelo");
			break;
		case 4:
			tipo.setTerra("Terra");
			break;
			
		}
		return gerarTipo;
	}
	
	public int criarMonstro() {
		ler = new Scanner(System.in);
		System.out.println("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: ");
		monstro.setNome(ler.nextLine());
		return 1;
	}

	public void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
//		ler = new Scanner(System.in);
//		System.out.println("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: ");
//		monstro.setNome(ler.nextLine());
//		a = ler.nextLine();
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
		/*
		 * int hpUsuario = 150; int hpComputador = 15;
		 */
		int contagemEspecial = 5;
		int escolhaAtaque;
		int i = 1;

		Adversario adversario = new Adversario();
		adversario.setHpComputador(100);
		monstro.setHpUsuario(100);
		
		Habilidades habilidade = new Habilidades();
		habilidade.setSocos("Aplicou um soco");
		habilidade.setEspecial("Aplicou um ataque especial");
		
		
		HabilidadesAdversario habilidadeAdversario = new HabilidadesAdversario();
		habilidadeAdversario.setSocos("Monstro Adversario lhe aplicou um soco em ");
		habilidadeAdversario.setChutes("Monstro Adversario voltou com um chute em ");
		habilidadeAdversario.setEspecial("Monstro Adversario devolveu um ataque especial em ");

		// monstro.setHpComputador(100);

		// monstro.setNome("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: " +
		// ler.nextLine());

		while (monstro.getHpUsuario() > 0) {

			// monstro.setNome("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: " +
			// ler.nextLine());

			adversario.setHpComputador(16 + i);
			// hpComputador = 16 + i;

			System.out.println("=======================");
			System.out.println("INIMIGO" + i);
			System.out.println("=======================\n");

			while (monstro.getHpUsuario() > 0 && adversario.getHpComputador() > 0) {
				if (monstro.getNome() == null) {
					criarMonstro();
				}

				imprimeHP(monstro.getHpUsuario(), adversario.getHpComputador(), contagemEspecial);
				escolhaAtaque = ataqueUsuario();
				switch (escolhaAtaque) {
				case 1:
					System.out.println(monstro.getNome() + " " +  habilidade.getSocos());

					adversario.setHpComputador(adversario.getHpComputador() - 7);
					// hpComputador -=7
					break;
				case 2:
					if (contagemEspecial > 0) {
						System.out.println(monstro.getNome() + " " + habilidade.getEspecial());
						adversario.setHpComputador(adversario.getHpComputador() - 20);
						// hpComputador -= 20;
						contagemEspecial--;
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

				// ----------------------------CASO O INIMIGO NÃO MORRA, ELE
				// ATAKA------------------------------------
				if (adversario.getHpComputador() > 0) {
					escolhaAtaque = ataqueComputador();
					switch (escolhaAtaque) {
					case 1:
						System.out.println( habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						// hpUsuario -= 2 + (int) (i / 5);
						break;

					case 2:
						System.out.println( habilidadeAdversario.getSocos() + " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						break;
					case 3:
						System.out.println( habilidadeAdversario.getChutes()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 4:
						System.out.println( habilidadeAdversario.getChutes()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 5:
						System.out.println( habilidadeAdversario.getEspecial()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
						;
						break;
					}
				} else {
					System.out.println("inimigo derrotado");

				}
				/*
				if (monstro.getHpUsuario() > 0) {
					monstro.setHpUsuario(monstro.getHpUsuario()+5);
					if (monstro.getHpUsuario() > 150) {
						monstro.setHpUsuario(100);
						// hpUsuario = 150;
					}
					if (i % 10 == 0) {
						contagemEspecial++;
						if (contagemEspecial > 5) {
							contagemEspecial = 5;
						}
					}
				} 
				*/
			}
			i++;
		}
		return i;
	}

}
