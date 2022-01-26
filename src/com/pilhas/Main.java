package com.pilhas;

public class Main {

	public static void main(String[] args) {

		Pilha pl = new Pilha();
		
		pl.push(new No(1));
		pl.push(new No(2));
		pl.push(new No(3));
		pl.push(new No(4));
		pl.push(new No(5));
		pl.push(new No(6));
		
		System.out.println(pl);
		System.out.println(pl.pop());
		System.out.println(pl);
		pl.push(new No(98));
		System.out.println(pl);
	}
}