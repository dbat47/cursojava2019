package controller;

import util.Teclado;

public class Matematica {

	double numero;
	static String avalianumero;

	public static void main(String[] args) {
		int i;
		i = 1;
		Matematica n1 = new Matematica();
		Matematica av = new Matematica();

		n1.numero = Teclado.lerDouble("Digite um valor");
		while (i <= 3) {

			n1.numero = n1.numero + Math.PI;

			i = i + 1;
		}
		if (n1.numero >= 20) {
			av.avalianumero = "Maior que 20";
		} else {
			av.avalianumero = "menor que 20";
		}

		System.out.println(n1.numero);
		System.out.println(av.avalianumero);

	}

}
