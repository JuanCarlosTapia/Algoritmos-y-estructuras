public class Nodo {
	int Valor;
	Nodo Siguiente;
	
	
	public Nodo() {
		Valor = 0;
		Siguiente = null;
	}
	
	public Nodo(int valor) {
		this.Valor = valor;
		Siguiente = null;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		this.Valor = valor;
	}
	public Nodo getSiguiente() {
		return Siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		Siguiente = siguiente;
	}
	
	
	
}
