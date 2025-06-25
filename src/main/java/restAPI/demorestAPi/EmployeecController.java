package restAPI.demorestAPi;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/employees")
public class EmployeecController {
    
    @Autowired
    private EmployeeDAO employeedao;

    //Get endpoints to add a new emplyees
    @GetMapping("/")
    public EmployeesStorage getEmployeesList(){
        return employeedao.getAllEmployees();
    }

    @PostMapping("/")
    public ResponseEntity<Object>
    AddEmployee(@RequestBody Employee employee){

        //Generate ID for the new employee

        Integer id=employeedao.getAllEmployees().getEmployeesList().size()+1;
        employee.setId(id);

        //Add employee to hte list

        employeedao.AddEmployee(employee);

        //Build location URI for the new wmployee

        URI location=ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(employee.getId())
        .toUri();

        return ResponseEntity.created(location).build();
        

    }




 
}
