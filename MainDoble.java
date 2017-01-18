package paquete;

import javax.swing.JOptionPane;

public class MainDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		//int i_f=0;
		DLinkedList lista_nodos = new DLinkedList();
		
		do{
			opc =Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"
												+ "\n 1. Ingresar nodo nuevo"
												+ "\n 2. Eliminar nodo"
												+ "\n 3. Eliminar lista"
												+ "\n 4. Buscar"
												+ "\n 5. Consulta tamaño de lista"
												+ "\n 6. Imprimir lista de nodos"
												+ "\n 0. Salir"));
			switch(opc){
			
			case 1: {
				int opc2;
				do{ 
					opc2 =Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"
							+ "\n 1. Ingresar al inicio"
							+ "\n 2. Ingresar al final"
							+ "\n 3. Volver"
							+ "\n 0. Salir"));
					switch(opc2){
					case 1:{
						lista_nodos.addFirst(NuevoNodo());						
						break;}
					case 2:{
						lista_nodos.addLast(NuevoNodo());
						break;}
					case 3:{
						opc=99;
						opc2=0;
						break;}
					
					default:{
						break;}
					}
					
				}while (opc2!=0);
				
				break;
			}
			
			case 2: {
				int opc2;
				do{ 
					opc2 =Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"
							+ "\n 1. Eliminar nodo del inicio"
							+ "\n 2. Eliminar nodo del final"
							+ "\n 3. Volver"
							+ "\n 0. Salir"));
					switch(opc2){
					case 1:{
						lista_nodos.removeFirst();						
						break;}
					case 2:{
						lista_nodos.removeLast();
						break;}
					case 3:{
						opc=99;
						opc2=0;
						break;}
					
					default:{
						break;}
					}
					
				}while (opc2!=0);
				
				break;
			}
			case 3:{
				lista_nodos.removeall();
				break;
			}
			case 4:{
				int opc2;
				do{ 
					opc2 =Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"
							+ "\n 1. Buscar por elemento"
							+ "\n 2. Buscar por posicion"
							+ "\n 3. Volver"
							+ "\n 0. Salir"));
					switch(opc2){
					case 1:{
						lista_nodos.removeFirst();						
						break;}
					case 2:{
						lista_nodos.removeLast();
						break;}
					case 3:{
						opc=99;
						opc2=0;
						break;}
					
					default:{
						break;}
					}
					
				}while (opc2!=0);
				
				break;
			}
			case 5:{
				System.out.println("# de nodos:  "+lista_nodos.getSize()+1);
				break;
			}
			case 6:{
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
		Nodo N = new Nodo(JOptionPane.showInputDialog("Ingrese el contenido del nodo"),null,null) ;
		
		return N;
	}
	
	
	
	

}
