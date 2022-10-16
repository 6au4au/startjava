class EmployeeBook {

    private Employee[] bookArr = new Employee[10];
    private int[] rewritePull = new int[10];
    private int rewriteQueue;

    public void createUser(String firstName, String lastName, int departmentNumber, double paymentForMounth) {
        if (checkRewritePull()) {
            for (int i = 0; i <= bookArr.length - 1; i++) {
                if (bookArr[i] == null) {
                    Employee.increaseWorkersCounter();
                    bookArr[i] = new Employee(firstName, lastName, departmentNumber, paymentForMounth,
                            Employee.getWorkersCounter());
                    break;
                }
            }
        } else {
            bookArr[rewriteQueue] = new Employee(firstName, lastName, departmentNumber,
                    paymentForMounth, rewriteQueue + 1);
            rewritePull[rewriteQueue] = 0;
            rewriteQueue = 0;
        }
    }
    //мы не удаляем пользователя а помечаем индекс как готовый к перезаписи:
    public void deleteUser(Employee employee, EmployeeBook employeeBook) {
        for (int i = 0; i < employeeBook.rewritePull.length - 1; i++) {
            if (employeeBook.rewritePull[i] == 0) {
                employeeBook.rewritePull[i] = employee.getId();
            }
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
        System.out.println(book.bookArr[0].firstName);
    }
}