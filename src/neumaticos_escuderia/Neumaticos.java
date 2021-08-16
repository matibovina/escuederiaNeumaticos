package neumaticos_escuderia;

import java.util.Date;
public abstract class Neumaticos implements metodosEscuderia {

	protected String marca;
	protected String caducidad;
	protected int dureza;
	protected String color;
	protected TipoDibulo dibujoNeumatico;
	
	public Neumaticos(String marca, String caducidad, int dureza, String color, TipoDibulo dibujoNeumatico) {
		this.marca = marca;
		this.caducidad = caducidad;
		this.dureza = dureza;
		this.color = color;
		this.dibujoNeumatico = dibujoNeumatico;
	}

	public Neumaticos() {
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TipoDibulo getDibujoNeumatico() {
		return dibujoNeumatico;
	}

	public void setDibujoNeumatico(TipoDibulo dibujoNeumatico) {
		this.dibujoNeumatico = dibujoNeumatico;
	}

	public abstract void medirDurezaNeumaticos();

	@Override
	public String toString() {
		return "Neumaticos [marca=" + marca + ", caducidad=" + caducidad + ", dureza=" + dureza + ", color=" + color
				+ ", dibujoNeumatico=" + dibujoNeumatico + ",";
	}

}
