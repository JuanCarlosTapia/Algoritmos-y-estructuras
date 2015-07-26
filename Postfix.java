public class postfix {
	
	
	private stack Pila;
	
	
	
	public postfix() {
		
		Pila = new stack();
	}




	public stack getPila() {
		return Pila;
	}


	public void setPila(stack pila) {
		Pila = pila;
	}


	public double evaluar(String Expresion){
		int contador = 0;
		double numero;
		while(contador< Expresion.length()){
			
			switch (Expresion.substring(contador, contador+1)){
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				numero = Double.parseDouble(Expresion.substring(contador, contador+1));
				
				Pila.push(numero);
				
				break;
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
			
		contador++;	
		}
		return Pila.pop();
		
	}
	
}
