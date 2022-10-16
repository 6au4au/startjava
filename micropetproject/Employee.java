class Employee {
    private static int workersCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int departmentNumber;
    private double paymentForMounth;

    public Employee(String firstName, String lastName, int departmentNumber, double paymentForMounth, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentNumber = departmentNumber;
        this.paymentForMounth = paymentForMounth;
        this.id = id;
    }

    public static void increaseWorkersCounter() {
        ++workersCounter;
    }

    public static int getWorkersCounter() {
        return workersCounter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getPaymentForMounth() {
        return paymentForMounth;
    }
}