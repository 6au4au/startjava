class Employee {
    private static long workersCounter = 0L;
    private long id;
    public String firstName;
    private String lastName;
    private int departmentNumber;
    private double paymentForMounth;

    public Employee(String firstName, String lastName, int departmentNumber, double paymentForMounth, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentNumber = departmentNumber;
        this.paymentForMounth = paymentForMounth;
        this.id = id;
    }

    public static void increaseWorkersCounter() {
        ++workersCounter;
    }

    public static long getWorkersCounter() {
        return workersCounter;
    }
}