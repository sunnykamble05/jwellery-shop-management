/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import javax.swing.SwingUtilities;
import user.Titlepage;

/**
 * This class represents a Project entity.
 * It contains project-related data and methods.
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          SwingUtilities.invokeLater(() -> {
            new Titlepage().setVisible(true);
            System.out.println("running");
         });
                 }
}

   

