package controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainLab {

	public static void main(String[] args) {
		
// Tarefa A1		
//		List<Integer> num = new ArrayList<>(Arrays.asList(5,2,8,1,9));
//		Collections.sort(num);
//		System.out.println("Lista Ordenada: " + num);
//		System.out.println("A posição do número 8 é: " + Collections.binarySearch(num, 8));
//		Collections.reverse(num);
//		System.out.println("Lista revertida: " + num);
//		Collections.shuffle(num);
//		System.out.println("Lista embaralhada: " + num);
		
		
//		Tarefa A2
//		List<String> l1 = new ArrayList(Arrays.asList("Java", "Python", "C++"));
//		List<String> l2 = new ArrayList(Arrays.asList("C#", "Java", "Go"));
//		List<Integer> l3 = new ArrayList(Arrays.asList(1,2,4,5,6));
//		
//		Collections.addAll(l1, "Kotlin", "Swift");
//		System.out.println("Lita com items adicionados: " + l1);
//		Collections.frequency(l1, "Java");
//		System.out.println("Frequencia de Java: " + l1);
//		boolean successes = Collections.disjoint(l1, l2);
//		System.out.println("Lista Verificada: " + successes);
//		
//		Collections.min(l3);
//		System.out.println("Valor mímino da lista: " + l3);
//		Collections.max(l3);
//		System.out.println("Valor máximo da lista: " + l3);
		
		
		// Tarefa B2
//		String palavra = "ALGORITMO";
//        Stack<Character> pilha = new Stack<>();
//
//        // Empilhar cada caractere
//        for (char c : palavra.toCharArray()) {
//            pilha.push(c);
//        }
//
//        // Desempilhar para inverter
//        String invertida = "";
//        while (!pilha.isEmpty()) {
//            invertida += pilha.pop();
//        }
//
//        System.out.println("Original:  " + palavra);
//        System.out.println("Invertida: " + invertida);
//    }
//		
//	
		
		
//		Tarefa C1
//		PriorityQueue<String> fila = new PriorityQueue<>();
//		fila.offer("Doc1");
//		fila.offer("Doc2");
//		fila.offer("Doc3");
//		System.out.println("Fila ordenada automaticamente: " + fila);
//		while(!(fila.size() == 1)) {
//			System.out.println("Maior prioridade: " + fila.peek());
//			System.out.println("Removendo: " + fila.poll());
//		}
//		fila.offer("Doc4");
//		System.out.println("Fila ordenada automaticamente: " + fila);
		
		
		
		
//		Tarefa C2
//		PriorityQueue<Integer> fila = new PriorityQueue<>(Comparator.reverseOrder());
//		fila.offer(30);
//		fila.offer(10);
//		fila.offer(20);
//		fila.offer(40);
//		
//		while(!fila.isEmpty()) {
//			System.out.println("Topo: " + fila.peek());
//			System.out.println("Removendo: " + fila.poll());
//		}
		
		
//		Tarefa D1
//		Set<String> fila = new HashSet<>();
//		Set<Integer> fila2 = new TreeSet<>();
//		fila.add("Java");
//		fila.add("Python");
//		fila.add("C++");
//		fila.add("Java");
//		
//		for(String teste : fila) {
//			System.out.println(teste);
//		}
//		
//		fila2.add(10);
//		fila2.add(5);
//		fila2.add(8);
//		fila2.add(1);
//		
//		Set<Integer> menores = ((TreeSet<Integer>) fila2).headSet(8);
//		Set<Integer> maiores = ((TreeSet<Integer>) fila2).tailSet(8);
//		
//		System.out.println("OS numeros menores que 8 = " + menores);
//		System.out.println("OS numeros maiores que 8 = " + maiores);
		
		
//		Tarefa D2
//		Map<String,Integer> lista = new HashMap<>();
//	
//		
//		lista.put("Ana", 90);
//		lista.put("Carlos", 80);
//		lista.put("Bianca", 85);
//		
//		System.out.println(lista.get("Ana"));
//		System.out.println(lista.get("Carlos"));
//		System.out.println(lista.get("Bianca"));
//		System.out.println(lista.size());
//		
//		Map<String,Integer> lista2 = new TreeMap<>(lista);
//		for(Map.Entry<String, Integer> entry : lista2.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		
		
//		Tarefa E1
		
		
		
	}	
		
	
	
	
	
	
	
	
	
	
	
	
	
	// Tarefa B1
	
	public static boolean balanceada(String expressao) {

        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // encontrou ')' sem um '(' correspondente
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty(); // se ainda restou '(' na pilha → desbalanceada
    }

    // Método main
    public static void main2(String[] args) {

        String[] entradas = {
            "((2+3)*(4-1))",
            ")(2+3)(",
            "(1+(2*3)"
        };

        for (String exp : entradas) {
            System.out.println(exp + " -> " +
                (balanceada(exp) ? "Balanceada" : "Desbalanceada"));
        }
    }
    
    static void blocoE() {
        System.out.println("== BLOCO E: Lista Encadeada & BST ==");
        
        // Tarefa E1
        System.out.println("\n--- Tarefa E1 ---");
        ListaEncadeada lista = new ListaEncadeada();
        lista.insertAtBack(2); lista.insertAtBack(3); lista.insertAtFront(1);
        lista.insertAtFront(4); lista.insertAtBack(5);
        System.out.print("E1 - Após inserções: "); lista.print();
        lista.removeFromFront(); lista.removeFromBack();
        System.out.print("E1 - Após remoções: "); lista.print();

        // Tarefa E2
        System.out.println("\n--- Tarefa E2 ---");
        BST bst = new BST();
        for (int v : new int[]{8, 3, 10, 1, 6, 14, 4, 7, 13}) bst.insert(v);
        System.out.print("E2 - In-order: "); bst.inOrder();
        System.out.print("E2 - Pre-order: "); bst.preOrder();
        System.out.print("E2 - Post-order: "); bst.postOrder();
    }

    static class ListaEncadeada {
        static class Node { int d; Node n; Node(int d) { this.d = d; } }
        Node h;
        void insertAtFront(int d) { Node x = new Node(d); x.n = h; h = x; }
        void insertAtBack(int d) {
            Node x = new Node(d);
            if (h == null) { h = x; return; }
            Node a = h;
            while (a.n != null) a = a.n;
            a.n = x;
        }
        void removeFromFront() { if (h != null) h = h.n; }
        void removeFromBack() {
            if (h == null || h.n == null) { h = null; return; }
            Node a = h;
            while (a.n.n != null) a = a.n;
            a.n = null;
        }
        void print() {
            Node a = h;
            while (a != null) {
                System.out.print(a.d);
                if (a.n != null) System.out.print("->");
                a = a.n;
            }
            System.out.println();
        }
    }

    static class BST {
        static class Node { int v; Node l, r; Node(int v) { this.v = v; } }
        Node r;
        void insert(int v) { r = insert(r, v); }
        Node insert(Node n, int v) {
            if (n == null) return new Node(v);
            if (v < n.v) n.l = insert(n.l, v);
            else if (v > n.v) n.r = insert(n.r, v);
            return n;
        }
        void inOrder() { inOrder(r); System.out.println(); }
        void preOrder() { preOrder(r); System.out.println(); }
        void postOrder() { postOrder(r); System.out.println(); }
        void inOrder(Node n) { if (n != null) { inOrder(n.l); System.out.print(n.v + " "); inOrder(n.r); } }
        void preOrder(Node n) { if (n != null) { System.out.print(n.v + " "); preOrder(n.l); preOrder(n.r); } }
        void postOrder(Node n) { if (n != null) { postOrder(n.l); postOrder(n.r); System.out.print(n.v + " "); } }
    }

}

