public class Nodo {
	//Atributos
	Object Content;
	Nodo Siguiente;
	
	//Constructores
	public Nodo() {
		Content = null;
		Siguiente = null;
	}
	
	public Nodo(Object content) {
		this.Valor = valor;
		Siguiente = null;
	}
	//Gets y Sets
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
