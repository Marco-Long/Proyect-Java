/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginb;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Loginb {
    
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnologeado = new Alumno();
    
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
    }
}
