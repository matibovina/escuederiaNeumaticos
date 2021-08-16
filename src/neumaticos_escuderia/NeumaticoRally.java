package neumaticos_escuderia;

public class NeumaticoRally extends Neumaticos implements metodosEscuderia {

	private float presion;
	private int profundidadDibujo;

	public NeumaticoRally(String marca, String caducidad, int dureza, String color, TipoDibulo dibujoNeumatico,
			float presion, int profundidadDibujo) {
		super(marca, caducidad, dureza, color, dibujoNeumatico);
		this.presion = presion;
		this.profundidadDibujo = profundidadDibujo;
	}

	public float getPresion() {
		return presion;
	}

	public void setPresion(float presion) {
		this.presion = presion;
	}

	public int getProfundidadDibujo() {
		return profundidadDibujo;
	}

	public void setProfundidadDibujo(int profundidadDibujo) {
		this.profundidadDibujo = profundidadDibujo;
	}

	public NeumaticoRally() {
		// TODO Auto-generated constructor stub
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
		return super.toString() + "presion=" + presion + ", profundidadDibujo=" + profundidadDibujo + "]"
				+ "\n-------------------------------------------------";
	}

}
