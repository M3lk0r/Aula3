package aula3;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Algoritmo11();
		Algoritmo12();
		Algoritmo16();
		Algoritmo18();
		Algoritmo23();
		Algoritmo25();
		Algoritmo26();
		Algoritmo27();
		Algoritmo31();
		Algoritmo40();
		Algoritmo41();
		Algoritmo42();
		Algoritmo43();
		Algoritmo44();
		Algoritmo46();
		Algoritmo48();
	}

	private static void Algoritmo11() {
		System.out.println("Aprendendo Algoritmo!!!");
	}
	
	private static void Algoritmo12() {
		System.out.println("Aprendendo Algoritmo!!!");
		System.out.println("Com Anita e Guto");
	}
	
	private static void Algoritmo16() {
		int x;
		x = 10;
		System.out.println(x);
	}
	
	private static void Algoritmo18() {
		int x;
		x = 10;
		System.out.println("Valor de x = " + x);
	}
	
	private static void Algoritmo23() {
		int a, d;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite número de tres casas:");
		a = scanner.nextInt();
		
		d = (a % 100)/10;
		System.out.print("Algarismo da casa das dezenas: " + d);
		System.out.print("\n");
	}
	
	private static void Algoritmo25() {
		int data, dia, mes, ano;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite data no formato ddmmaa:");
		data = scanner.nextInt();
		dia = data/10000;
		mes = (data % 10000)/100;
		ano = data % 100;
		
		System.out.println("DIA: " + dia);
		System.out.println("MES: " + mes);
		System.out.print("ANO: " + ano);
		System.out.print("\n");
	}
	
	private static void Algoritmo26() {
		int data, dia, mes, ano, ndata;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite data no formato DDMMAA:");
		data = scanner.nextInt();
		dia = data/10000;
		mes = (data % 10000)/100;
		ano = data % 100;
		ndata = mes * 10000 + dia * 100 + ano;
		
		System.out.println("DIA: " + dia);
		System.out.println("MES: " + mes);
		System.out.println("ANO: " + ano);
		System.out.print("DATA NO FORMATO MMDDAA: " + ndata);
		System.out.print("\n");
	}
	
	private static void Algoritmo27() {
		int x, y;
		x = 2;
		y = 5;
		
		System.out.print("\n x = " + x);
		x++;
		System.out.print("\n y = " + y);
		y--;
		System.out.print("\n\n novo valor de x = " + x);
		System.out.print("\n\n novo valor de y = " + y);
		System.out.print("\n\n");
	}
	
	private static void Algoritmo31() {
		float ma;
		ma = (8 + 9 + 7)/3;
		System.out.print("\n A media aritmética e: " + ma);
		System.out.print("\n");
	}
	
	private static void Algoritmo40() {
		int quoc, rest, val1, val2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Entre com o dividendo: ");
		val1 = scanner.nextInt();
		System.out.print("\n Entre com o divisor: ");
		val2 = scanner.nextInt();
		
		quoc = val1/val2;
		rest = val1 % val2;
		System.out.print("\n\n\n");
		
		System.out.print("\n Dividendo: " + val1);
		System.out.print("\n Divisor: " + val2);
		System.out.print("\n Quociente: " + quoc);
		System.out.print("\n Resto: " + rest);
		System.out.print("\n");
	}
	
	private static void Algoritmo41() {
		float a, b, c, d, mp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Entre com 1 numero: ");
		a = scanner.nextFloat();
		System.out.print("\n Entre com 2 numero: ");
		b = scanner.nextFloat();
		System.out.print("\n Entre com 3 numero: ");
		c = scanner.nextFloat();
		System.out.print("\n Entre com 4 numero: ");
		d = scanner.nextFloat();
		
		mp = (a*1 + b*2 + c*3 + d*4)/10;
		System.out.print("\n Media ponderada: " + mp);
		System.out.print("\n");
	}
	
	private static void Algoritmo42() {
		double angulo, rang;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Digite um angulo em graus: ");
		angulo = scanner.nextDouble();
		
		rang = (angulo * Math.PI)/180;
		System.out.print("\n seno: " + Math.sin(rang));
		System.out.print("\n co-seno: " + Math.cos(rang));
		System.out.print("\n tangente: " + Math.tan(rang));
		System.out.print("\n co-secante: " + 1/Math.sin(rang));
		System.out.print("\n secante: " + 1/Math.cos(rang));
		System.out.print("\n cotangente: " + 1/Math.tan(rang));
		System.out.print("\n");
	}
	
	private static void Algoritmo43() {
		double num, logaritmo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Entre com o logaritmando: ");
		num = scanner.nextDouble();
		
		logaritmo = Math.log(num)/Math.log(10);
		System.out.print("\n Logaritmo: " + logaritmo);
		System.out.print("\n");
	}
	
	private static void Algoritmo44() {
		double num, base, logaritmo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Entre com o logaritmando: ");
		num = scanner.nextDouble();
		System.out.print("\n Entre com a base: ");
		base = scanner.nextDouble();
		
		logaritmo = Math.log(num)/Math.log(base);
		System.out.print("\n Logaritmo de " + num + "na base " + base + ": " + logaritmo);
		System.out.print("\n");
	}
	
	private static void Algoritmo46() {
		double saldo, nsaldo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Digite saldo: ");
		saldo = scanner.nextDouble();
		
		nsaldo = saldo * 1.01;
		System.out.print("\n Novo saldo: " + nsaldo);
		System.out.print("\n");
	}
	
	private static void Algoritmo48() {
		double sm, qtdade, preco, vp, vd;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n Entre com o salario minimo: ");
		sm = scanner.nextDouble();
		System.out.print("\n Entre com a quantidade em quilowatt: ");
		qtdade = scanner.nextDouble();
		
		preco = sm/700;
		vp = preco * qtdade;
		vd = vp * 0.9;
		System.out.print("\n Preço do quilowatt: " + preco + "\n Valor a ser pago: " + vp + "\n Valor com desconto: " + vd);
		System.out.print("\n");
	}
}
