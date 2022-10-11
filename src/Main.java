import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEployee(employeeBook.ostapovDmitriy);
        employeeBook.addEployee(employeeBook.larionovVlad);
        employeeBook.addEployee(employeeBook.kitaevNikita);
        employeeBook.addEployee(employeeBook.lykanovVladimir);
        employeeBook.addEployee(employeeBook.rydkovskiiTigran);
        employeeBook.addEployee(employeeBook.nikiforovNikifor);
        employeeBook.getAList();
        employeeBook.removeEployee(employeeBook.ivanovIvan);
        employeeBook.getAList();
        employeeBook.changeEployeeDepartament(employeeBook.larionovVlad, 1);
        employeeBook.getAList();
        employeeBook.changeEployeeSalary(employeeBook.larionovVlad, 150000);
        employeeBook.getAList();
        employeeBook.listOfEmployeesByDepartment();


    }
}