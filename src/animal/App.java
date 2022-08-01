package animal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Sasha";
        dog.age = 8;
        dog.foodLevel = 5;
        dog.spiritLevel = 9;
        dog.favFood = "Pedigree";
        dog.favActivity = "walk";

        Activity activity=new Activity();
        activity.name="play";

        Adopter adopter=new Adopter();
        adopter.name="Mary";
        adopter.budget=1500;

        Vet vet=new Vet();
        vet.name="John Peterson";
        vet.specialization="surgeon";

        AnimalFood animalFood=new AnimalFood();
        animalFood.name="processed food";
        animalFood.disponibility=true;
        animalFood.quantity=34;
        animalFood.expirationDate= LocalDateTime.of(2022, Month.AUGUST, 18, 18,18);

        System.out.println(animalFood.name);
        System.out.println(animalFood.disponibility);

    }
}