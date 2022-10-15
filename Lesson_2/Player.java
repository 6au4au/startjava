class Player {
    private String name;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println(name.toUpperCase() + " ERROR: Число не можеть быть меньше 1!");
            number = 0;
        } else {
            this.number = number;
        }
    }
}