import java.util.*;
class agenda
{
   private Vector <personne> vec;
   public agenda()
   {
   vec= new Vector<personne>(); 
   }
   public void ajout(personne p)
   {
    vec.add(p);
   }
   public void affiche()
    {
    for(int i =0 ; i<vec.size() ; i++)
    {
    personne p = vec.get(i);
    p.affiche();
    }
    }
    public void recherche(String no)
    {
    for ( int i= 0 ; i<vec.size() ; i++)
    {
        personne p = vec.get(i);
    if(no.equals(p.getn()))
    {
    System.out.println("La personne que vous cherchez est : ");
    p.affiche();
    }
    }
    }
}
