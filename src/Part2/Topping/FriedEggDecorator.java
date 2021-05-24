package Part2.Topping;
import Part2.Hamburger.Hamburger;

public class FriedEggDecorator extends ToppingDecorator {
    public FriedEggDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve() {
        return null;
    }
}
