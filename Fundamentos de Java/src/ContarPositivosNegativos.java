
public class ContarPositivosNegativos {

	public static void main(String[] args) {
		int[] numeros = new int[] {
				1,-3,6,8,-9,19,-20,0,17,200
		};
		
		System.out.println(numeros.length);
		int ceros = 0, positivos = 0, negativos = 0;
		int sumaPositivos = 0, sumaNegativos = 0;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] > 0) {
				positivos++;
				sumaPositivos += numeros[i];
			} else {
				negativos++;
				sumaNegativos += numeros[i];
		
			}
		}
		
		System.out.println(ceros);
		System.out.println(positivos);
		System.out.println(negativos);
		System.out.println("Positivos: " + sumaPositivos);
		System.out.println("Negativos: " + sumaNegativos);
	}

}
