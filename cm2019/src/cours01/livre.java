package cours01;

public class livre {
	private String auteur;
	private String titre;
	private int nbrPage;

		
	public livre(String auteur, String titre, int nbrPage) {  //click droit generate....
	
		this.auteur = auteur;
		this.titre = titre;
		this.nbrPage = nbrPage;
	}

	public static void main(String[] args) {
		livre L1 = new livre ();
		L1.auteur = "proust";
		L1.nbrPage = 1800;
		L1.titre = "A la recherche du temps perdu"
				
		livre L2 = new livre();
		L2.auteur = "GeorgeMartin";
		L2.nbrPage = 1900;
		L2.titre = "leTroneDeFer";
				
	}
	

	public String toString() {
		return "livre [auteur=" + auteur + ", titre=" + titre + ", nbrPage=" + nbrPage + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbrPage() {
		return nbrPage;
	}

	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}

}

