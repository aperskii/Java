class main
{
    
    public static void main()
    {
     int ch=0;
    agenda a = new agenda();
    while(ch!=4)
    {
    System.out.println("1- Ajouter une personne");
    System.out.println("2- Afficher tous les personne");
    System.out.println("3-Chercher une personne");
    System.out.println("4- Quitter");
    ch=Saisie.lire_int("");
    if(ch==1)
    {
        personne p = new personne();
        a.ajout(p);
    }
    if(ch==2)
    {
    a.affiche();
    }
    if(ch==3)
    {
    String no = Saisie.lire_String("Saisi le nom à chercher");
    a.recherche(no);
    }
   }
    }
}
