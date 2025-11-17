public class Main {

    public static void main(String[] args) {

        Vehicule v1 = new Voiture(
                1, "Toyota", "Corolla", 2020, 45000,
                "Congo", "Intel",
                4, "Essence"
        );

        Vehicule v2 = new Moto(
                2, "Yamaha", "R6", 2019, 22000,
                "Japon", "AMD",
                600, "Sport"
        );

        // Affichage des infos
        v1.afficherInfos();
        System.out.println("-------------------------");
        v2.afficherInfos();
        System.out.println("-------------------------");

        // Calcul de l'indice pour chaque véhicule (exemple simple : année / kilométrage)
        double indiceV1 = (double) v1.getAnnee() / v1.getKilometrage();
        double indiceV2 = (double) v2.getAnnee() / v2.getKilometrage();

        System.out.println("Indice de v1 : " + String.format("%.4f", indiceV1));
        System.out.println("Indice de v2 : " + String.format("%.4f", indiceV2));

        // Calcul de la moyenne du kilométrage des véhicules
        double moyenneKilometrage = (v1.getKilometrage() + v2.getKilometrage()) / 2.0;
        System.out.println("Moyenne du kilométrage : " + moyenneKilometrage);
    }
}
