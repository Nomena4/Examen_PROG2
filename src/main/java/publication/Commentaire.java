package publication;

import utilisateur.Utilisateur;

public class Commentaire {
    private String contenu;
    private Utilisateur auteur;

    public Commentaire(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}

