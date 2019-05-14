import java.util.Scanner;

public class Main {

	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int continua = 1;
		int recorde = 0;
		Jogo jogo = new Jogo();
		
		
		while (continua == 1) {
			
			//jogo.gerarTipo();
			
			//jogo.gerarAdversario();

			
			//jogo.batalha();
			
			int pontos = jogo.batalha();
			System.out.println("Usuario chegou a " + pontos + " pontos ");
			if(pontos > recorde) {
				recorde = pontos;
			}
			System.out.println("RECORDE ATUAL = " + recorde);

			
			System.out.println("FIM DE JOGO. Deseja continuar? (1) Sim (2) Não");
			continua = ler.nextInt();
		}
		System.out.println("Então não joga po");

	}

}
