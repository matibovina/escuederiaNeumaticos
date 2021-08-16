package neumaticos_escuderia;

public class NeumaticoPista extends Neumaticos implements metodosEscuderia {

	private int adherencia;
	private int temperatura;

	public NeumaticoPista() {
		// TODO Auto-generated constructor stub
	}

	public NeumaticoPista(String marca, String caducidad, int dureza, String color, TipoDibulo dibujoNeumatico,
			int adherencia, int temperatura) {
		super(marca, caducidad, dureza, color, dibujoNeumatico);
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}

	public int getAdherencia() {
		return adherencia;
	}

	public void setAdherencia(int adherencia) {
		this.adherencia = adherencia;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public void imprimirMarcaCaducidad() {
		// TODO Auto-generated method stub
		System.out.println("La marca del neumatico es: " + marca + " y vence en " + caducidad + ".");

	}

	@Override
	public void medirDurezaNeumaticos() {

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
		return super.toString() + "adherencia=" + adherencia + ", temperatura=" + temperatura + "]"
				+ "\n-------------------------------------------------";
	}

}
