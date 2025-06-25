package restAPI.demorestAPi;

import java.util.ArrayList;
import java.util.List;

public class EmployeesStorage {
    
    private List<Employee> employeeList;

    //Get the employees list (initilize if null)

    public List<Employee> getEmployeesList(){
        if(employeeList==null){
            employeeList= new ArrayList<>();
        }
        return employeeList;
    }
    
    public void setEmployeesList(List<Employee> employeeList){
        this.employeeList=employeeList;
    }
}
