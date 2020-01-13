
public class Reloj {
	private Horario h;
	private Fecha f;
	private Musica m;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		result = prime * result + ((h == null) ? 0 : h.hashCode());
		result = prime * result + ((m == null) ? 0 : m.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		if (f == null) {
			if (other.f != null)
				return false;
		} else if (!f.equals(other.f))
			return false;
		if (h == null) {
			if (other.h != null)
				return false;
		} else if (!h.equals(other.h))
			return false;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		return true;
	}


	public Reloj() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reloj(Horario h, Fecha f) {
		super();
		this.h = h;
		this.f = f;
	}


	public Horario getH() {
		return h;
	}


	public void setH(Horario h) {
		this.h = h;
	}


	public Fecha getF() {
		return f;
	}


	public void setF(Fecha f) {
		this.f = f;
	}


	@Override
	public String toString() {
		return "Reloj [h=" + h + ", f=" + f + "]";
	}
	
	
}
