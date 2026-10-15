/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */

import java.util.ArrayList;//An ArrayList is useful because its size can grow automatically as new employee records are added. 
//This is better than using a normal array with a fixed size, because the program may need to store more employees later.1



//This class is responsible only for sorting employee records.
// I separated this from FileHandler because FileHandler should focus on reading the file, while SortHandler focuses on sorting.

public class SortHandler {

    // This method sorts employee names alphabetically and displays only the first 20 employees
    public void sortEmployees(ArrayList<Employee> employeeList) {

        // Calling the recursive bubble sort method
        recursiveBubbleSort(employeeList, employeeList.size());

        System.out.println("\n===== FIRST 20 SORTED EMPLOYEES =====");

        // Displaying only the first 20 employees
        for (int i = 0; i < 20 && i < employeeList.size(); i++) {

            System.out.println(employeeList.get(i));
        }
    }

    
    
//This method uses recursion to sort the employee list.
//The value n represents how many employees still need to be checked.

//The program first reads the employee records from the file and stores them inside an ArrayList. 
//After selecting the SORT option, the system uses a recursive bubble sort algorithm to compare employee names alphabetically and organise them in order. 
//Finally, the program displays only the first 20 sorted employees, as required in the assignment brief.

    
   // I chose recursive bubble sort because the assignment required a recursive algorithm and 
  //I wanted a solution that was easier to implement, understand and maintain.
  //Since the employee dataset was not very large, I did not think a more advanced algorithm 
 //such as Merge Sort was necessary. Although Merge Sort is generally faster for large datasets,
 //it would have added unnecessary complexity to this project.
    
    
    private void recursiveBubbleSort(ArrayList<Employee> employeeList, int n) {

        // Base case: if n is 1, the list is already sorted
        if (n == 1) {
            return;
        }

        // This loop compares employees next to each other
        for (int i = 0; i < n - 1; i++) {

            // Comparing employee full names alphabetically
            if (employeeList.get(i).getFullName()
                    .compareToIgnoreCase(employeeList.get(i + 1).getFullName()) > 0) {

                // Swapping employees if they are in the wrong order
                Employee temp = employeeList.get(i);
                employeeList.set(i, employeeList.get(i + 1));
                employeeList.set(i + 1, temp);
            }
        }

        // Recursive call: sort again, ignoring the last sorted item
        recursiveBubbleSort(employeeList, n - 1);
    }
}


