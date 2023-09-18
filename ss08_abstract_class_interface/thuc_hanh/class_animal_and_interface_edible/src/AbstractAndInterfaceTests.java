import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import iedible.Editble;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        Fruit[] fruit= new Fruit[2];
        fruit[0]= new Apple();
        fruit[1]=new Orange();
        for( Animal animal:animals){
            System.out.println(animal.makeSound());
            if( animal instanceof Chicken){
                Editble editbler=  (Chicken) animal;
                System.out.println(editbler.howtoEat());
            }
        }
        for( Fruit fruit1:fruit){
            System.out.println(fruit1.howtoEat());

        }
    }
}
