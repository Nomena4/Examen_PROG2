package groupe;

import publication.Publication;
import utilisateur.TypeUtilisateur;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Groupe {
    private String nom;
    private Utilisateur administrateur;
    private List<Utilisateur> membres;
    private List<Publication> publications;

    public Groupe(String nom, Utilisateur administrateur) {
        this.nom = nom;
        this.administrateur = administrateur;
        this.membres = new ArrayList<>();
        this.publications = new ArrayList<>();
        this.membres.add(administrateur); // l’admin est aussi membre
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        membres.add(utilisateur);
    }

    public boolean supprimerUtilisateur(Utilisateur cible, Utilisateur par) {
        if (par.getType() == TypeUtilisateur.ADMINISTRATEUR) {
            return membres.remove(cible);
        }
        return false;
    }

    public void ajouterPublication(Publication publication) {
        publications.add(publication);
    }

    public boolean supprimerPublication(Publication publication, Utilisateur utilisateur) {
        if (utilisateur.getType() == TypeUtilisateur.MODERATEUR
                || utilisateur.getType() == TypeUtilisateur.ADMINISTRATEUR) {
            return publications.remove(publication);
        }
        return false;
    }

    public boolean contientMembre(Utilisateur utilisateur) {
        return membres.contains(utilisateur);
    }

    public List<Publication> rechercherPublications(String motCle) {
        List<Publication> resultats = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.getContenu().toLowerCase(Locale.ROOT)
                    .contains(motCle.toLowerCase())) {
                resultats.add(publication);
            }
        }
        return resultats;
    }

    public int compterPublications() {
        return publications.size();
    }
}


