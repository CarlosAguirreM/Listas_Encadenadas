package paquete;

public class DLinkedList {
	protected static Nodo head; 	//Nodo cabecera
	protected long size;	//Numero de nodos en la lista
	protected static Nodo tale;
	
	public DLinkedList(){
		head = null;
		tale = null;
		head.setPreview(tale);
		tale.setNext(head);
		size =0;
	}
	
	public long getSize() {
		return size;
	}
	
	public boolean verifica_vacio(){
		return getSize()==0;
	}

	public void addFirst(Nodo v){
		/*if (verifica_vacio()==true)
		{
			head.setNext(v);
		}
		else{*/
			Nodo aux = null;			//tale<-->head	
			aux=head.getnext();		   //aux = head-->
			v.setNext(aux);				// v-->aux
			v.setPreview(head);			// head<--v
			aux.setPreview(v);			// v<--aux
			head.setNext(v);			//head--->V
					 	
		//}
		size = size + 1;
	}
	public void addLast(Nodo v){
		
			Nodo aux = null;			//tale<-->head	
			aux=tale.getPreview();		// aux = <---tale
			v.setPreview(aux);			// aux <---v
			v.setNext(tale);			// v--->tale
			aux.setNext(v);				// aux--->v
			tale.setPreview(v);			// v<---tale		
		size = size + 1;
		
	}
	
	public void removeFirst(){
		Nodo t;
		if (head == null){
			System.out.println("Error");
		}
		else{
			t=head;
			head = head.getnext();
			t.setNext(null);
			size=size-1;
		}
	}
	
	public void removeLast(){
		Nodo t;
		if (tale == null){
			System.out.println("Error");
		}else{
			t=tale;
			tale = tale.getPreview();
			t.setPreview(null);
			size=size-1;
		}
	}
	
	public void removeall(){
		head = null;
		tale = null;
		head.setPreview(tale);
		tale.setNext(head);
		size =0;
	}

	public boolean ListaVacia(){

		return head==null&&tale==null;
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
	

}
