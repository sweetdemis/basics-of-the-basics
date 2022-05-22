public class coisitas {
	
	public static void main(String[] args) {
		
		//array
		String[] colors = null;
		colors[0] = "blue";
		colors[1] = "green";
		
		String[] scolors = {"white", "black", "gray", "pink", "red"};
		System.out.println(scolors[2]);
		scolors[4] = "orange"; //muda um array
		System.out.println(scolors.length); //tamanho do array
		
		//criando um loop com for
		for (int j=0; j<scolors.length; j++) {
			System.out.println(scolors[j]);
		}
		
		//loop com for-each
		for (String k : scolors) {
			System.out.println(k);
		}
		
		//array multidimensional
		int [][] gar = {{1, 2, 3, 4},{5, 6, 7}};
		System.out.println(gar[1][2]); //para acessar, primeiro é o numero do array e depois o elemento dentro dele
	}
}
