package personas;
import java.util.Scanner;


public class Datos {
    
    public static void main (String args [])
    {
        
        String nombre, apellido, IMCTIPO;
        char sexo;
        int edad;
        float peso, estatura, IMC;
        
        Scanner teclado = new Scanner (System.in);
        
        Personas hugo = new Personas();
        Personas paco = new Personas();
        Personas luis = new Personas();
        Personas daisy = new Personas();
        
        System.out.println("INTRODUCE DATOS DE HUGO");
        
        System.out.println("Introduce el nombre");
        hugo.nombre = teclado.next();
        
        System.out.println("Introduce el apellido");
        hugo.apellido = teclado.next();
        
        System.out.println("Introduce la edad");
        hugo.edad = teclado.nextInt();
        
        System.out.println("Introduce el peso");
        hugo.peso = teclado.nextFloat();
        
        System.out.println("Introduce la estatura");
        hugo.estatura = teclado.nextFloat();
        
        System.out.println("Introduce el sexo");
        hugo.sexo = teclado.next().charAt(0);
        
        System.out.println("-----------------");
        System.out.println("");
        
        
        
        
        System.out.println("INTRODUCE DATOS DE PACO");
        
        System.out.println("Introduce el nombre");
        paco.nombre = teclado.next();
        
        System.out.println("Introduce el apellido");
        paco.apellido = teclado.next();
        
        System.out.println("Introduce la edad");
        paco.edad = teclado.nextInt();
        
        System.out.println("Introduce el peso");
        paco.peso = teclado.nextFloat();
        
        System.out.println("Introduce la estatura");
        paco.estatura = teclado.nextFloat();
        
        System.out.println("Introduce el sexo");
        paco.sexo = teclado.next().charAt(0);
        
        System.out.println("-----------------");
        System.out.println("");
        
        
        
        System.out.println("INTRODUCE DATOS DE LUIS");
        
        System.out.println("Introduce el nombre");
        luis.nombre = teclado.next();
        
        System.out.println("Introduce el apellido");
        luis.apellido = teclado.next();
        
        System.out.println("Introduce la edad");
        luis.edad = teclado.nextInt();
        
        System.out.println("Introduce el peso");
        luis.peso = teclado.nextFloat();
        
        System.out.println("Introduce la estatura");
        luis.estatura = teclado.nextFloat();
        
        System.out.println("Introduce el sexo");
        luis.sexo = teclado.next().charAt(0);
        
        System.out.println("-----------------");
        System.out.println("");
        
        
        
        System.out.println("INTRODUCE DATOS DE DAISY");
        
        System.out.println("Introduce el nombre");
        daisy.nombre = teclado.next();
        
        System.out.println("Introduce el apellido");
        daisy.apellido = teclado.next();
        
        System.out.println("Introduce la edad");
        daisy.edad = teclado.nextInt();
        
        System.out.println("Introduce el peso");
        daisy.peso = teclado.nextFloat();
        
        System.out.println("Introduce la estatura");
        daisy.estatura = teclado.nextFloat();
        
        System.out.println("Introduce el sexo");
        daisy.sexo = teclado.next().charAt(0);
        
        System.out.println("-----------------");
        System.out.println("");
        
        
        
        
        System.out.println("DATOS DE HUGO");
        System.out.println("Nombre: " +hugo.nombre);
        System.out.println("Apellido: " +hugo.apellido);
        System.out.println("Edad: " +hugo.edad);
        System.out.println("Peso: " +hugo.peso);
        System.out.println("Estatura: " +hugo.estatura);
        System.out.println("Sexo: " +hugo.sexo);
        System.out.println("-----------------");
        System.out.println("");
        
        System.out.println("DATOS DE PACO");
        System.out.println("Nombre: " +paco.nombre);
        System.out.println("Apellido: " +paco.apellido);
        System.out.println("Edad: " +paco.edad);
        System.out.println("Peso: " +paco.peso);
        System.out.println("Estatura: " +paco.estatura);
        System.out.println("Sexo: " +paco.sexo);
        System.out.println("-----------------");
        System.out.println("");
        
        System.out.println("DATOS DE LUIS");
        System.out.println("Nombre: " +luis.nombre);
        System.out.println("Apellido: " +luis.nombre);
        System.out.println("Edad: " +luis.edad);
        System.out.println("Peso: " +luis.peso);
        System.out.println("Estatura: " +luis.estatura);
        System.out.println("Sexo: " +luis.sexo);
        System.out.println("-----------------");
        System.out.println("");
        
        System.out.println("DATOS DE DAISY");
        System.out.println("Nombre: " +daisy.nombre);
        System.out.println("Apellido: " +daisy.nombre);
        System.out.println("Edad: " +daisy.edad);
        System.out.println("Peso: " +daisy.peso);
        System.out.println("Estatura: " +daisy.estatura);
        System.out.println("Sexo: " +daisy.sexo);
        System.out.println("-----------------");
        System.out.println("");
                
    }
    
}






