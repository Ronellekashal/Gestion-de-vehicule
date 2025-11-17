public abstract class Vehicule {

    private int id;
    private String marque;
    private String modele;
    private int annee;
    private double kilometrage;

    // Attributs demandés
    private String dictateur;
    private String processeur;

    public Vehicule(int id, String marque, String modele, int annee, double kilometrage,
                    String dictateur, String processeur) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.dictateur = dictateur;
        this.processeur = processeur;
    }

    // Getters / Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }

    public double getKilometrage() { return kilometrage; }
    public void setKilometrage(double kilometrage) { this.kilometrage = kilometrage; }

    public String getDictateur() { return dictateur; }
    public void setDictateur(String dictateur) { this.dictateur = dictateur; }

    public String getProcesseur() { return processeur; }
    public void setProcesseur(String processeur) { this.processeur = processeur; }

    // Méthode d'affichage commune
    public void afficherInfos() {
        System.out.println("ID: " + id);
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Année: " + annee);
        System.out.println("Kilométrage: " + kilometrage + " km");
        System.out.println("Dictateur: " + dictateur);
        System.out.println("Processeur: " + processeur);
    }
}
