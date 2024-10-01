public class CompteEntreprise extends CompteBancaire {


    private final double frais = 5.0;

    public CompteEntreprise(Double soldeInitial, String titulaire){
        super(soldeInitial, titulaire);
    }

    @Override
    public void retirer (double montant) {
        double totalRetrait = montant + frais;
        if( montant > 0 && totalRetrait  <= solde){
            solde -= totalRetrait;
            System.out.println(montant + " EUR retirés du compte entrerpise de " + titulaire + " avec des frais de " + frais + " EUR.");

        } else {

            System.out.println("Retrait impossible : solde insuffisant ou montant incorrect.");
        }

    }
}
