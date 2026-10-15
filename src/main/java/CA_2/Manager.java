/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */

// my diagram 
//- managerId : int {readonly}
//- managerType : String

//+ getManagerId()
//+ getManagerType()
//+ toString()

//I created Manager as a child class because a manager is still an employee, but has extra information related to management.

public class Manager extends Employee {
    private int managerId;
    private String managerType;
}
