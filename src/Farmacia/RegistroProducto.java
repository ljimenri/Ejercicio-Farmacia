package Farmacia;

import java.util.ArrayList;

public class RegistroProducto {

	// Atributos
	private ArrayList<MedicamentoFormulado> medicamentos;
	private ArrayList<Suplemento> suplementos;

	// Constructor vacio y no vacio
	public RegistroProducto() {
	}

	public RegistroProducto(ArrayList<MedicamentoFormulado> medicamentos, ArrayList<Suplemento> suplementos) {
		super();
		this.medicamentos = medicamentos;
		this.suplementos = suplementos;
	}

	// Getters and setters
	public ArrayList<MedicamentoFormulado> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<MedicamentoFormulado> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public ArrayList<Suplemento> getSuplementos() {
		return suplementos;
	}

	public void setSuplementos(ArrayList<Suplemento> suplementos) {
		this.suplementos = suplementos;
	}

}
