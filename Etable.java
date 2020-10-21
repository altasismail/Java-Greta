package fr.greta.java.vache;

public class Etable {

    private static final int MAX_VOLUME_FUT = 50;

    private Fut[]  futs = new Fut[3];

    public void rentrerVache(Vache[] vaches) {
        //initFuts();
        //TODO

    }

    public void initFuts() {
        for(int i = 0; i < futs.length; i++) {
            futs[i] = new Fut();
        }
    }

    public void afficherEtatFuts() {
        for(Fut eachFut : futs) {
            if(eachFut.estRempli()) {
                System.out.println("Fut: " + eachFut.type + " - Volume: " + eachFut.volume);
            }
        }
    }

    public Fromage[] fabriquerFromage() {
        //TODO
        return null;
    }

}
