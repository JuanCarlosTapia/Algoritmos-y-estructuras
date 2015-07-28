public class stack {
	//Atributos
	boolean isEmpty; // Indica que esta vacio
	Nodo Cabeza; // Indica el valor en el fondo
	Nodo Actual; // Indica el valor que debe ser el siguiente en salir.
	
	//Consructor
	public stack() {
		this.isEmpty = true;
		Cabeza = null;
		Actual = Cabeza;
	}
	//Metodos
	
	public void push(int valor){ // Metodo para meter valores en el stack.
		if(isEmpty){
			Actual = new Nodo(valor);
			Cabeza = Actual;
			isEmpty = false; // Ya no esta vacio
			return;
		}
		
			Nodo newNodo = new Nodo(valor);  
			newNodo.setSiguiente(Actual); // El nuevo nodo apunta al actual
			Actual = newNodo; //Y el nuevo actual es el nuevo nodo, que apunta al anterior actual
	}

	public int pop(){ // Metodo para sacar del Stack
		if(isEmpty){ // Si esta vacio devuelve -1
			return -1;
		}
		if(Actual ==Cabeza){ // Si el actual es el que esta al fondo
			int regreso = Actual.getValor(); 
			isEmpty=true; // Ahora esta vacio
			Cabeza = null;
			Actual = Cabeza;
			return regreso;
		} // Si el actual no es el fondo
		int regreso = Actual.getValor(); 
		Actual = Actual.getSiguiente();// El nuevo actual se vuelve al que apuntaba el actual anterior.
		return regreso;
	}
	
}
