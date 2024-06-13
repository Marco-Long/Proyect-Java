package com.mycompany.loginb;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class MateriasB {
    public static ArrayList<Materia> materias = new ArrayList<>();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Notas> notas = new ArrayList<>();
    

  
    public static void main(String[] args) {
        Administrador a = new Administrador();
        a.setVisible(true);
}
}