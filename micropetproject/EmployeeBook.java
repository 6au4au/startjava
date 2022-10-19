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

    public String[] searchEmployee(int departmentNumber) {
        String[] departmentList = new String[5];
        for (int i = 0; i < bookArr.length - 1; i++) {
            if (bookArr[i].getDepartmentNumber() == departmentNumber) {
                departmentList[i] = bookArr[i].getFirstName() + " " + bookArr[i].getFirstName() + " " +
                        bookArr[i].getDepartmentNumber() + " " + bookArr[i].getPaymentForMounth();
            }
        }
        return departmentList;
    }

    public String searchEmployee(String firstName, String lastName) {
        for (Employee i : bookArr) {
            if (i.getFirstName().toLowerCase() == firstName.toLowerCase() &&
                        i.getLastName().toLowerCase() == lastName.toLowerCase()) {
                return i.getId() + " " + i.getFirstName() + " " + i.getLastName() + " " +
                        i.getDepartmentNumber() + " " + i.getPaymentForMounth();
            }
        }
        return null;
    }

    public void raiseEmployeePayment(Employee employee, int lifting) {
        employee.setPaymentForMounth(employee.getPaymentForMounth() + (double) lifting);
    }

    public void raiseEmployeePayment(Employee employee, double lifting) {
        employee.setPaymentForMounth(employee.getPaymentForMounth() + lifting);
    }

    public void indexedPayment(int percent) {
        int counter = 0;
        for (Employee i : bookArr) {
            if (counter++ <= rewritePull.length && checkRewritePull()) {
                continue;
            }
            raiseEmployeePayment(i, (i.getPaymentForMounth() / 100) * (double) percent);
        }
    }
}