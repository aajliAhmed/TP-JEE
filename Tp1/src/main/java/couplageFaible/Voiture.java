package couplageFaible;

public class Voiture implements IVoiture{
    private IMoteur moteur;

    public void rouler(){
        moteur.demarrer();
        System.out.println("La voiture roule correctement!");

    }
    public void setMoteur(IMoteur m){
        this.moteur = m;
    }
}
