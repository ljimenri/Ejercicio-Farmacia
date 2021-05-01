package Farmacia;

public class MedicamentoFormulado extends Medicamento {

	// Atributos
	private String contradicciones;

	private boolean dia = false;

	// Constructor NO vacio
	public MedicamentoFormulado(String codigo, int precioBase, String nombre, boolean generico,
			String contradicciones) {
		super(codigo, precioBase, nombre, generico);
		this.contradicciones = contradicciones;

	}

	public int Descontar(String dia) {
		if (dia.equals("lunes")) {
			if (this.isGenerico()) {
				this.dia = true;
				double descuento = super.getPrecioBase() - (super.getPrecioBase() * 0.10);
				return ((int) descuento);
			}
		}

		return 0;

	}

	public String Caracteristicas() {

		String caracteristicas = "Codigo: " + this.getCodigo() + " Nombre: " + this.getNombre() + " PrecioBase: "
				+ this.getPrecioBase() + " Generico: " + this.isGenerico() + " Contradicciones: "
				+ this.getContradicciones();

		return caracteristicas;
	}

	public int Recargo() {

		if (!this.isGenerico()) {

			double recargo = super.getPrecioBase() + (super.getPrecioBase() * 0.20);

			return (int) recargo;
		}

		return 0;
	}

	public void Totalizar(int cantidad) {

		if (this.dia && this.isGenerico()) {

			double total = cantidad * this.Descontar("lunes");
			System.out.println("Su precio total es de: " + (int) total);
		}

		if (!this.isGenerico()) {

			double total = cantidad * this.Recargo();
			System.out.println("Su precio total es de: " + (int) total);

		}

	}

	// GETTERS AND SETTERS

	public String getContradicciones() {
		return contradicciones;
	}

	public void setContradicciones(String contradicciones) {
		this.contradicciones = contradicciones;
	}

}
