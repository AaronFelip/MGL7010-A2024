public class Main {

    public static void main(String[] args) {
        CompteCourant compteCourant = new CompteCourant( 500.00, "Alice" );
        CompteEpargne compteEpargne = new CompteEpargne( 300.00, "Bob" );
        CompteEntreprise compteEntreprise = new CompteEntreprise( 4000.00, "Charlie" );

        compteCourant.retirer( 100 );
        compteCourant.retirer( 150 );
        compteEntreprise.retirer( 200 );


        compteCourant.afficherSolde();
        compteEpargne.afficherSolde();
        compteEntreprise.afficherSolde();
    }
}

