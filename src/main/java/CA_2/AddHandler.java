/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */
import java.util.ArrayList;
import java.util.Scanner;

//This class is responsible only for adding a new employee record.

public class AddHandler  {
    
// This list stores only the new employee records added by the user
private ArrayList<Employee> newEmployees = new ArrayList<>();

    // here to adds a new employee to the employee list
    public void addEmployee(ArrayList<Employee> employeeList, Scanner input) {

        // Clear scanner buffer before reading text
        input.nextLine();

        String firstName;

        // This loop keeps asking until the user enters a valid first name
        do {

        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        // Validation message if the field is empty
        if (firstName.trim().isEmpty() || !firstName.matches("[a-zA-Z ]+")) {
        System.out.println("First name must contain letters only.");
}

     } while (firstName.trim().isEmpty() || !firstName.matches("[a-zA-Z ]+"));
        
         String lastName;

        // This loop keeps asking until the user enters a valid last name
       do {

        System.out.print("Enter last name: ");
        lastName = input.nextLine();

        // Validation message if the field is empty
        if (lastName.trim().isEmpty() || !lastName.matches("[a-zA-Z ]+")) {
        System.out.println("Last name must contain letters only.");
}
       

    }
       while (lastName.trim().isEmpty() || !lastName.matches("[a-zA-Z ]+"));

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

       String email;

      do {
        System.out.print("Enter email: ");
        email = input.nextLine();

      if (!email.contains("@") || !email.contains(".")) {
        System.out.println("Invalid email. Please enter a valid email address.");
    }

     }
      while (!email.contains("@") || !email.contains("."));
        
        
  
        double salary;

       // This loop keeps asking until the user enters a valid salary
       while (true) {

       System.out.print("Enter salary: ");

       // Checking if the value entered is a valid number
       if (input.hasNextDouble()) {

        salary = input.nextDouble();
        input.nextLine();
        break;

    } else {

        // Error message if the salary is not numeric
        System.out.println("Invalid salary. Please enter a number.");

        // Clear invalid input
        input.nextLine();
    }
}

      //----------------------//
      
      String department;

      // here to asks the user to choose an existing department.
      // Using fixed options helps validate the input correctly.
       do {
           

            System.out.println("Choose department:");
            System.out.println("1. Finance");
            System.out.println("2. IT");
            System.out.println("3. HR");
            System.out.print("Enter option: ");

    department = input.nextLine();

    // If the user selects option 1, the department will be Finance
    if (department.equals("1")) {

        department = "Finance";

    //same here 
    } else if (department.equals("2")) {

        department = "IT";

    // same here 
    } else if (department.equals("3")) {

        department = "HR";

    } else {

        System.out.println("Invalid department. Please try again.");
        department = "";
    }

} while (department.isEmpty());

        
      //------------------------------------------------//
        
        String position;

     // here to asks the user to choose a manager type from the valid options.
     // I am using numbers instead of free text to avoid spelling mistakes
     // and to make sure the selected manager type exists in the system.

         do {
     
            System.out.println("Choose manager type:");
            System.out.println("1. Head Manager");
            System.out.println("2. Assistant Manager");
            System.out.println("3. Team Leader");
            System.out.print("Enter option: ");

        position = input.nextLine();

    
     // If the user selects option 1, the manager type will be Head Manager
     
     if (position.equals("1")) {
        position = "Head Manager";
    } else if (position.equals("2")) {
        position = "Assistant Manager";
    } else if (position.equals("3")) {
        position = "Team Leader";
    } else {
        System.out.println("Invalid manager type. Please try again.");
        position = "";
    }

} while (position.isEmpty());
       

        System.out.print("Enter job title: ");
        String jobTitle = input.nextLine();

        System.out.print("Enter company: ");
        String company = input.nextLine();

        // Creating a simple employee id based on the list size
        int employeeId = employeeList.size() + 1;

        // Creating the new employee object
        Employee newEmployee = new Employee(
                employeeId,
                firstName,
                lastName,
                gender,
                email,
                salary,
                department,
                position,
                jobTitle,
                company
        );

        // Adding the new employee to the list
        employeeList.add(newEmployee);
        
        // Storing the new employee separately
        newEmployees.add(newEmployee);


        System.out.println("Employee added successfully:");
        
        System.out.println("\n===== NEW EMPLOYEE RECORDS =====");

        for (Employee newEmployeeRecord : newEmployees) {
        System.out.println(newEmployeeRecord);
}
    }
}
