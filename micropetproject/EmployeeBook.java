class EmployeeBook {

    private Employee[] employeeBook = new Employee[10];
    private int[] rewritePull = new int[10];
    private int rewriteQueue;

    public void createUser(String firstName, String lastName, int departmentNumber, double paymentForMounth) {
        if (checkRewritePull()) {
            for (int i = 0; i <= employeeBook.length - 1; i++) {
                if (employeeBook[i] == null) {
                    Employee.increaseWorkersCounter();
                    employeeBook[i] = new Employee(firstName, lastName, departmentNumber, paymentForMounth,
                            Employee.getWorkersCounter());
                    break;
                }
            }
        } else {
            employeeBook[rewriteQueue] = new Employee(firstName, lastName, departmentNumber,
                    paymentForMounth, rewriteQueue);
            rewritePull[rewriteQueue] = 0;
            rewriteQueue = 0;
        }
    }

    private boolean checkRewritePull() {
        for (int i : rewritePull) {
            if (i != 0) {
                rewriteQueue = i;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.createUser("TEST", " ", 1, 3000.0);
        System.out.println(book.employeeBook[0].firstName);
    }
}