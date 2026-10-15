/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */
//my diagram 
//Employee
//- employeeId : int 
//- firstName : String
//- lastName : String
//- gender : String
//- email : String
//- salary : double
//- department : String
//- position : String
//- jobTitle : String
//- company : String


public class Employee {
    
  //Creating the main Employee class first because all employee types will inherit from this class later.
 //I am adding the common information here (name, email, salary, etc.)
    
    private int employeeId;  //employeeId will later be updated to a final/read-only attribute
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private double salary;
    private String department;
    private String position;
    private String jobTitle;
    private String company;
    
    
 
 //Empty constructor. This allows child classes to inherit from Employee without needing
 //to pass all employee information immediately.


public Employee() {

}
    
    
    
   
    
    //This constructor receives the employee information and stores the values inside the Employee object. (when read in the ca_2)

public Employee(int employeeId, String firstName, String lastName,
        String gender, String email, double salary,
        String department, String position,
        String jobTitle, String company) {

    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.email = email;
    this.salary = salary;
    this.department = department;
    this.position = position;
    this.jobTitle = jobTitle;
    this.company = company;

}


 //This method returns the employee full name.
 //I will use this later for sorting and searching.


public String getFullName() { //put the full name for sorting and searching 
    return firstName + " " + lastName;
}


 //This its for method decides how the employee will be displayed as text.

@Override //its mean like: i m replacing a method that already exists in the java object class
public String toString() { //show the employee name in a readable format on the terminal 
    return getFullName() + " - " + department + " - " + jobTitle;
}

    public String getPosition() { //this is for class treeMain 
    return position;
}

public String getDepartment() {
    return department;
}
}
