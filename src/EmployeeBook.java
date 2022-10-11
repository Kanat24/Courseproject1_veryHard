import java.util.Arrays;

public class EmployeeBook {

    Employee ivanovIvan = new Employee("Ivanov Ivan Ivanovich", 1, 30000);
    Employee sidorovSidor = new Employee("Sidorov Sidor Sidorovich", 2, 50000);
    Employee sergeevSergey = new Employee("Sergeev Sergey Sergeevich", 3, 37500);
    Employee petrovPetr = new Employee("Petrov Peter Peterovich", 4, 29000);
    Employee ostapovDmitriy = new Employee("Ostapov Dmitriy Sergeevich", 1, 52100);
    Employee kitaevNikita = new Employee("Kitaev Nikita Olegovich", 3, 100000);
    Employee lykanovVladimir = new Employee("Lykanov Vladimir Vladimirovich", 2, 33000);
    Employee rydkovskiiTigran = new Employee("Rydkovskii Tigran Araratovich", 4, 21000);
    Employee nikiforovNikifor = new Employee("Nikiforov Nikifor Nikiforovich", 5, 150000);
    Employee larionovVlad = new Employee("Larionov Vladislav Vladimirovich", 2, 18000);

    private Employee[] employee = {ivanovIvan, sidorovSidor, sergeevSergey, petrovPetr,
            null, null, null, null, null, null};


    public EmployeeBook() {
        this.employee = employee;
    }

    public void getAList() {
        for (Employee employee1 : employee) {
//            if (employee1 != null) {
            System.out.println(employee1);
//            }
        }
    }

    public void indexSalary() {
        int arg = 10;
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                employee1.setSalary(employee1.getSalary() + employee1.getSalary() * arg / 100);
                System.out.println(employee1.getSalary());
            }
        }
    }

    public void numberDepartamentOllSum(int departamentNumber) {
        int sum = 0;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                sum += employee1.getSalary();
            }
        }
        System.out.println("Сумма зарплат по отделу " + departamentNumber + " равна " + sum);
    }

    public String numberDepartamentMaxSum(int departamentNumber) {
        int maxSumma = Integer.MIN_VALUE;
        String employeeMaxSumma = null;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {

                if (employee1.getSalary() > maxSumma) {
                    maxSumma = employee1.getSalary();
                    employeeMaxSumma = employee1.getFullName();
                }
            }
        }
        return employeeMaxSumma;

    }

    public String numberDepartamentMinSum(int departamentNumber) {
        int minSumma = Integer.MAX_VALUE;
        String employeeMinSumma = null;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {

                if (employee1.getSalary() < minSumma) {
                    minSumma = employee1.getSalary();
                    employeeMinSumma = employee1.getFullName();
                }
            }
        }
        return employeeMinSumma;

    }

    public void averageSalaryDepartment(int departamentNumber) {
        double sum = 0;
        double averageSummaDepartament = 0;
        int counter = 0;
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                sum += employee1.getSalary();
                counter++;
                averageSummaDepartament = sum / counter;
            }
        }
        System.out.printf("%.2f %n", averageSummaDepartament);
    }

    public void indexOllSalary(int departamentNumber, int arg) {
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                employee1.setSalary(employee1.getSalary() + employee1.getSalary() * arg / 100);
                System.out.println("Проиндексированная зарплата каждого сотрудника: " + employee1.getFullName() + " : " + employee1.getSalary());
            }
        }
    }

    public void ollDepartamentEmployee(int departamentNumber) {
        System.out.println("Полный список сотрудников отдела " + departamentNumber + " :");
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getDepartment() == departamentNumber) {
                String ollEmployees = employee1.getFullName() + " " + employee1.getSalary() + " " + employee1.id;
                System.out.println(ollEmployees);
            }
        }
    }

    public void salaryLessNumber(int number) {
        System.out.println("Сотрудники с зарплатой меньше " + number + " :");
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getSalary() < number) {
                System.out.println("id : " + employee1.id + "," + " fullName " + employee1.getFullName() + "," + " зарплата : " + employee1.getSalary());
            }

        }
    }

    public void salaryMoreNumber(int number) {
        System.out.println("Сотрудники с зарплатой больше " + number + " :");
        for (Employee employee1 : employee) {
            if (employee1 != null && employee1.getSalary() >= number) {
                System.out.println("id : " + employee1.id + "," + " fullName " + employee1.getFullName() + "," + " зарплата : " + employee1.getSalary());

            }
        }
    }

    public void addEployee(Employee employee2) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = employee2;
                System.out.println("Сотрудник "  +employee2.getFullName()+ " успешно добавлен");
                return;
            }
        }
        System.out.println("Мест нет");

    }

    public void removeEployee(Employee employee2) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName() == employee2.getFullName()) {
                employee[i] = null;
                System.out.println("Сотрудник " +employee2.getFullName()+ " успешноо удален");
                return;
            } else {
                System.out.println("Такой сотрудник не найден");
            }
        }

    }

    public void changeEployeeSalary(Employee employee2, int salary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getFullName() == employee2.getFullName()) {
                employee[i].setSalary(salary);
                return;
            }

        }

    }

    public void changeEployeeDepartament(Employee employee2, int departament) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getFullName() == employee2.getFullName()) {
                employee[i].setDepartment(departament);
                return;
            }
        }
    }

    public void listOfEmployeesByDepartment() {
        System.out.println("Сотрудники департамента 1 : ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == 1) {
                System.out.println(employee[i].getFullName());
            }
        }
        System.out.println("Сотрудники департамента 2 : ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == 2) {
                System.out.println(employee[i].getFullName());
            }
        }
        System.out.println("Сотрудники департамента 3 : ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == 3) {
                System.out.println(employee[i].getFullName());
            }
        }
        System.out.println("Сотрудники департамента 4 : ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == 4) {
                System.out.println(employee[i].getFullName());
            }
        }
        System.out.println("Сотрудники департамента 5 : ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == 5) {
                System.out.println(employee[i].getFullName());
            }
        }
    }
}