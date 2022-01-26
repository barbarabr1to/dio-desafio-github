package com.filas;

public class Main {

	public static void main(String[] args) {
	
		Fila<String> fl = new Fila<String>();
		
		fl.enqueue("Primeiro");	
		fl.enqueue("Segundo");
		fl.enqueue("Terceiro");
		fl.enqueue("Quarto");
		
		System.out.println(fl);
		
		System.out.println(fl.dequeue());
		
		System.out.println(fl);
		
		fl.enqueue("Quinto");
		
		System.out.println(fl);
		
		System.out.println(fl.first());
		

	}

}
