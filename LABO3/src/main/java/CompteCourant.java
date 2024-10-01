public class CompteCourant extends CompteBancaire{

        public CompteCourant(Double soldeInitial, String titulaire){
            super(soldeInitial, titulaire);
        }

        @Override
        public void retirer(double montant) {
            if (montant > 0 && montant <= solde ){
                solde -= montant;
                System.out.println(montant + " EUR retirées du compte courant de " + titulaire);


            } else {

                System.out.println("Retrait impossible: solde insuffisant ou montant incorrect");

            }

        }

}
