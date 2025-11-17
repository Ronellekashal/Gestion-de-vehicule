public class Moto extends Vehicule {

    private int cylindree;
    private String typeMoto;

    public Moto(int id, String marque, String modele, int annee, double kilometrage,
                String dictateur, String processeur,
                int cylindree, String typeMoto) {

        super(id, marque, modele, annee, kilometrage, dictateur, processeur);
        this.cylindree = cylindree;
        this.typeMoto = typeMoto;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Cylindrée: " + cylindree + " cc");
        System.out.println("Type de moto: " + typeMoto);
    }
}
