package OOPS.TypeCasting.GenralizationAndSpecialization;

import com.sun.source.doctree.TextTree;

public class App {
    static void main(String[] args) {
        Office o = new Office();

        Developer d = new Developer();
        o.hire(d);

        Hr h = new Hr();
        o.hire(h);

        Tester t = new Tester();
        o.hire(t);

//        Employee e = new Employee();
        o.hire(new Employee());
    }
}
