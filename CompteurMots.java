import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurMots {
    public static void main(String[] args) {
        // Lecture du fichier
        File fichier = new File("monTexte.txt");
        int totalMots = 0;

        try {
            Scanner lecteur = new Scanner(fichier);

            // Boucle de lecture
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // Séparation avec l'espace comme délimiteur
                String[] mots = ligne.split(" ");

                // Ajout de la longueur du tableau
                totalMots += mots.length;
            }

            lecteur.close();
            // Affichage du résultat
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé.");
        }
    }
}