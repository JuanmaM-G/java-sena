
package views;

import uml.Rol;
import uml.User;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        
        
        System.out.println("========Inicio de recopilacion de datos del ROL========");
        
        Scanner scan = new Scanner(System.in);
        Rol objRol = new Rol();
        //scan.nextLine();
        
        
        
        System.out.println("Ingrese el ID del rol: " );
        int id = scan.nextInt();
        
        
        System.out.println("Ingrese el tipo de rol: " );
        String name = scan.next();
        
        
        
        objRol.setRol_id(id);
        objRol.setRol_name(name);
        
        
        System.out.println("----Datos del rol----");
        System.out.println("ID: " + objRol.getRol_id());
        System.out.println("Nombre: " + objRol.getRol_name());
        
        
        System.out.println("---------finalizado los datos del rol---------");
    //=========================================================================
        System.out.println("========Inicio de recopilacion de datos del USUARIO========");
        
        
        User objUser = new User();
        
        
        
        System.out.println("Ingrese el ID del Usuario: " );
        int iden = scan.nextInt();
        
        
        System.out.println("Ingrese el tipo de Usuario: " );
        String nombre = scan.next();
        

        
        objUser.setUser_id(iden);
        objUser.setUser_name(nombre);
        
        
        System.out.println("----Datos del Usuario----");
        System.out.println("ID: " + objUser.getUser_id());
        System.out.println("Nombre: " + objUser.getUser_name());
        
        scan.close();
        
        
    }
}