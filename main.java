import java.io.*;

public class main {
	public static void main(String[] args) {
		
		
		
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      postfix Postfix = new postfix(); // Se crea la clase donde se realiza el calculo.
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("datos.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         
         String linea;
         String expresion = "";
         while((linea=br.readLine())!=null){ // Lee cada linea del archivo.
         expresion = linea;
		 System.out.println(expresion);
         double resultado = Postfix.evaluar(expresion);
 		 System.out.println("Resultado: "+resultado);
		 }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
		
		
	
			
		
		
	}
		
}
