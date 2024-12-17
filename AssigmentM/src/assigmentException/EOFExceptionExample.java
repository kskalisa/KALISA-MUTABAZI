/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assigmentException;

/**
 *
 * @author ks
 */
import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("emptyfile.txt"))) {
            while (true) {
                System.out.println(dis.readUTF()); // Reading beyond file contents
            }
        } catch (EOFException e) {
            System.out.println("Reached the end of the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
