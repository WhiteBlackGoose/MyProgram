
public class test {

	public static void main(String[] args) {
		int i[] = new int[11];
		int corobok = 0, poisk = 0,x;
		for (x = 0; x < 11; x++){
			i[x] = i[x] + x;
			//System.out.print(i[x] + " ");
		}
		for (x = 0; x < 6; x++){
			if (i[x] / 2 == ((i[x] - 1) / 2)){
				poisk = i[x];
				//System.out.print(i[x] + " ");
			}
			
			if (i[x] / 2 > ((i[x] - 1) / 2)){
				corobok = i[x];
				//System.out.print(i[x] + " ");
			}
			System.out.println("");
			System.out.print (corobok  + " " + poisk + " ");
		}
	}

}
