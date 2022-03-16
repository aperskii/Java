
/**
 * Write a description of class Saisie here.
 * 
 * @author (Guerouate fatima) 
 * @version (version 1 le 16/4/2011 )
 */

import java.io.*;

public class Saisie
{
    
// une methode pour la lecture du String   

 public static String lire_String(String question)
    {
       String ligne_lue=null;
       try{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(a);

//saisie du String
System.out.println(question );
ligne_lue=br.readLine(); }
catch(RuntimeException e){System.out.println("erreur");}
catch(IOException e){System.out.println(e);} 
return ligne_lue;
   }

//une methode pour la saisie des entiers
 public static int lire_int(String question)
{return Integer.parseInt(lire_String(question));}

// une methode pour la saisie des Doubles
 public static double lire_double(String question)
{
return Double.parseDouble(lire_String(question));}

    }

    