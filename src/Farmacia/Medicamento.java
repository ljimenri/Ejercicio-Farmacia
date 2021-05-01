package Farmacia;

public class Medicamento {

	// Atributos
	private String codigo;
	private int precioBase;
	private String nombre;
	private boolean generico;

	// Constructor no vacio
	public Medicamento(String codigo, int precioBase, String nombre, boolean generico) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.generico = generico;
	}

	// Constructor vacio
	public Medicamento() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

}
