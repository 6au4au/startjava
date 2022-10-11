class Jaeger {
    private String model;
    private String mark;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String model, String mark) {
        this(model, mark, 70.0f, 7.640f, 8, 4, 6);
    }

    public Jaeger(String model, String mark, float height, float weight) {
        this(model, mark, height, weight, 8, 4, 6);
    }

    public Jaeger(String model, String mark, float height, float weight, int speed, int strength, int armor) {
        this.model = model;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

        public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

        public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void drift() {
        System.out.println(model + ": Turn Drift Mode");
    }

    public void move() {
        System.out.println(model + ": Jaeger moved!");
    }

    public void attack() {
        System.out.println(model + ": Jaeger attacked!");
    }

    public void jump() {
        System.out.println(model + ": Jaeger jumped!");
    }
}