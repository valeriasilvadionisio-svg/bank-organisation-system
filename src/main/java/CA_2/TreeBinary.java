/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */


//HERE REPRESENTS ONLY THE "NODES", LIKE A BOX FROM THE TREEMAIN
//here i m create the binary tree.
//each node stores one Employee object and links to left and right child nodes.

//Each node stores:
//one Employee object
//one left child node
//one right child node
//The binary tree will later use these nodes to create the employee hierarchy structure.


public class TreeBinary {

    Employee employee;// This variable stores the employee object inside the node
    TreeBinary left; // Left child node
    TreeBinary right;

   //Constructor used to create a new tree node.
   //When a new node is created, it receives one employee object. The left and right child nodes start as null because
   //the node is not connected yet.

    public TreeBinary(Employee employee) {

        this.employee = employee;
        this.left = null;
        this.right = null;
    }
}
