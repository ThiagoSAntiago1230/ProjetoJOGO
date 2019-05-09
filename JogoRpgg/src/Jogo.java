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
		//int gerador = 7 ;
		//return gerador;
	}
	
	public int gerarTipo() {
		Random gerador = new Random();
		int gerarTipo = gerador.nextInt(4);
		tipo.setAgua("agua");
		tipo.setFogo("fogo");
		tipo.setGelo("gelo");
		tipo.setTerra("terra");
		switch (gerarTipo) {
		case 0:
			System.out.println(tipo.getAgua());	
			break;
		case 1:
			System.out.println(tipo.getFogo());
			break;
		case 2:
			System.out.println(tipo.getGelo());	
			break;
		case 3:
			System.out.println(tipo.getTerra());
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
		//habilidadeAdversario.setAtirou("Monstro Adversario Atirou com "+ gerarTipo() +" em " );
	

		// monstro.setHpComputador(100);

		// monstro.setNome("VOCE GANHOU UM MONSTRO! dÊ um nome a ele: " +
		// ler.nextLine());

		while (monstro.getHpUsuario() > 0) {
			adversario.setHpComputador(16 + i);

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
					
					case 6:
						System.out.println( habilidadeAdversario.getEspecial()+ " " + monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 5 + (int) (i / 5));
						;
						break;
	
					case 7:
						System.out.println("Monstro Adversario Atirou com "+ gerarTipo() +" em "+ monstro.getNome());
						monstro.setHpUsuario(monstro.getHpUsuario() - 20 + (int) (i / 5));
					}
				} else {
					System.out.println("inimigo derrotado");

				}
				
				
				
				/*				RESETE N SEI FAZER
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
