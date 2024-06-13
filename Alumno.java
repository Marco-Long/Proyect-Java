/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;
import java.util.regex.*;

/**
 *
 * @author marco
 */
public class Alumno {
    public String nombre;
    public String apellido;
    public String usuario;
    public String password;
    public String carnet;
    public String genero;
    public String nota;
    Object codigo;
    String alumno;
    Object horario;
    
    public boolean validarPassword(String password) {
        // Expresión regular que verifica que la contraseña tenga al menos 8 caracteres y al menos un símbolo especial
        String regex = "^(?=.*[!@#$%^&*()-_=+\\\\|\\[{\\]};:'\",<.>/?]).{8,}$";
        
        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);
        
        // Verificar si la contraseña coincide con el patrón
        Matcher matcher = pattern.matcher(password);
        
        // Devolver true si la contraseña cumple con la condición, false de lo contrario
        return matcher.matches();
    }

    void agregarNota(Notas nota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
