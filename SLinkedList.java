package paquete;

public class SLinkedList {
	protected static Nodo head; 	//Nodo cabecera
	protected long size;	//Numero de nodos en la lista
	public SLinkedList(){
		head = null;
		size =0;
	}
	

	public long getSize() {
		return size;
	}


	public void setSize(long size) {
		this.size = size;
	}


	public void addFirst(Nodo v){
		v.setNext(head);	// {make v point to the old head node} 
		head = v; 			//{make variable head point to new node} 
		size = size + 1; 	//{increment the node count}
	}

	public void removeFirst(){
		Nodo t;
		if (head == null){
			System.out.println("Error");
		}
		t=head;
		head = head.getnext();
		t.setNext(null);
		size=size-1;
	}
	public void removeLast(){
		Nodo t;
		if (head == null){
			System.out.println("Error");
		}
		t=head;
		head = head.getnext();
		t.setNext(null);
		size=size-1;
	}

	public boolean ListaVacia(){

		return head==null;
	}

	public String imprimirLista(){
		String R="Lista de nodos \n";

		if(!ListaVacia()){

			Nodo nodoaux= head;
			int i=0;

			while(nodoaux!= null){
				R+="\n "+ i + " ["+ nodoaux.getElemento()+"] ";
				nodoaux=nodoaux.getnext();
				i++;
			}

		}
		return R;

	}
	public static String Busqueda(String elemento){
		Nodo B=head;   
		boolean e=false;
		String cont="";
		while(B!=null&&e!=true){
			if(elemento.equals(B.getElemento()))
			{	
				cont = B.getElemento();
				e=true;
			}
			else
				B=B.getnext();
		}
		return cont;
	}


	public void addLast(Nodo v){

		if(ListaVacia()==true)
			head = v;
		else{
			Nodo nodoauxiliar=head;
			while (nodoauxiliar.getnext()!=null){
				nodoauxiliar=nodoauxiliar.getnext();
			}

			nodoauxiliar.setNext(v);
		}
		size++;	
	}

}
