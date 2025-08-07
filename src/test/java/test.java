import groupe.Groupe;
import org.junit.jupiter.api.Test;
import publication.Publication;
import utilisateur.Utilisateur;

import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest {

    @Test
    public void testCreationPublication() {
        Utilisateur u = new Utilisateur("1", "maria", "maria@mail.com", TypeUtilisateur.STANDARD);
        Groupe g = new Groupe("Informatique", u);
        Publication p = new Publication("Bienvenue dans le groupe", u);
        g.ajouterPublication(p);
        assertEquals(1, g.compterPublications());
    }
