package ex9;

import java.util.Scanner;

public class test {
	public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Mot_Dict mot=new Mot_Dict("beau","joli");
        //System.out.println(mot);
        Mot_Dict mot2=new Mot_Dict("magnifique","joli");
        /*if (mot.synonyme(mot2) ){
        	System.out.println("les deux mots sont synonymes");
        }
        if (mot.synonyme(mot2.getDefinition()) ){
        	System.out.println("les deux mots sont synonymes");
        }*/
        Mot_Dict mot3 =new Mot_Dict("heureux","happy");
        
        Mot_Dict mot4 =new Mot_Dict("joyeux","happy");
        Mot_Dict mot5=new Mot_Dict("moche","pas joli");
        Dictionnaire D =new Dictionnaire(8,"Dict");
        D.Ajouter_Mot(mot4);
        D.Ajouter_Mot(mot3);
        D.Ajouter_Mot(mot2);
        D.Ajouter_Mot(mot5);
       // D.Trier();
        D.Lister_dictionnaire();
        System.out.println("Donner le mot à chercher :");
        String motR=scanner.nextLine();
        D.Recherche_dicho(motR);
        D.Supprimer_Mot(mot2);
        //Suppression du mot2
        System.out.println("Le dictionnaire aprés la suppression du mot 2");
        
        D.Lister_dictionnaire();
        System.out.println("le nombre de synonyme du mot "+mot3.getMot()+ " est :" +D.Nombre_synonyme(mot3));
	}
	
}
