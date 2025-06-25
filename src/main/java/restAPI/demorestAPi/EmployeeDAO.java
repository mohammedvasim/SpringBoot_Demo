package restAPI.demorestAPi;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static EmployeesStorage employeesStorage=new EmployeesStorage();

    static{
        //Intialize with sample employees

        employeesStorage.getEmployeesList().add(new Employee(1,"prem","tiwari","prem@gmail.com"));

        employeesStorage.getEmployeesList().add(new Employee(2,"vikesh","kumar","vikaskumar@gmail.com"));

        employeesStorage.getEmployeesList().add(new Employee(3,"ritesh","Ojha","ritesh@gmail.com"));

    }

    public EmployeesStorage getAllEmployees() {
        return employeesStorage;
    }

    public void AddEmployee(Employee employee) {
        employeesStorage.getEmployeesList().add(employee);
    }


}
