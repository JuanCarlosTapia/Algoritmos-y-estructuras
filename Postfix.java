public class postfix {
	
	// Atributos
	private stack Pila; // Pila para las operaciones
	
	
	// Constructor
	public postfix() {
		
		Pila = new stack();
	}



	// Gets y sets
	public stack getPila() {
		return Pila;
	}


	public void setPila(stack pila) {
		Pila = pila;
	}

	//Metodo para evaluar
	public double evaluar(String Expresion){
		int contador = 0; 
		double numero;
		while(contador< Expresion.length()){ // Mientras no se hayan revisado todos los caracteres
			
			switch (Expresion.substring(contador, contador+1)){ // Se revisa un caracter y se actua dependiendo de lo que sea
			case "0": //Si es un digito
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				numero = Double.parseDouble(Expresion.substring(contador, contador+1)); // Se convierte el string a Double
				
				Pila.push(numero); // y se mete a la pila.
 				
				break;
			// Si es un operador, se sacan 2 numeros de la pila, se operan, y se vuelve a meter el resultado.
			case "+":
				Pila.push(Pila.pop()+Pila.pop());
				break;
				
			case "-":
				Pila.push(-Pila.pop()+Pila.pop());
				break;
				
			case "*":
				Pila.push(Pila.pop()*Pila.pop());
				break;
				
			case "/":
				Pila.push(1/Pila.pop()*Pila.pop());
				break;
			}
			
		contador++;	// Se aumenta el contador
		}
		return Pila.pop(); // Se devuelve el resultado que es el unico elemento que quedo en la pila.
		
	}
	
}
