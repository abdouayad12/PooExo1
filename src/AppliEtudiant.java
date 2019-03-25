
public class AppliEtudiant {
	public static void main(String[] args) {
	    Etudiant et1=new Etudiant(51542016, "Azi", "Amine","ACAD", 'B',0,0);
		Etudiant et2=new Etudiant(51552016, "Ziane","Fatiha", "ISIL", 'B',0,0);
		et1.setsec('A');
		et1.setNote1(15);
		et1.setNote2(14);
		et2.setNote1(10);
		et2.setNote2(11);
		System.out.println("la moyenne de AZI est:"+et1.moyenne());
		System.out.println("la moyenne de FATIHA est:"+et2.moyenne());
		et1.afficher();
		et2.afficher();
		et2=et1;
		et2.afficher();
		et2=null;
		et2.afficher();
	}

}
