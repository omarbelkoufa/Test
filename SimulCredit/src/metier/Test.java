package metier;

public class Test {

	public static void main(String[] args) {
		SimulMetier sm = new SimulMetier();
		double res = sm.fonctMensualite(200000, 240, 4.5);
		System.out.println(res);
	}

}
