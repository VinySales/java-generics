package application;

import java.util.Scanner;

import service.PrintService;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantidade de elementos: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			ps.addValue(x);
		}
		
		ps.print();
		System.out.println(ps.first());
		
		scan.close();
		
	}
	
}
