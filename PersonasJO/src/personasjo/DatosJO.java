package personasjo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DatosJO {
    
    public static void main (String args [])
    {
    
        String nombre, apellido, IMCTIPO;
        char sexo;
        int edad;
        float peso, estatura, IMC;
        
        Scanner teclado = new Scanner (System.in);
        
        PersonasJO hugo = new PersonasJO();
        PersonasJO paco = new PersonasJO();
        PersonasJO luis = new PersonasJO();
        PersonasJO daisy = new PersonasJO();
        
        hugo.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE);
        hugo.apellido = JOptionPane.showInputDialog(null, "Introduce el apellido:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE);
        hugo.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE));
        hugo.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el peso:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE));  
        hugo.estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la estatura:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE));  
        hugo.sexo = JOptionPane.showInputDialog(null, "Introduce el sexo:", "INTRODUCE DATOS DE HUGO", JOptionPane.QUESTION_MESSAGE).charAt(0);
        
        hugo.IMC = (hugo.peso) / (hugo.estatura * hugo.estatura);
        
        if (hugo.IMC < 18.5)
        {
            hugo.IMCTIPO = "Delgadez";
        }
        else if (hugo.IMC >= 18.5 && hugo.IMC <= 24.99)
        {
            hugo.IMCTIPO = "Normal";
        }
        else if (hugo.IMC >= 25 && hugo.IMC <= 30)
        {
            hugo.IMCTIPO = "Soprepeso";
        }
        else
        {
            hugo.IMCTIPO = "Obesidad";
        }

        JOptionPane.showMessageDialog(null, "Nombre: " +hugo.nombre+ "\n"
                + "Apellido: " +hugo.apellido+ "\n"
                        + "Edad: " +hugo.edad+ "\n"
                                + "Peso: " +hugo.peso+ "\n"
                                        + "Estatura: " +hugo.estatura+ "\n"
                                                + "IMC: " +hugo.IMC+ ", " +hugo.IMCTIPO, "Datos de Hugo", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        paco.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE);
        paco.apellido = JOptionPane.showInputDialog(null, "Introduce el apellido:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE);
        paco.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE));
        paco.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el peso:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE));  
        paco.estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la estatura:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE));  
        paco.sexo = JOptionPane.showInputDialog(null, "Introduce el sexo:", "INTRODUCE DATOS DE PACO", JOptionPane.QUESTION_MESSAGE).charAt(0);
        
        paco.IMC = (paco.peso) / (paco.estatura * paco.estatura);
        
        if (paco.IMC < 18.5)
        {
            paco.IMCTIPO = "Delgadez";
        }
        else if (paco.IMC >= 18.5 && paco.IMC <= 24.99)
        {
            paco.IMCTIPO = "Normal";
        }
        else if (paco.IMC >= 25 && paco.IMC <= 30)
        {
            paco.IMCTIPO = "Soprepeso";
        }
        else
        {
            paco.IMCTIPO = "Obesidad";
        }

        JOptionPane.showMessageDialog(null, "Nombre: " +paco.nombre+ "\n"
                + "Apellido: " +paco.apellido+ "\n"
                        + "Edad: " +paco.edad+ "\n"
                                + "Peso: " +paco.peso+ "\n"
                                        + "Estatura: " +paco.estatura+ "\n"
                                                + "IMC: " +paco.IMC+ ", " +paco.IMCTIPO, "Datos de Paco", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        luis.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE);
        luis.apellido = JOptionPane.showInputDialog(null, "Introduce el apellido:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE);
        luis.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE));
        luis.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el peso:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE));  
        luis.estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la estatura:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE));  
        luis.sexo = JOptionPane.showInputDialog(null, "Introduce el sexo:", "INTRODUCE DATOS DE LUIS", JOptionPane.QUESTION_MESSAGE).charAt(0);
        
        luis.IMC = (luis.peso) / (luis.estatura * luis.estatura);
        
        if (luis.IMC < 18.5)
        {
            luis.IMCTIPO = "Delgadez";
        }
        else if (luis.IMC >= 18.5 && luis.IMC <= 24.99)
        {
            luis.IMCTIPO = "Normal";
        }
        else if (luis.IMC >= 25 && luis.IMC <= 30)
        {
            luis.IMCTIPO = "Soprepeso";
        }
        else
        {
            luis.IMCTIPO = "Obesidad";
        }

        JOptionPane.showMessageDialog(null, "Nombre: " +luis.nombre+ "\n"
                + "Apellido: " +luis.apellido+ "\n"
                        + "Edad: " +luis.edad+ "\n"
                                + "Peso: " +luis.peso+ "\n"
                                        + "Estatura: " +luis.estatura+ "\n"
                                                + "IMC: " +luis.IMC+ ", " +luis.IMCTIPO, "Datos de Luis", JOptionPane.INFORMATION_MESSAGE);
        
        
        daisy.nombre = JOptionPane.showInputDialog(null, "Introduce el nombre:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE);
        daisy.apellido = JOptionPane.showInputDialog(null, "Introduce el apellido:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE);
        daisy.edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE));
        daisy.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el peso:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE));  
        daisy.estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la estatura:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE));  
        daisy.sexo = JOptionPane.showInputDialog(null, "Introduce el sexo:", "INTRODUCE DATOS DE DAISY", JOptionPane.QUESTION_MESSAGE).charAt(0);
        
        daisy.IMC = (daisy.peso) / (daisy.estatura * daisy.estatura);
        
        if (daisy.IMC < 18.5)
        {
            daisy.IMCTIPO = "Delgadez";
        }
        else if (daisy.IMC >= 18.5 && daisy.IMC <= 24.99)
        {
            daisy.IMCTIPO = "Normal";
        }
        else if (daisy.IMC >= 25 && daisy.IMC <= 30)
        {
            daisy.IMCTIPO = "Soprepeso";
        }
        else
        {
            daisy.IMCTIPO = "Obesidad";
        }

        JOptionPane.showMessageDialog(null, "Nombre: " +daisy.nombre+ "\n"
                + "Apellido: " +daisy.apellido+ "\n"
                        + "Edad: " +daisy.edad+ "\n"
                                + "Peso: " +daisy.peso+ "\n"
                                        + "Estatura: " +daisy.estatura+ "\n"
                                                + "IMC: " +daisy.IMC+ ", " +daisy.IMCTIPO, "Datos de Daisy", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
