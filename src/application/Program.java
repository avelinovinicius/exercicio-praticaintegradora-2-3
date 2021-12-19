package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Quantos produtos? ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Produto: ");
			String name = sc.nextLine();

			System.out.println("Preco: ");
			double price = sc.nextDouble();

			System.out.println("Quantidade: ");
			int quantity = sc.nextInt();

			vect[i] = new Product(name, quantity, price);

		}

		// Calculo e exibicao do Array
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice() * vect[i].getQuantity();

			System.out.println("Produto " + (i + 1) + "\n" + vect[i].getName() + "\n" + "R$ " + vect[i].getPrice()
					+ "\n" + "Quantidade " + vect[i].getQuantity() + "\n");

		}
		System.out.println("Valor total: R$ " + sum);

		sc.close();
	}

}
