import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Nif {

	private int numero;
	private char letra;
	
	// String valor;

	

	public Nif() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nif(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}
	public Nif(int numero) {
		super();
		this.numero = numero;
		this.letra = NifLib.letraDNI(numero);
	}
	@Override
	public String toString() {
		return "Nif [numero=" + numero + ", letra=" + letra + "]";
	}
	
	public boolean esNifValido()
	{
		return NifLib.validarNif (this);
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}


}
