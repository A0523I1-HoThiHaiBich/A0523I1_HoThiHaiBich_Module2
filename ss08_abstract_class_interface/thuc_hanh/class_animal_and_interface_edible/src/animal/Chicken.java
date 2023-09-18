package animal;

import iedible.Editble;

public class Chicken extends Animal implements Editble {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck.";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}
