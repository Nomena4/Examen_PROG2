package utilisateur;

import java.time.LocalDate;

public class Utilisateur {
    private String id;
    private String nomUtilisateur;
    private String email;
    private LocalDate dateCreation;
    private TypeUtilisateur type;

    public Utilisateur(String id, String nomUtilisateur, String email, TypeUtilisateur type) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.type = type;
        this.dateCreation = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public TypeUtilisateur getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Utilisateur autre) {
            return this.id.equals(autre.id)
                    && this.nomUtilisateur.equals(autre.nomUtilisateur)
                    && this.email.equals(autre.email);
        }
        return false;
    }
}
