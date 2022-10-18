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

    public String searchEmployee(String firstName, String lastName) {
        for (Employee i : bookArr) {
            if (i.getFirstName().toLowerCase() == firstName.toLowerCase() &&
                        i.getLastName.toLowerCase() == lastName.toLowerCase()) {
                return i.getId() + " " + i.getFirstName() + " " + i.getLastName() + " " +
                        i.getDepartmentNumber() + " " + i.getPaymentForMounth();
            }
        }
    }

    public void raiseEmployeePayment(Employee employee, int lifting) {
        employee.setPayment(employee.getPayment() + (double) lifting);
    }

    public void raiseEmployeePayment(Employee employee, double lifting) {
        employee.setPayment(employee.getPayment() + lifting);
    }

    public void indexedPayment(int percent) {
        int counter = 0;
        for (Employee i : bookArr) {
            if (counter++ <= rewritePull.length && checkRewritePull()) {
                continue;
            }
            raiseEmployeePayment(i, (i.getPayment() / 100) * (double) percent);
        }
    }
}