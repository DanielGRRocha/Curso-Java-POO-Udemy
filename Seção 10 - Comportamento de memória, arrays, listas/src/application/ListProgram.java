package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {
	
	public static void main(String[] args) {
		
		//declarar lista de números inteiros
		//List não aceita tipos primitivos (usar wrapper class Integer)
		// <String> se chama generics (parametrizar a definição de um tipo informando um outro tipo)
		
		//List<Integer> list = new List<>();
		//não é possível instanciar uma interface - para isso usa-se uma classe que implementa a interface list como ArrayList e LinkedList
		
		List<String> list = new ArrayList<>(); // ou ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("Tamanho da lista: " + list.size());
		
		//pecorrer com laço for each
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//remover
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); //função lambda (essa se chama predicado, pois retorna true or false)
		
		System.out.println("Tamanho da lista: " + list.size());
		
		//pecorrer com laço for each
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco") + " (Quando o index não encontra o elemento, ele retorna -1)");
		
		//nova lista
		System.out.println("-----------------------");
		list.remove("Bob");
		list.add("Mariana");
		list.add("Marcela");
		list.add("Carlos");
		list.add("Breno");
		list.add("Rebeca");
		
		//pecorrer com laço for each
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		//manter apenas quem começa com a letra M
		// converte list para stream, faz operação lambda, converte para list novamente
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		//encontrar o primeiro elemento que comece com a letra M (se não existir, retorna null)
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(nome);
		
	}//main

}//class
