package cours01;

public class MainEtudiant {

	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.setNom ("Julien");
		et1.setPrenom ("Castiaux");
		et1.setNumero (42);
		System.out.println("Julien Castiaux 42");
				
		Etudiant et2 = new Etudiant();
		et2.setNom ("Dupond");
		et2.setPrenom ("Jéremy");
		et2.setNumero (3);
		System.out.println("Dupond Jéremy 3");
	}

}
