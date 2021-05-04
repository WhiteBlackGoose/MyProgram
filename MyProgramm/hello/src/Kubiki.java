import java.util.Random;


public class Kubiki {


	public static void main(String[] args) {
		int i = 0;
		int j[] = new int[3];		
		Random r = new java.util.Random();
		for (;i<2;i++){
		j[i] = r.nextInt(6);
		System.out.print((j[i] = j[i] + 1) + " ");
		}
		i = 0;
		for (;i<1;i++){
		j[i] = r.nextInt(3);
		System.out.print("buy, or not buy  (1 2 = buy; 3 = not)" + (j[i] = j[i] + 1));
		}

	}

}
