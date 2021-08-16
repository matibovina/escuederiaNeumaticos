package neumaticos_escuderia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NeumaticoPista pista1 = new NeumaticoPista("Dunlop", "23-05-2022", 40, "negro", TipoDibulo.INTERMEDIO, 30, 80);

		NeumaticoRally rally1 = new NeumaticoRally("Michelin", "30-12-2025", 8, "negro con dorado", TipoDibulo.SECO,
				23.5f, 1);
		NeumaticoKart kart1 = new NeumaticoKart("Firestone", "12-12-2021", 8, "negro con rojo", TipoDibulo.SECO, 7);
		Neumaticos p1 = new NeumaticoKart("Ferrari", "22-02-2023", 60, "blanco con negro", TipoDibulo.MOJADO, 9); // Poliformismo

		// Llamando metodos de Neumaticos de Pista
		pista1.medirDurezaNeumaticos();
		pista1.imprimirMarcaCaducidad();
		System.out.println(pista1.toString());
		// Llamando metodos de Neuamticos de Rally
		rally1.medirDurezaNeumaticos();
		rally1.imprimirMarcaCaducidad();
		System.out.println(rally1.toString());
		// Llamando metodos de Neumaticos de Kart
		kart1.medirDurezaNeumaticos();
		kart1.imprimirMarcaCaducidad();
		System.out.println(kart1.toString());
		// Llamando metodos de instancia polimorfica
		p1.medirDurezaNeumaticos();
		p1.imprimirMarcaCaducidad();
		System.out.println(p1.toString());
		if (p1 instanceof NeumaticoKart) {
			System.out.println("----Es una instancia de neumaticos para competencia de Kart---\n");
		} else {
			System.out.println("---No es neumatico para competencia de Kart---\n");
		}

	}

}
