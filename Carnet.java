	
public class Carnet {
	
	// ATRIBUTOS DE LA CLASE
	private String nombre;
	private Apellidos apellidos;
	private boolean sexo;
	private String nacionalidad;
	private Fecha fechaNacimiento;
	private String numPasaporte;
	private Fecha validez;
	private Nif nif;
	
	public Carnet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Carnet(String nombre, Apellidos apellidos, boolean sexo, String nacionalidad, Fecha fechaNacimiento,
			String numPasaporte, Fecha validez, Nif nif) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.numPasaporte = numPasaporte;
		this.validez = validez;
		this.nif = nif;
	}
	@Override
	public String toString() {
		return "Carnet [nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", nacionalidad="
				+ nacionalidad + ", fechaNacimiento=" + fechaNacimiento + ", numPasaporte=" + numPasaporte
				+ ", validez=" + validez + ", nif=" + nif + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Apellidos getApellidos() {
		return apellidos;
	}
	public void setApellidos(Apellidos apellidos) {
		this.apellidos = apellidos;
	}
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNumPasaporte() {
		return numPasaporte;
	}
	public void setNumPasaporte(String numPasaporte) {
		this.numPasaporte = numPasaporte;
	}
	public Fecha getValidez() {
		return validez;
	}
	public void setValidez(Fecha validez) {
		this.validez = validez;
	}
	public Nif getNif() {
		return nif;
	}
	public void setNif(Nif nif) {
		this.nif = nif;
	}

	
	
}
