class Wolf {
    String name;
    String animalColor;
    char gender;
    int age;
    float weight;
    int speed;
    boolean movement;

    void stay() {
        System.out.println(name + ": sits.");
        speed = 0;
        movement = false;
    }

    void move(float distanceInMeters) {
        movement = true;
        speed += 8;
        String movementType;
        if (speed <= 8) {
            movementType = "walked";
        } else {
            movementType = "runned";
        }
        float convert = (float) speed / 3.6f;
        for (float i = convert; i <= distanceInMeters; i += convert) {
            System.out.println(name + " " + movementType + " " + i + " meters.");
        }
        movement = false;
    }

    void run(float distanceInMeters) {
        movement = true;
        speed += 45;
        move(distanceInMeters);
    }

    void voice(int amountHowling) {
        for (; amountHowling > 0; amountHowling--) {
            System.out.println(name + ": howls");
        }
    }

    void hunt(float targetDistance) {
        System.out.println(name + ": hit the trail!");
        run(targetDistance);
        double huntResult = Math.random();
        if (huntResult <= 0.3) {
            System.out.println("The hunt failed!");
        } else {
            System.out.println("Successful hunt!");
            System.out.println(name + ": eats!");
        }
    }
}