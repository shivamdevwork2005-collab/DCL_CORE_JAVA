package VedaApp;

import VedaApp.Upveda.Aayurveda;
import VedaApp.Upveda.Dhanurveda;
import VedaApp.Veda.AtharvVeda;
import VedaApp.Veda.RigVeda;
import VedaApp.Veda.SamVeda;
import VedaApp.Veda.YajurVeda;
import VedaApp.Vedangs.Siksha;

public class MainApp {
    public static void main(String[] args) {
        // veda
        RigVeda rig = new RigVeda();

        rig.showInfo();
        rig.category();
        rig.speciality();

        System.out.println("\n");

        SamVeda sam = new SamVeda();
        sam.showInfo();
        sam.category();
        sam.speciality();

        System.out.println("\n");

        YajurVeda yaj = new YajurVeda();
        yaj.showInfo();
        yaj.category();
        yaj.speciality();

        System.out.println("\n");

        AtharvVeda ath = new AtharvVeda();
        ath.showInfo();
        ath.category();
        ath.speciality();

        System.out.println("\n");

        // Vedanga
        Siksha sik = new Siksha();
        sik.showInfo();
        sik.speciality();

        System.out.println("\n");

        // Upveda
        Dhanurveda dhan = new Dhanurveda("Dhanurveda");
        dhan.showInfo();
        dhan.category();
        dhan.speciality();

        System.out.println("\n");

        Aayurveda aay = new Aayurveda();
        aay.showInfo();
        aay.category();
        aay.speciality();

    }
}
