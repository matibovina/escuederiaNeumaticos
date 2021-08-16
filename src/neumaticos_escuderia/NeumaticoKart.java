package neumaticos_escuderia;

public class NeumaticoKart extends Neumaticos implements metodosEscuderia {

	private int llanta;

	public NeumaticoKart() {
		// TODO Auto-generated constructor stub
	}

	public NeumaticoKart(String marca, String caducidad, int dureza, String color, TipoDibulo dibujoNeumatico,
			int llanta) {
		super(marca, caducidad, dureza, color, dibujoNeumatico);
		this.llanta = llanta;
	}

	/**
	 * @return the llanta
	 */
	public int getLlanta() {
		return llanta;
	}

	/**
	 * @param llanta the llanta to set
	 */
	public void setLlanta(int llanta) {
		this.llanta = llanta;
	}

	@Override
	public void imprimirMarcaCaducidad() {
		// TODO Auto-generated method stub
		System.out.println("La marca del neumatico es: " + marca + " y vence en " + caducidad + ".");
	}

	@Override
	public void medirDurezaNeumaticos() {
		// TODO Auto-generated method stub
		if (dureza < 10) {
			System.out.println("La dureza del neumatico es BLANDA");
		} else if (dureza > 9 && dureza < 50) {
			System.out.println("La dureza del neumatico es MEDIA");
		} else {
			System.out.println("La dureza del neumatico es DURA");
		}
	}

	@Override
	public String toString() {
		return super.toString() + "llanta=" + llanta + "]" + "\n-------------------------------------------------";
	}

}
