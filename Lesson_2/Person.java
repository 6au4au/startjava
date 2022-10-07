class Person {
    String name = "John";
    char gender = 'M';
    int age = 23;
    float weight = 88.6f;
    float height = 1.82f;
    int speed;
    double learningProgress;
    boolean movement;

    void stay() {
        System.out.println(name + ": - I'm waiting!");
        speed = 0;
        movement = false;
    }
    void move(double distanceInMeters) {
        movement = true;
        speed +=3;
        String movementType;
        if (speed <= 3) {
            movementType = "walked";
        } else {
            movementType = "runned";
        }
        for (double i = 0, j = (double) speed / 7; i <= distanceInMeters; i += j) {
            System.out.println(name + " " + movementType + " " + i + " meters.");
        }
        this.stay();
    }
    void run(double distanceInMeters) {
        movement = true;
        speed += 4;
        this.move(distanceInMeters);
        this.stay();
    }
    void jump() {
        System.out.println(name + " jumped up!");
        this.stay();
    }

    void say(String whtToSay) {
        System.out.println(name + ": - " + whtToSay);
    }
    void learningJava() {
        System.out.println(name + ": - I'm learning JAVA!");
    }
}