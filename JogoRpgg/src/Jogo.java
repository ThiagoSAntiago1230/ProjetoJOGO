import java.util.Random;
import java.util.Scanner;

public class Jogo implements InterfaceJogo {

	private Scanner ler;

	Monstros monstro = new Monstros();

	/*
	 * 
	 * //a ideia desse metodo é gerar aleatoriamente um adversario com caractesticas
	 * diferentes, em vez de crialo de forma statica
	 * 
	 * public int gerarNomeAdversario() { Random geradorNome = new Random(); return
	 * geradorNome.nextInt(4)+1; //NÃO ENTENDO POR QUE DA ESSE ERRO :(// int
	 * escolhaNome;
	 * 
	 * escolhaNome = gerarNomeAdversario();
	 * 
	 * switch (escolhaNome) { case 1:
	 * System.out.println("Monstro de fogo motivado"); break; case 2:
	 * System.out.println("Monstro de agua motivado"); break; case 3:
	 * System.out.println("Monstro de gelo motivado"); break; case 4:
	 * System.out.println("Monstro de terra motivado"); break; } }
	 * 
	 */

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

	public int criarMonstro() {
		ler = new Scanner(System.in);
		System.out.println("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: ");
		monstro.setNome(ler.nextLine());
		return 1;
	}

//	String a ="";
	public void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
//		ler = new Scanner(System.in);
//		System.out.println("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: ");
//		monstro.setNome(ler.nextLine());
//		a = ler.nextLine();
		System.out.println("========================");
		System.out.println("---HP do " + monstro.getNome() + ":" + hpUsuario);
		System.out.println("---HP Computador: " + hpComputador);
		System.out.println("*Contagem Especiais: " + contagemEspeciais);
		System.out.println("========================");
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

		// Monstros monstro = new Monstros();
		monstro.setHpUsuario(100);

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
					System.out.println(monstro.getNome() + " aplicou um soco.");

					adversario.setHpComputador(adversario.getHpComputador() - 7);
					// hpComputador -=7
					break;
				case 2:
					if (contagemEspecial > 0) {
						System.out.println(monstro.getNome() + " aplicou um ataque especial.");
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
						System.out.println("Monstro Adversario lhe aplicou um soco em " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						// hpUsuario -= 2 + (int) (i / 5);
						break;

					case 2:
						System.out.println("Monstro Adversario lhe aplicou um soco em " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 2 + (int) (i / 5));
						break;
					case 3:
						System.out.println("Monstro Adversario voltou com um chute em" + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 4:
						System.out.println("Monstro Adversario lhe voltou com um chute em " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 3 + (int) (i / 5));
						break;

					case 5:
						System.out.println("Monstro Adversario devolveu um ataque especial." + monstro.getNome());
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
