package Part2.Topping;

import Part2.Hamburger.Hamburger;

public class SaladDecorator extends ToppingDecorator {
    SaladDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve() {
        return inner_hamburger.serve() + " with salad";
    }

}
