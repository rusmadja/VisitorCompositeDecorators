package Part2.Topping;

import Part2.Hamburger.Hamburger;

public class ChipsDecorator extends ToppingDecorator {
    ChipsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return inner_hamburger.serve() + " with chips";
    }
}
