package animal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        Adopter adopter=new Adopter();
        adopter.setName("Mary");
        adopter.setBudget(1500);

        Vet vet=new Vet();
        vet.setName("John Peterson");
        vet.setSpecialization("surgeon");

        AnimalFood animalFood=new AnimalFood();
        animalFood.setName("processed food");
        animalFood.setDisponibility(true);
        animalFood.setQuantity(34);
        animalFood.setExpirationDate(LocalDateTime.of(2022, Month.AUGUST, 18, 18,18));

        //System.out.println("The animal is");
        System.out.println("The animal prefers to eat " + animalFood.getName());
        System.out.println("The food is/is not available " + animalFood.isDisponibility());
        System.out.println(adopter);

        //Inheritance
        Dog dog=new Dog();
        dog.setWaggingTheTail(true);
        dog.canBark();
        System.out.println("The dog is wagging the tail:" + dog.isWaggingTheTail());
        dog.setRace("Pomeranian");
        System.out.println("Race: " + dog.getRace());


        Duck duck=new Duck();
        duck.setName("Ratusca cea urata");
        System.out.println(duck.getName());
        duck.setWingspan(9);
        System.out.println("The wingspan is " + duck.getWingspan() + " cm ");
        System.out.println("Can fly: " + duck.isCanFly());

        Cat cat=new Cat();
        cat.setCanMeow(true);
        System.out.println("The cat can meow: " + cat.isCanMeow());

        //override

        System.out.println(dog.speak());
        System.out.println(duck.speak());
        System.out.println(cat.speak());

        System.out.println("The dog can live " + dog.lifeSpan() + " years");
        System.out.println("The cat can live " + cat.lifeSpan() +" years");
        System.out.println("The duck can live " + duck.lifeSpan() + " years");

        System.out.println("The dog can crawl: "+ dog.canCrawl());
        System.out.println("The cat cat crawl: "+ cat.canCrawl());
        System.out.println("The duck can crawl:" + duck.canCrawl());
    }

}