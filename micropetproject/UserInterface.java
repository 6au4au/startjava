// показать 10 сотрудников
// вернуться
// найти конкретного сотрудника
// показать сотрудника
// добавить
// удалить
// отобразить список команд


class UserInterface {
    EmployeeBook employeeBook = new EmployeeBook();

    public String show(String firstName, String lastName) {
    }

    public void show(int departmentNumber) {
        String[] departmentList = employeeBook.searchEmployee(departmentNumber);
        String employee;
        for (String i : departmentList) {
            System.out.println(i);
        }
    }

    public String show() {

    }

    public String search(String firstName, String lastName) {
        String employee = employeeBook.searchEmployee(firstName, lastName);
        if (employee == null) {
            return "not found";
        }
        return employee;
    }

    public String back() {

    }

    public String create() {

    }

    public String delete() {

    }

}
