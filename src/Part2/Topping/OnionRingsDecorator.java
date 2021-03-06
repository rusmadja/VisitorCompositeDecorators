package Part2.Topping;

import Part2.Hamburger.Hamburger;

public class OnionRingsDecorator extends ToppingDecorator {
    OnionRingsDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return inner_hamburger.serve() + " with onion rings";
    }
}
