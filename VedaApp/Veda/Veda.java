package VedaApp.Veda;

import VedaApp.VedicText.VedicText;

public class Veda extends VedicText {
    public Veda(String name) {
        super(name);
    }

    public void category() {
        System.out.println(name + " belongs to Veda.");
    }

}
