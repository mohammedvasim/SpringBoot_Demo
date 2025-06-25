package restAPI.demorestAPi;

public class Employee {
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;


    //Default constructor
    public Employee(){

    }

    //Parameterized constructor
    public Employee(Integer id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        
        return "Employee [id="+ id +",firstname=" + firstName + ", lastname="+lastName+", eamil= "+ email+"]" ;
    }



}
