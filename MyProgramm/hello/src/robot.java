import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class robot {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		int j[] = new int[3];
		 String d1 = br.readLine();
		 if (d1.compareTo("hello")){
				Random r = new java.util.Random();
				j[0] = r.nextInt(3);
				if(j[0] == 1){
					System.out.print("hello!");
				}
				if(j[0] == 2){
					System.out.print("hi!");
				}
				if(j[0] == 1){
					System.out.print("yes?");
				}
		 }

	}

}
