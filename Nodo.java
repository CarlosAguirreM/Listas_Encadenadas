package paquete;

public class Nodo {
	
	private String elemento; 	//asumimos elmentos tipo string
	private Nodo next;			//Creamos un nodo dandole elemento y siguiente nodo
	private Nodo preview;
	public Nodo(String s,Nodo n,Nodo m){
		elemento 	= s;
		next		= n;
		preview 	= m;
	}
	public Nodo(String s,Nodo n){
		elemento = s;
		next	=	n;
		preview = null;
		
	}
	public Nodo(String s){
		elemento = s;
		preview = 	null;
		next	=	null;
	}
	
	
	
	public String getElemento(){return elemento;}
	
	public Nodo getnext(){return next;}
	
	public void setElement(String newElem){elemento = newElem;}
	
	public void setNext(Nodo newNext){next = newNext;}
	
	public Nodo getPreview() {return preview;}
	
	public void setPreview(Nodo preview) {this.preview = preview;}

}
