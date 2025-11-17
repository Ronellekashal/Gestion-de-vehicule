public class Velo extends Vehicule {

    private String typeVelo;
    private boolean estElectrique;

    public Velo(int id, String marque, String modele, int annee, double kilometrage,
                String dictateur, String processeur,
                String typeVelo, boolean estElectrique) {

        super(id, marque, modele, annee, kilometrage, dictateur, processeur);
        this.typeVelo = typeVelo;
        this.estElectrique = estElectrique;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Type de vélo: " + typeVelo);
        System.out.println("Électrique: " + (estElectrique ? "Oui" : "Non"));
    }
}
