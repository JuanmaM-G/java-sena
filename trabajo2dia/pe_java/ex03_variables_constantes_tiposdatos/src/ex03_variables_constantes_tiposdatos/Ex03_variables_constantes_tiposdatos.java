package ex03_variables_constantes_tiposdatos;
import java.util.Scanner;

public class Ex03_variables_constantes_tiposdatos {

    public static void main(String[] args) {
        
        
        String nombre;
        char Sexo;
        int edad;
        double salario;
        boolean transporte;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        nombre = in.next();
        
        System.out.println("ingrese su Sexo");
        Sexo = in.next().charAt(0);
        
        System.out.println("ingrese su edad");
        edad = in.nextInt ();
        
        System.out.println("ingrese su salario (concentavos)");
        salario = in.nextDouble ();
        
        System.out.println("¿Tiene transporte?");
        transporte = in.nextBoolean();        
        
        

        
        
        System.out.println("su nombre es" + nombre);
        System.out.println("Su sexo es" + Sexo);
        System.out.println("su edad es" + edad);
        System.out.println("su salario es de" + salario);
        System.out.print("¿Tiene transporte?" + transporte);
    }
    
}
