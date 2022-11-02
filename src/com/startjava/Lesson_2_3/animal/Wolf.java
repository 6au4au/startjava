package com.startjava.lesson_2_3.animal;

class Wolf {
    private String name;
    private String animalColor;
    private char gender;
    private int age;
    private float weight;
    private int speed;
    private boolean movement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() >= 2) {
            this.name = name.trim();
        } else {
            System.out.println("Err: The name of the wolf cannot be shorter than 2 characters or contain spaces!"); 
        }
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        switch (animalColor.trim().toLowerCase()) {
            case "grey":
            case "brown":
            case "white":
                this.animalColor = animalColor.trim().toLowerCase();
                break;
            default:
                System.out.println("Err: not valid wolf color, List:\n grey, brown, white!");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Err: wolf can only be 'M'ale or 'F'emale gender!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 8 || age > 0) {
            this.age = age;
        } else {
            System.out.println("Err: new wolf cannot be older than 8 years, and under 1 year old!");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight >= 22.0f || weight <= 70.0f) {
            this.weight = weight;
        } else {
            System.out.println("Err: a wolf cannot weigh less than 22 kg or more than 70 kg!");
        }
    }

    public int getSpeed() {
        return speed;
    }
    // этот сеттер под большим вопросом но в зависимости от факторов в моей симуляции
    // скорость волка также может изменятся потому я его сделал.
    public void setSpeed(int speed) {
        if (speed >= 0 || speed <= 53) {
            this.speed = speed;
        } else {
            System.out.println("Err: Wolf speed cannot be less than 0 and more than 53 (km/h)!");
        }
    }
    //в пару этому геттеру сеттер не нужен так-как изменения состояния прописано в методах.
    public boolean movement() {
        return movement;
    }

    public void stay() {
        System.out.println(name + ": sits.");
        speed = 0;
        movement = false;
    }

    public void move(float distanceInMeters) {
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

    public void run(float distanceInMeters) {
        movement = true;
        speed += 45;
        move(distanceInMeters);
    }

    public void voice(int amountHowling) {
        for (; amountHowling > 0; amountHowling--) {
            System.out.println(name + ": howls");
        }
    }

    public void hunt(float targetDistance) {
        System.out.println(name + ": hit the trail!");
        run(targetDistance);
        System.out.println(name + ": attacked!");
        double huntResult = Math.random();
        if (huntResult <= 0.3) {
            System.out.println("The hunt failed!");
        } else {
            System.out.println("Successful hunt!");
            System.out.println(name + ": eats!");
        }
    }
}