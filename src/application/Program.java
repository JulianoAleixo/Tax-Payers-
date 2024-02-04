package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			char ch;
			do {
				System.out.print("Individual or company (i/c)? ");
				ch = sc.next().charAt(0);
			} while (ch != 'i' && ch != 'c');
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer payer = new Individual(name, anualIncome, healthExpenditures);
				list.add(payer);
			} 
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer payer = new Company(name, anualIncome, numberOfEmployees);
				list.add(payer);
			}
		}
		
		double sum = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer payer : list) {
			System.out.println(payer);
			sum += payer.totalTax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f%n", sum);
		sc.close();
	}

}
