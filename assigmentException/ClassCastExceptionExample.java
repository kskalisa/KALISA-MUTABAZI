/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigmentException;

/**
 *
 * @author ks
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = "String";
            Integer num = (Integer) obj; // Invalid type cast
        } catch (ClassCastException e) {
            System.out.println("Class cast exception: " + e.getMessage());
        }
    }
}