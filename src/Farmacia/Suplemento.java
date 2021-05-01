package Farmacia;

public class Suplemento extends Medicamento {
	private int cantidadVitaminas;
	private String[] informacionVitaminas;

	public void recargar() {
		if (this.getCantidadVitaminas() > 0) {

			// int a = (int) this.getPrecioBase() + (this.getCantidadVitaminas() * 0.02);
			// this.setPrecioBase(13);

		}
	}

	public Suplemento() {
	}

	public Suplemento(String codigo, int precioBase, String nombre, boolean generico, int cantidadVitaminas,
			String[] informacionVitaminas) {
		super(codigo, precioBase, nombre, generico);
		this.cantidadVitaminas = cantidadVitaminas;
		this.informacionVitaminas = informacionVitaminas;
	}

	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}

	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}

	public String[] getInformacionVitaminas() {
		return informacionVitaminas;
	}

	public void setInformacionVitaminas(String[] informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}

}
