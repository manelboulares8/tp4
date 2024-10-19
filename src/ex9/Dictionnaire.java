package ex9;

public class Dictionnaire {
	private int nb_mots;
	private Mot_Dict[] Dict;
	private String nom;
	
	public Dictionnaire(int taille,String nom){
		this.nom=nom;
		this.nb_mots=0;
		this.Dict=new Mot_Dict[taille];
	}
	public void Trier() {
	    for (int i = 0; i < nb_mots - 1; i++) {
	        for (int j = 0; j < nb_mots - 1 - i; j++) {
	            if (Dict[j].getMot().compareTo(Dict[j + 1].getMot()) > 0) {
	                Mot_Dict temp = Dict[j];
	                Dict[j] = Dict[j + 1];
	                Dict[j + 1] = temp;
	            }
	        }
	    }
	}
	public void Ajouter_Mot(Mot_Dict mot) {
       /* if (nb_mots == Dict.length) {
            System.out.println("Le dictionnaire est plein");
            return;
        }
        int index = 0;
        while (index < nb_mots && Dict[index].getMot().compareTo(mot.getMot()) < 0) {
            index++;
        }

        for (int i = nb_mots; i > index; i--) {
            Dict[i] = Dict[i - 1];
        }
        Dict[index] = mot;
        nb_mots++; */
		if(nb_mots<Dict.length) {
			Dict[nb_mots]=mot;
			nb_mots++;
		}else {
			System.out.println("Le dictionnaire est plein ");
		}
		Trier();
		
		
    }
	
	public void Supprimer_Mot(Mot_Dict mot) {
	    int index = -1;
	    
	    for (int i = 0; i < nb_mots; i++) {
	        if (Dict[i].getMot().equalsIgnoreCase(mot.getMot())) {
	            index = i;
	            break; 
	        }
	    }
	    if (index == -1) {
	        System.out.println("Mot non trouvé dans le dictionnaire");
	        return;
	    }
	    for (int i = index; i < nb_mots - 1; i++) {
	        Dict[i] = Dict[i + 1]; 
	    }
	    nb_mots--;
	}
	public String Recherche_dicho(String mot) {
	    int debut = 0;
	    int fin = nb_mots - 1;
	    mot = mot.toLowerCase();

	    while (debut <= fin) {
	        int milieu = (debut + fin) / 2;
	        String motMilieu = Dict[milieu].getMot().toLowerCase();
	        int comparaison = mot.compareTo(motMilieu);

	        if (comparaison == 0) {
	            System.out.println("Définition du mot cherché : " + Dict[milieu].getDefinition());
	            return Dict[milieu].getDefinition();
	        } else if (comparaison < 0) {
	            fin = milieu - 1;
	        } else {
	            debut = milieu + 1;
	        }
	       
	    }
	    return "Mot non trouvé dans le dictionnaire.";
	}
	public void Lister_dictionnaire() {
	    if (nb_mots == 0) {
	        System.out.println("Le dictionnaire est vide.");
	    } else {
	        System.out.println("Contenu du dictionnaire :");
	        for (int i = 0; i < nb_mots; i++) {
	            System.out.println("Mot : " + Dict[i].getMot() + ", Définition : " + Dict[i].getDefinition());
	        }
	    }
	}
	public int Nombre_synonyme(Mot_Dict mot) {
	    int nbSynonymes = 0;
	    
	    for (int i = 0; i < nb_mots; i++) {
	        if (mot.synonyme(Dict[i].getDefinition())) {
	            nbSynonymes++;
	        }
	    }
	    
	    return nbSynonymes;
	}


	

}
