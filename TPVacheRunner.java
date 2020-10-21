package fr.greta.java.vache;

public class TPVacheRunner {

    public static void main(String[] arg) {

        Vache vache0 = new Vache();
        vache0.lait = 20;
        vache0.type = VacheType.NORMANDE;

        Vache vache1 = new Vache();
        vache1.lait = 10;
        vache1.type = VacheType.JERSAISE;

        Vache vache2 = new Vache();
        vache2.lait = 30;
        vache2.type = VacheType.NORMANDE;

        Vache vache3 = new Vache();
        vache3.lait = 20;
        vache3.type = VacheType.HOSLTEIN;

        Vache vache4 = new Vache();
        vache4.lait = 50;
        vache4.type = VacheType.HOSLTEIN;

        Vache[] vaches = new Vache[5];
        vaches[0] = vache0;
        vaches[1] = vache1;
        vaches[2] = vache2;
        vaches[3] = vache3;
        vaches[4] = vache4;

        Etable etable = new Etable();
        etable.initFuts();
        etable.rentrerVache(vaches);
        etable.afficherEtatFuts();
    }


}
