package fr.greta.java.vache;

public class Fut {

    public int volume;

    public VacheType type;

    public boolean estRempli() {
        return volume > 0 && type != null;
    }
}
