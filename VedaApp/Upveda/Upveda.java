package VedaApp.Upveda;

import VedaApp.VedicText.VedicText;

public class Upveda extends VedicText {

    public Upveda(String name){
        super(name);
    }

    public void category() {
        System.out.println(name + " belongs to Upaveda.");
    }

}
