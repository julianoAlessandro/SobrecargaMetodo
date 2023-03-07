public class Matematica {
	double media ( int x , int y ) {
		System.out.println("media (int x, int y)");
		return (x + y )/2;
		
	}
	double media (String x, String y) {
		System.out.println( "media (String x , string y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy )/2;
	}
	
	double media( int...numeros) {
		System.out.println("media(int...numeros) ");
		
	}


	
//realizam a mesma operaçao entretanto com parametros e tipos diferentes - Sobrecarga
}
