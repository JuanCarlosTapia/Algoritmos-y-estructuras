public class stack {
	boolean isEmpty;
	Nodo Cabeza;
	Nodo Actual;
	
	public stack() {
		this.isEmpty = true;
		Cabeza = null;
		Actual = Cabeza;
	}
	
	public void push(int valor){
		if(isEmpty){
			Actual = new Nodo(valor);
			Cabeza = Actual;
			isEmpty = false;
			return;
		}
		
			Nodo newNodo = new Nodo(valor);
			newNodo.setSiguiente(Actual);
			Actual = newNodo;
	}

	public int pop(){
		if(isEmpty){
			return -1;
		}
		if(Actual ==Cabeza){
			int regreso = Actual.getValor();
			isEmpty=true;
			Cabeza = null;
			Actual = Cabeza;
			return regreso;
		}
		int regreso = Actual.getValor();
		Actual = Actual.getSiguiente();
		return regreso;
	}
	
}
