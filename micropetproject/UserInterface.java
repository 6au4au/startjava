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
        String employee = employeeBook.serachEmployee(firstName, lastName);
        System.out.println(employee);
    }

    public String show(int departmentNumber) {

    }

    public String show() {

    }

    public String search(String firstName, String lastName) {

    }

    public String back() {

    }

    public String create() {

    }

    public String delete() {

    }

}
