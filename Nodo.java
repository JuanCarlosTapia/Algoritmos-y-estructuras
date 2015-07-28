public class Nodo {
	Object Content;
	Nodo Siguiente;
	
	
	public Nodo() {
		Content = null;
		Siguiente = null;
	}
	
	public Nodo(Object content) {
		this.Valor = valor;
		Siguiente = null;
	}
	public Object getContent() {
		return Content;
	}
	public void setContent(Object content) {
		this.Content = content;
	}
	public Nodo getSiguiente() {
		return Siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		Siguiente = siguiente;
	}
	
	
	
}
