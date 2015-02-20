
public class Principal {

	public static void main(String[] args) {
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String frase = "Hoy no me puedo levantar".toUpperCase();
		String palabraClave = "esternocleidomastoideo".toUpperCase();
		String abcClave = abc;
		String fraseClave = "";
		int k = 7;

		//Eliminar letras repetidas de palabraClave
		StringBuilder palabra = new StringBuilder(palabraClave);
		for(int i=0; i<palabra.length(); i++) {
			char a = palabra.charAt(i);
			for(int j=i+1; j<palabra.length(); j++) {
				char b = palabra.charAt(j);
				if(a == b) {
					palabra.deleteCharAt(j);
				}
			}
		}
		palabraClave = palabra.toString();
		//System.out.println(palabraClave);
		
		// Colocar palabraClave en abcClave a partir de la posicion k
		int indexAbc = k;
		StringBuilder abecedario = new StringBuilder(abcClave);
		for(int i=0;i<palabraClave.length();i++){
			char a = palabraClave.charAt(i);
			if(indexAbc+1 > abc.length()){
				indexAbc = 0;
			}
			abecedario.setCharAt(indexAbc, a);	
			indexAbc++;
		}
		//System.out.println(abecedario);
		
		//Colocar abc en abcClave sin repetir letras de palabraClave
		for(int i=0;i<abc.length();i++){
			if(indexAbc+1 > abc.length()){
				indexAbc = 0;
			}
			char a = abc.charAt(i);
			boolean letraRep = false;
			for(int j=0;j<palabraClave.length();j++){
				char b = palabraClave.charAt(j);
				if(a == b){
					letraRep = true;
					break;
				}
			}
			if(!letraRep){
				abecedario.setCharAt(indexAbc, a);	
				indexAbc++;
			}
		}
		abcClave = abecedario.toString();
		//System.out.println(abcClave);
		
		//Codificar frase a fraseClave con abcClave
		for(int i=0;i<frase.length();i++){
			char a = frase.charAt(i);
			for(int j=0;j<abc.length();j++){
				char b = abc.charAt(j);
				if (a == b){
					fraseClave += abcClave.charAt(j);
				}
				else{
					if(a == ' '){
						fraseClave += ' ';
						break;
					}
				}
				
			}
		}
		
		System.out.println(fraseClave);
	}

}
