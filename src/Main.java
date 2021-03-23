import com.isi.controller.EtudiantImpl;
import com.isi.controller.IEtudiant;
import com.isi.entities.Etudiant;

public class Main {
    public static void main(String[] args) {
        IEtudiant ie = new EtudiantImpl();
        Etudiant etudiant = ie.saisie();
        ie.affichageLIAGE3(etudiant);
    }
}
