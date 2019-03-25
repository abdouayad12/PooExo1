
public class Etudiant {
	private int mat;
	private String nom,prenom,sp;
	private char sec;
	private float n1,n2;
	public Etudiant(int mat,String nom,String prenom,String sp,char sec, float n1,float n2)
	{
		this.mat=mat;
		this.nom=nom;
		this.prenom=prenom;
		this.sp=sp;
		this.sec=sec;
		this.n1=n1;
		this.n2=n2;
	}
 	public void afficher()
	{
		System.out.println( "le matricule est:"+mat+" le nom est: "+nom+" le prenom est: "
				+ prenom+" la spécialité est: "+sp+" la section est: "+sec+" la note N°1: "+n1+
				"la note N°2: "+n2);
	}
	public float moyenne()
	{
		return ((n1+n2)/2);
	}
   public void setsec(char sec)
   {
	   this.sec=sec;
   }
   public String getnom()
   {
	   return nom;
   }
   public void setNote1(float n1)
   {
	   this.n1=n1;
   }
   public void setNote2(float n2)
   {
	   this.n2=n2;
   }
}
