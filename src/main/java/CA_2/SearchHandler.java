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

//I separated this from FileHandler because FileHandler reads the file, while SearchHandler searches inside the employee list.

public class SearchHandler {
    
// To searches for an employee by full name using recursive binary search.

    public void searchEmployee(ArrayList<Employee> employeeList, String searchName) {
        
        // Removing extra spaces typed by the user
        searchName = searchName.trim();  

    // Starting the recursive binary search
    int result = recursiveBinarySearch(
            employeeList,
            searchName,
            0,
            employeeList.size() - 1
    );

    // Checking if the employee was found
    if (result != -1) {

        System.out.println("Employee found:");
        System.out.println(employeeList.get(result));

    } else {

        System.out.println("Employee not found.");
    }
}


  
    //This method keeps dividing the list into smaller parts until the employee name is found or the search ends.
    //I chose recursive binary search because the employee list is sorted before the search option is used. 
    //this makes binary search more suitable than linear search because it does not need to check every record one by one.
    //comparation:
    // Linear search:
    //- checks employee names one by one;
    //- works even if the list is not sorted;
    //- but it is less efficient.

    //Binary search:
    //- works best when the list is already sorted;
    //- divides the list in half during each search step;
    //- is faster and more efficient.

    private int recursiveBinarySearch(ArrayList<Employee> employeeList,
        String searchName,
        int left,
        int right) {

    
    // if left becomes greater than right, the employee does not exist in the list
    if (left > right) {
        return -1;
    }

    // Finding the middle position of the current search area
    int middle = (left + right) / 2;

    // Getting the employee name from the middle position
    String middleName = employeeList.get(middle).getFullName().trim();

    // Comparing the search name with the middle employee name
    int comparison = searchName.compareToIgnoreCase(middleName);

    // If comparison is 0, the employee was found
    if (comparison == 0) {

        return middle;

    // so if comparison is less than 0, search on the left side of the list
    } else if (comparison < 0) {

        return recursiveBinarySearch(
                employeeList,
                searchName,
                left,
                middle - 1
        );

    // Otherwise search on the right side of the list
    } else {

        return recursiveBinarySearch(
                employeeList,
                searchName,
                middle + 1,
                right
        );
    }
}
}
