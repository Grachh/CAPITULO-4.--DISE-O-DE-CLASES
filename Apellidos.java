
public class Apellidos {

	private String apellido1;
	private String apellido2;
	
	
	public Apellidos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apellidos(String apellido1, String apellido2) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	@Override
	public String toString() {
		return "Apellidos [apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	
}
