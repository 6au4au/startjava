public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.animalColor = "White";
        wolf1.name = "Herald";
        wolf1.gender = 'M';
        wolf1.age = 10;
        wolf1.weight = 75.5f;

        System.out.println("WOLF SIMULATION");
        System.out.println(wolf1.name + " goes to observation point in 20m");
        wolf1.move(20.0f);
        wolf1.stay();
        wolf1.voice(2);
        //метод охоты вызывает из себя метод бега, потому я отдельно его не вызывал
        System.out.println("\n" + wolf1.name + ": detected hare 40m");
        wolf1.hunt(40.0f);
    }
}