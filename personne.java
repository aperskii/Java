class personne
{
   private String nom;
   private int num;
   private int age;
  public personne()
  {
    nom=Saisie.lire_String("Le nom");
    num=Saisie.lire_int("Numéro");
    age=Saisie.lire_int("L'age");
  }
   public void affiche()
  {
   System.out.println("Le nom : "+nom);
   System.out.println("Le numéro : "+num);
   System.out.println("L'age : "+age);
  }
  public String getn()
  {
  return(nom);  
  }
}
