
public class Cesar {

	private static final String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	private static final int[] POS = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
	
	private String frase,abcClave,fraseClave;
	int a,b;
	
	public Cesar(String frase, int a, int b){
		
	this.frase = frase.toUpperCase();
	this.abcClave = "";
	this.fraseClave = "";
	this.a = a;
	this.b = b;
	this.fraseClave = encriptar();
	
	}
	
	private String encriptar(){
		
		this.abcClave = creaAbecedarioClave();
		StringBuilder s = new StringBuilder("");
		//Encriptamos la frase
		for (int i = 0; i < this.frase.length(); i++) {
			for (int j = 0; j < ABC.length(); j++) {
				if(this.frase.charAt(i) == ABC.charAt(j)){
					s.insert(i, this.abcClave.charAt(j));
				}
				if(this.frase.charAt(i) == ' '){
					s.insert(i, ' ');
				}
			}
		}
		System.out.println("frase clave: "+s);
		return s.toString();
	}
	
	private String desencriptar(){
		
		this.abcClave = creaAbecedarioClave();
		//Desencriptamos la frase
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < this.fraseClave.length(); i++) {
			for (int j = 0; j < this.abcClave.length(); j++) {
				if(this.fraseClave.charAt(i) == this.abcClave.charAt(j)){
					s.insert(i, ABC.charAt(j));
				}
				if(this.fraseClave.charAt(i) == ' '){
					s.insert(i, ' ');
				}
			}
		}
		return s.toString();
	}
	
	private String creaAbecedarioClave(){
		
		StringBuilder abecedario = new StringBuilder(this.abcClave);
		//Creamos nuevo abecedario
		for (int i = 0; i < ABC.length(); i++) {
			int c = (this.a*i + this.b) % 27;
			abecedario.insert(i, ABC.charAt(POS[c]));
		}
		return abecedario.toString();
	}
}
