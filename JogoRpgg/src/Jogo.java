import java.util.Random;
import java.util.Scanner;

public class Jogo implements InterfaceJogo {


	private Scanner ler;

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

	public void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
		System.out.println("========================");
		System.out.println("---HP Usuario: " + hpUsuario);
		System.out.println("---HP Computador: " + hpComputador);
		System.out.println("*Contagem Especiais: " + contagemEspeciais);
		System.out.println("========================");
	}

	public int batalha() {
	/*
		int hpUsuario = 150;
		int hpComputador = 15;
		*/
		int contagemEspecial = 5;
		int escolhaAtaque;
		int i = 1;
	
	
		Monstros monstro = new Monstros();
		monstro.setHpUsuario(100);
		monstro.setHpComputador(100);
		
		
		
		
		
		while (monstro.getHpUsuario() > 0) {
			
			monstro.setHpComputador(16+i);
			
			//hpComputador = 16 + i;

			System.out.println("=======================");
			System.out.println("INIMIGO" + i);
			System.out.println("=======================\n");

			while (monstro.getHpUsuario() > 0 && monstro.getHpComputador() > 0) {
				imprimeHP(monstro.getHpUsuario(), monstro.getHpComputador(), contagemEspecial);
				escolhaAtaque = ataqueUsuario();
				switch (escolhaAtaque) {
				case 1:
					System.out.println("Seu monstro aplicou um soco.");
					
					monstro.setHpComputador(-7);
					//hpComputador -=7	
					break;
				case 2:
					if (contagemEspecial > 0) {
						System.out.println("Seu monstro aplicou um ataque especial");
						monstro.setHpComputador(-20);
						//hpComputador -= 20;
						contagemEspecial--;
					} else {
						System.out.println("Voce não possui mais Ataques especiais!");
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
				if (monstro.getHpComputador() > 0) {
					escolhaAtaque = ataqueComputador();
					switch (escolhaAtaque) {
					case 1:
						System.out.println("Monstro Adversario lhe aplicou um soco");
						monstro.setHpUsuario(-2 + (int) (i/5));
						//hpUsuario -= 2 + (int) (i / 5);
						break;

					case 2:
						System.out.println("Monstro Adversario lhe aplicou um soco");
						monstro.setHpUsuario(-2 + (int) (i/5));
						break;
					case 3:
						System.out.println("Monstro Adversario lhe voltou com um chute");
						monstro.setHpUsuario(-3 + (int) (i/5));
						break;

					case 4:
						System.out.println("Monstro Adversario lhe voltou com um chute");
						monstro.setHpUsuario(-3 + (int) (i/5));
						break;

					case 5:
						System.out.println("Monstro Adversario lhe devolveu com ataque especial.");
						monstro.setHpUsuario(-5 + (int) (i/5));
						;
						break;
					}
				} else {
					System.out.println("inimigo derrotado");

				}
				if (monstro.getHpUsuario() > 0) {
					monstro.setHpUsuario(+5); 
					if (monstro.getHpUsuario() > 150) {
						monstro.setHpUsuario(100);
						//hpUsuario = 150;
					}
					if (i % 10 == 0) {
						contagemEspecial++;
						if (contagemEspecial > 5) {
							contagemEspecial = 5;
						}
					}
				}
			}
			i++;
		}
		return i;
	}


}
