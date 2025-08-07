package publication;

import utilisateur.TypeUtilisateur;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String contenu;
    private Utilisateur auteur;
    private List<Commentaire> commentaires;

    public Publication(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
        this.commentaires = new ArrayList<>();
    }

    public void ajouterCommentaire(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public boolean supprimerCommentaire(Commentaire commentaire, Utilisateur utilisateur) {
        if (utilisateur.getType() == TypeUtilisateur.MODERATEUR
                || utilisateur.getType() == TypeUtilisateur.ADMINISTRATEUR) {
            return commentaires.remove(commentaire);
        }
        return false;
    }

    public String getContenu() {
        return contenu;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }
}


