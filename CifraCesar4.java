package modelo;

public class CifraCesar4 extends CifraCesar {

	public String criptografar(String texto) {
		//percorrer
		for(int i=0; i<texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		
		return texto;
	}

	public String descriptografar(String texto) {
		
		return texto;
	}
}
