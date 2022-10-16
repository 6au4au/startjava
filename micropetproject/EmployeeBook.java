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
    public void deleteUser(Employee employee) {
        for (int i = 0; i < rewritePull.length - 1; i++) {
            if (rewritePull[i] == 0) {
                rewritePull[i] = employee.getId() - 1;
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

    public void showWorkers() {
        for (Employee i : bookArr) {
            System.out.println("ID FirstName LastName DEP PAY");
            System.out.println(i.getId() + " " + i.getFirstName() + " " + i.getLastName() + " " +
                    i.getDepartmentNumber() + " " + i.getPaymentForMounth());
        }
    }
// ТЕСТОВАЯ ОБЛАСТЬ: 
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
    }
}