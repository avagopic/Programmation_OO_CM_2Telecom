package cours01;

public class Etudiant {

	private String nom ;
	private String prenom ;
	private int numero ;
	
	
	public Etudiant(String nom, String prenom, int numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
	}
	public Etudiant(){
		
	}


	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.nom = "Julien";
		et1.prenom = "Castiaux";
		et1.numero = 42;
		
		Etudiant et2 = new Etudiant();
		et2.nom = "Dupond";
		et2.prenom = "Jéremy";
		et2.numero = 3;
	}

	
	
	public String toString() {
		return "etudiant [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
