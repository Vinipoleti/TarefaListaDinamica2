package view;

import BibliLista.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> L = new Lista<>();
		
		L.addFirst(6);
		L.addFirst(3);
		L.addFirst(7);
		L.addFirst(4);
		L.addFirst(2);
		L.addFirst(9);
		L.addFirst(1);
		L.addFirst(8);
		L.addFirst(5);
		L.addFirst(10);
		
		int tamanho = L.size();
		System.out.println("Lista Original:");
		for (int i=0; i<tamanho; i++) {
			System.out.print(L.get(i)+" ");
		}
		
		System.out.println("");
		
	for (int j=0; j<tamanho; j++) {
		for (int i=0; i < tamanho-1; i++) {
			int aux1= L.get(i);
			L.remove(i);
			int aux2=L.get(i);
			L.remove(i);
				if (aux1<aux2) {
					L.add(aux2, i);
					L.add(aux1, i);
				} else {
					L.add(aux1, i);
					L.add(aux2, i);
				}
			}
		System.out.println("");
		System.out.println("Lista depois da "+(j+1)+ "º passagem: ");
		for (int i=0; i<tamanho; i++) {
			System.out.print(L.get(i)+" ");
		}
	}
			
		System.out.println("");
		System.out.println("Lista Organizada:");
		for (int i=0; i<tamanho; i++) {
			System.out.print(L.get(i)+" ");
		}

}
}