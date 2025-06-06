package clases;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Creamos una clase menu
public class Menu
{
    //Declaramos el escanear y las variable las encapsulamos como protegidas
    protected int seleccionar = 0;

    //Llamamos el metodo de puntaje
    Puntuaje puntaje = new Puntuaje();

    Scanner in = new Scanner( System.in );

    //*Creamos el metodo main para poder probar nuestro proyecto
    public static void main(String[] args)
    {
        Menu invocar = new Menu();
        invocar.gestionMenu();
    }

    //*Creamos un menu para manipular todo el juego
    public void gestionMenu()
    {
        //Creamos un ciclo repetitivo while para seleccionar opciones de querer jugar menores a 3
        while( seleccionar < 3 )
        {
            //Creamos un try para detectar un problema y le damos diseño al programa
            try
            {
                seleccionar = Integer.parseInt(JOptionPane.showInputDialog(null,"""
                        Menu
                        Deseas jugar piedra papel y tijera
                        1.- Si
                        2.- Puntaje total
                        3.- No
                        Selecciona una opcion"""));

                //Creamos un switch para diferentes opciones del usuario
                switch(seleccionar)
                {
                    case 1:
                        //Llamamos a todos los metodos de las clases que vamos a ocupar
                        JuegoPrincipal juego = new JuegoPrincipal(puntaje);
                        juego.juego();
                        break;

                    case 2:
                        puntaje.mostrarPuntuajeMaximo();
                        break;

                    case 3:
                        //creamos un mensaje para la salida del programa
                        JOptionPane.showMessageDialog(null," hasta luego " );
                        break;
                    //La declaramos por si el usuario digita un numero diferente al deseado
                    default:
                        JOptionPane.showMessageDialog(null," Opcion invalida, ingresa un numero de 1 a 3 " );
                }
            }
            //Cerramos el catch para definir el problema encontrado sobre convertir la entrada a un entero
            catch( NumberFormatException ex )
            {
                System.out.print( " Has seleccionado una opcion incorrecta" );
            }
        }
    }
}