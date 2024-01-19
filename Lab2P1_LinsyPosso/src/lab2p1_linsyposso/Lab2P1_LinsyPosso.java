/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_linsyposso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 29164
 */
public class Lab2P1_LinsyPosso {

    public static Scanner Leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            System.out.println("--Menu--");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Listar Todo");
            System.out.println("3. Listar Por Dominio");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                {
                    try {
                        Registro();
                    } catch (ParseException ex) {
                        Logger.getLogger(Lab2P1_LinsyPosso.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }
    }

    public static void Registro() throws ParseException {
        System.out.print("Ingrese su nombre: ");
        String nombre = Leer.next();
        System.out.print("Ingrese su apellido: ");
        String apellido = Leer.next();
        System.out.print("Ingrese su fecha de nacimiento MM/dd/yyyy: ");
        String fNacimiento = Leer.next();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sd.parse(fNacimiento);
        System.out.println("Ingrese su correo electronico: ");
        String correo = Leer.next();
        System.out.println("Ingrese su contraseña: ");
        String contra = Leer.next();
    }
}
