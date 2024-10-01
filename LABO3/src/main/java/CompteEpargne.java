public class CompteEpargne extends CompteBancaire{

    private final double seuil = 100.0;

    public CompteEpargne(Double soldeInitial, String titulaire){
        super(soldeInitial, titulaire);
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && (solde - montant) >= seuil ){
            solde -= montant;
            System.out.println(montant + " EUR retirées du compte courant de " + titulaire);

        } else {
            System.out.println("Retrait impossible: solde insuffisant ou montant incorrect");
        }

    }

}
