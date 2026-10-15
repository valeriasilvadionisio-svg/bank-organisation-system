/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CA_2;

/**
 * @author valeriadionisio
 */
//CA2 Integrated Project - I chosed Bank Organisation 
// The program will allow the user to:
//read employee/applicant records from a file;
//sort records alphabetically;
//search for a person and show their manager type and department;
//add new employee records with input validation;
//create an employee hierarchy using a binary tree.
//The system will use the package name CA_2 as required in the assignment brief.

import java.util.Scanner;

//This class will starts the system and displays the menu options.

//For now, I am creating the console menu structure first later, each menu option will call a method, such as reading the file,
//sorting records, searching employees, adding records and creating the binary tree.

public class CA_2 {

   
    public static void main(String[] args) {

        // Scanner used to read user input
        Scanner input = new Scanner(System.in);
        
        // Creating the FileHandler object
        FileHandler fileHandler = new FileHandler();
        
        // Creating the SortHandler object
        SortHandler sortHandler = new SortHandler();
        
        // Creating the SearchHandler object
        SearchHandler searchHandler = new SearchHandler();
        
        // Creating the AddHandler object
        AddHandler addHandler = new AddHandler();
        
        // Creating the TreeMain object
        TreeMain treeMain = new TreeMain();

        // This variable stores the number chosen by the user from the menu
        int choice;

        // here the loop keeps showing the menu until the user chooses option 6 to exit
        do {

            System.out.println("\n===== BANK SYSTEM =====");
            System.out.println("1. READ FILE");
            System.out.println("2. SORT");
            System.out.println("3. SEARCH");
            System.out.println("4. ADD RECORD");
            System.out.println("5. CREATE BINARY TREE");
            System.out.println("6. EXIT");

            // Ask for user input
            System.out.print("Select an option: ");
            choice = input.nextInt();
            
            MenuOption selectedOption = null; //This variable will store the menu option selected by the user, as brief 
            
            
            //At first, the menu was only using numbers like 1, 2 or 3 to control the options. 
            //After creating the MenuOption enum, I connected the numbers to named options such as READ_FILE, SORT and SEARCH.

            //This makes the code more organised and easier to understand 
            //because the program is no longer working only with random numbers. 
            //It is also easier to maintain later if more menu options are added.

            // The switch its to checks which option the user selected
            switch (choice) {

                case 1: //If the user choose 1, the program will later read the employee file
                    selectedOption = MenuOption.READ_FILE;
                    break;

                case 2: //same here 
                    selectedOption = MenuOption.SORT;
                    break;

                case 3: //same here 
                    selectedOption = MenuOption.SEARCH;
                    break;

                case 4://same here 
                    selectedOption = MenuOption.ADD_RECORD;
                    break;

                case 5: //same here
                    selectedOption = MenuOption.CREATE_BINARY_TREE;
                    break;

                case 6: //same here
                    selectedOption = MenuOption.EXIT;
                    break;
            
        
                default: //if the user types any number outside 1-6, this message is displayed
                    System.out.println("Invalid option. Please try again.");
            }

                // This switch uses the enum option to decide what the program should do
                if (selectedOption != null) {
                    
                 switch (selectedOption) {
       
           //Calling the readFile method from the FileHandler class when the user selects the READ FILE option          
           case READ_FILE:
             System.out.println("READ FILE selected.");
             fileHandler.readFile();
              break;
              
              //Now the READ FILE menu option is connected to the FileHandler class. 
              //when the user selects option 1, the program calls the readFile and starts the file handling process.

           case SORT:
           System.out.println("SORT selected.");

           // Calling the sort method from SortHandler
           sortHandler.sortEmployees(fileHandler.getEmployeeList());
           break;

        case SEARCH:
        System.out.println("SEARCH selected.");

         // Clear the scanner buffer before reading text
         input.nextLine();

        // Asking the user to type the employee full name
        System.out.print("Enter employee full name: ");
        String searchName = input.nextLine();

        // Calling the search method from SearchHandler
        searchHandler.searchEmployee(fileHandler.getEmployeeList(), searchName);
        break;

       case ADD_RECORD:
       System.out.println("ADD RECORD selected.");

       // Calling the addEmployee method from AddHandler
      addHandler.addEmployee(fileHandler.getEmployeeList(), input);
      break;

        case CREATE_BINARY_TREE:
        System.out.println("CREATE BINARY TREE selected.");

        // Calling the createTree method from TreeMain
        treeMain.createTree(fileHandler.getEmployeeList());
        break;

        case EXIT:
            System.out.println("Exiting system...");
            break;
    }

    }
       } while (choice != 6);

        input.close(); //// here is to closing the Scanner after the loop ends
    }
}