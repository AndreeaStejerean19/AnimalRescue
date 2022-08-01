package animal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Sasha");
        dog.setAge(8);
        dog.setFoodLevel(5);
        dog.setSpiritLevel(9);
        dog.setFavFood("Pedigree");
        dog.setFavActivity("walk");

        Activity activity=new Activity();
        activity.setName("play");

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

    }
}