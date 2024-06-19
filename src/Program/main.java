package Program;

import java.util.Scanner;

import Entities.Champion;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Champion champion = new Champion();
		Champion other = new Champion();
		
		for(int i=0; i<2; i++) {
			if(i == 0) {
				System.out.println("Digite os dados do primeiro campeão:");
			}else {
				System.out.println("Digite os dados do segundo campeão:");
			}
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Vida inicial: ");
			int vida = sc.nextInt();
			System.out.print("Ataque: ");
			int ataque = sc.nextInt();
			System.out.print("Armadura: ");
			int armadura = sc.nextInt();
			System.out.println("");
			if(i == 0) {
				champion = new Champion(name, vida, ataque, armadura);
			}else {
				other = new Champion(name, vida, ataque, armadura);
			}
		}
		
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("");
			System.out.println("Resultado do turno " + (i+1) + ":");
			
			champion.takeDamage(other);
			if(champion.getLife() <= 0){
				champion.setLife(0);
				System.out.println(champion.status() + "(morreu)");
				System.out.println(other.status());
				i = n;
			}else if(other.getLife() <= 0) {
				other.setLife(0);
				System.out.println(other.status() + "(morreu)");
				System.out.println(other.status());
				i = n;
			}else {
				System.out.println(champion.status());
				System.out.println(other.status());
			}
		}

		System.out.println("");
		System.out.println("FIM DO COMBATE");
	}
}
