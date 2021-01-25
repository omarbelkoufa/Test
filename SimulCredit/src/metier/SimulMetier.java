package metier;

public class SimulMetier {
	public double fonctMensualite(double montant, int duree, double taux) {
		double prc = taux/100;
		double numerateur = (montant*prc)/12; 
		double denominateur = 1-Math.pow((1+(taux/12)), -1*duree);
		double m = numerateur/denominateur;
		return m;
	}
}
