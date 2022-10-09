public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setName("Herald");
        wolf1.setAnimalColor("White");
        wolf1.setGender('M');
        wolf1.setAge(8);
        wolf1.setWeight(45.5f);

        System.out.println("WOLF CREATED INFO: ");
        System.out.println("Name: " + wolf1.getName() + "\nGender: " + wolf1.getGender() + "\nAnimal Color: " 
                + wolf1.getAnimalColor() + "\nAnimal Age: " + wolf1.getAge() + "\nAnimal Weight: " 
                + wolf1.getWeight());
        
        System.out.println("\nWOLF SIMULATION");
        System.out.println(wolf1.getName() + " goes to observation point in 20m");
        wolf1.move(20.0f);
        wolf1.stay();
        wolf1.voice(2);
        //метод охоты вызывает из себя метод бега, потому я отдельно его не вызывал
        System.out.println("\n" + wolf1.getName() + ": detected hare 40m");
        wolf1.hunt(40.0f);
    }
}