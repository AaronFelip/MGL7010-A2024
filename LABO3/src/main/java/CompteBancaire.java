abstract public class CompteBancaire {

    protected double solde;
    protected String titulaire;

    public CompteBancaire( double solde, String titulaire ) {
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public void deposer( double montant ) {
        if ( montant > 0 ) {
            solde += montant;
            System.out.println( montant + " EUR déposé sur le compte de  " + titulaire );
        } else {
            System.out.println( "Le montant doit être positif." );
        }

    }
    public abstract void retirer(double montant);
    public void afficherSolde() {
        System.out.println("Solde du compte " + titulaire + " : " + solde + "EUR");
    }


}
