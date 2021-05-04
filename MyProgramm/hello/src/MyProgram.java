import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MyProgram {

	public static void main(String[] args) throws Exception {
		int e = 1000, s = 10000, p = 10000;
		int j[] = new int[3];
		int avt;
		System.out.print("for exit from  the game, press '0'");
		System.out.println("");
		System.out.print("for begin a new game, write '101010'");
		System.out.println("");
		System.out.print("for see author's account, write '545489'");
		System.out.println("");
		System.out.print("for see your account, write 232323");
		System.out.println("");
		System.out.print("____________________________________");
		System.out.println("");
	

		while (e == 1000) {
			System.out.println("|                                 |");
			System.out.print("|write stake                      |");
			System.out.println("|                                 |");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String stake1 = br.readLine();
			int stake = Integer.parseInt(stake1);
			avt = stake;

			if (stake == 232323){
				System.out.println("|                                 |");
				System.out.print("|your account:" + s + " kr.              |");
				continue;
			}
			if (stake == 101010) {
				System.out.print("|new game                          |");
				s = 10000;
				continue;
			}

			if (stake == 0) {
				System.out.print("|game over.                        |");
				System.out.println("____________________________________");
				Thread.sleep(2500);
				break;
			}
			if (avt == 545489) {
				System.out.print("|author's account " + (s = p - s) + "              |");
				
				continue;
			}
			if (stake > s) {
				System.out.print("|you're cheater!                   |");
				s = 10000;
				System.out.println("|                                 |");
				System.out.print("|New game: Your account = 10000kr  |");
				System.out.println("|                                 |");
			continue;
			}
			System.out.print("|your stake = " + stake + "kr.                   |");
			System.out.println("");
			for (int i = 0; i < 3; i++) {

				// StreamWrapper( System.in);
				Thread.sleep(e);
				// System.out.println(Math.random()*10);

				Random r = new java.util.Random();
				j[i] = r.nextInt(2);
				System.out.print("|"+j[i] + "                         |");
				Thread.sleep(e);
			}
			System.out.println("|                                 |");
			if (j[0] == j[1] && j[1] == j[2]) {
				System.out.println("|                                 |");
				System.out.print("|win!                             |");
				System.out.println("|                                 |");
				s = s + (stake*3);

			} else {
				System.out.print("|fail!                             |");
				System.out.println("|                                 |");
				s = s - stake;
				
			}

			System.out.println("|                                 |");
			if (stake == 545489) {
				System.out.print("|author's account " + (p = 1000 - s) + "   |");
			}
			if (s <= 0) {
				System.out.println("|                                  |");
				System.out.print("|you're bankrupt!                  |");
				s = 10000;
				System.out.println("|                                  |");
				System.out.print("|New game: Your account = 10000kr  |");
				System.out.println("|                                  |");
			continue;
				}
			System.out.println("");
			System.out.println("|                                      |");
			System.out.println("|                                      |");
		}
	}
}