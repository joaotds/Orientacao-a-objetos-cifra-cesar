package modelo;

public abstract class CifraCesar {

	protected String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public abstract String criptografar(String texto);
	
	public abstract String descriptografar(String texto);
}
