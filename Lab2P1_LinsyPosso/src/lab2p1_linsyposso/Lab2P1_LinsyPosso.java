/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_linsyposso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 29164
 */
public class Lab2P1_LinsyPosso {

    private static ArrayList<Registro> reg = new ArrayList<>();
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
                case 1: {
                    try {
                        Registro();
                    } catch (ParseException ex) {
                        Logger.getLogger(Lab2P1_LinsyPosso.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 2:
                    listarTodo();
                    break;

                case 3:

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
        System.out.print("Ingrese su correo electronico: ");
        String correo = Leer.next();
        System.out.print("Ingrese su contraseña: ");
        String contra = Leer.next();
        Registro list = new Registro(nombre, apellido, fecha, correo, contra);
        reg.add(list);
        while (validarFecha(fecha) == true) {
            System.out.print("Ingrese su nombre: ");
            nombre = Leer.next();
            System.out.print("Ingrese su apellido: ");
            apellido = Leer.next();
            System.out.print("Ingrese su fecha de nacimiento MM/dd/yyyy: ");
            fNacimiento = Leer.next();
            //SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            fecha = sd.parse(fNacimiento);
            System.out.print("Ingrese su correo electronico: ");
            correo = Leer.next();
            System.out.print("Ingrese su contraseña: ");
            contra = Leer.next();
            list = new Registro(nombre, apellido, fecha, correo, contra);
            reg.add(list);
        }
        while (validarCorreo(correo)) {
            System.out.print("Ingrese su nombre: ");
            nombre = Leer.next();
            System.out.print("Ingrese su apellido: ");
            apellido = Leer.next();
            System.out.print("Ingrese su fecha de nacimiento MM/dd/yyyy: ");
            fNacimiento = Leer.next();
            //SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
            fecha = sd.parse(fNacimiento);
            System.out.print("Ingrese su correo electronico: ");
            correo = Leer.next();
            System.out.print("Ingrese su contraseña: ");
            contra = Leer.next();
            list = new Registro(nombre, apellido, fecha, correo, contra);
            reg.add(list);
        }

    }

    public static void listarTodo() {
        for (int i = 0; i < reg.size(); i++) {
            System.out.println(reg.get(i).toString());
        }
    }

    public static void listarporDominio() {

    }

    public static boolean validarFecha(Date fecha) {
        Date ahora = new Date();
        boolean acord = false;
        if (ahora.getYear() - fecha.getYear() <= 13) {
            System.out.println("Tiene que tener al menos 13 años");
        }
        acord = true;
        return acord;
    }

    public static boolean validarCorreo(String email) {
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validarContra(String contra) {
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contra);
        return matcher.matches();
    }

}
