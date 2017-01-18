package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		//int i_f=0;
		SLinkedList lista_nodos = new SLinkedList();
		
		do{
			opc =Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"
												+ "\n 1. Ingresar nodo nuevo al inicio"
												+ "\n 2. Ingresar nodo al final"
												+ "\n 3. Eliminar el ultimo nodo"
												+ "\n 4. Eliminar el primer ndoo"
												+ "\n 5. Buscar por contenido"
												+ "\n 6. Consulta tamaño de lista"
												+ "\n 7. Imprimir lista de nodos"
												+ "\n 0. Salir"));
			switch(opc){
			
			case 1: {
				lista_nodos.addFirst(NuevoNodo());
				break;
			}
			case 2: {
				lista_nodos.addLast(NuevoNodo());
				break;
			}
			case 3:{
				lista_nodos.removeFirst();
				break;
			}
			case 5:{
				System.out.println(lista_nodos.Busqueda(JOptionPane.showInputDialog("Ingrese el contenido a buscar")));
				break;
			}
			case 6:{
				System.out.println("# de nodos:  "+lista_nodos.getSize()+1);
				break;
			}
			case 7:{
				System.out.println(lista_nodos.imprimirLista());
				break;
			}
			default:
			{
				break;
			}
			
			}
			
		}while(opc!=0);
		
		
		System.out.println(lista_nodos.imprimirLista());
	}
	
	public static Nodo NuevoNodo(){
		Nodo N = new Nodo(JOptionPane.showInputDialog("Ingrese el contenido del nodo"),null) ;
		
		return N;
	}
	
	
	
	

}
