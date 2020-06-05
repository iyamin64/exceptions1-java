
public class Exemplos {

	public static void main(String[] args) {
		//Exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);

		//Exemplo 2
		int m;
		double n;
		m = 5;
		n = 2 * m;
		System.out.println(m);
		System.out.println(n);
		
		//Exemplo 3
		/*
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		*/	
		
		float b, B, h, area;
		b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		
		//Exemplo 4
		int e, f;
		double resultado;
		e = 5;
		f = 2;
		//resultado = e / f;
		resultado = (double) e / f;
		System.out.println(resultado);
		
		//Exemplo 5
		double o;
		int p;
		
		o = 5.0;
		p = (int) o; // se não se importar em perder os dados
		
		System.out.println(p);
		
	}

}
