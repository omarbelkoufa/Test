package architecture;

public class ModelSimul {
	private double montant;
	private int duree;
	private double taux;
	private double mensualite;
	public ModelSimul() {
		super();
	}
	public ModelSimul(double montant, int duree, double taux, double mensualite) {
		super();
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
		this.mensualite = mensualite;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getMensualite() {
		return mensualite;
	}
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}
	
}
