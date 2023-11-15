package proyectofinal;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author juanmartinhurtado
 */
public class Archivo {
    
    File archivo;
    
    public void crearArchivo(){
        try{
            archivo = new File("AgendaContactos.txt");
            if(archivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo Creado.");
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void escribirEnArchivo(Persona persona){
        try{
            FileWriter escritura = new FileWriter(archivo,true);
            escritura.write(persona.getNombre() + "%" + persona.getApellidos() + "%" + persona.getCarrera() + "%" + persona.getSexo() + "\r\n");
            escritura.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
