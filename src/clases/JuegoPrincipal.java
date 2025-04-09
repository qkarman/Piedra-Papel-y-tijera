package clases;

import javax.swing.JOptionPane;

public abstract class JuegoPrincipal
{

    //Creamos mas instancias de clases protegidas
    protected int player_Uno,player_Dos, opcion,opcion2, piedra = 1, papel = 2, tijera = 3;

    //Creamos el metodo donde vamos a desarrollar todo el comportamiento del juego
    public void juego()
    {
        //Creamos una instancias para invocar el nombre de los jugadores
        NombrePlayer ajuste1 = new NombrePlayer();

        //Asignamos los nombres de los jugadores utilizando los setters
        ajuste1.setNombre(" Qkarman " );

        //Creamos una instancia para invocar el nombre de los jugadores
        NombrePlayer ajuste2 = new NombrePlayer();

        //Asignamos los nombres de los jugadores utilizando los setters
        ajuste2.setNombre(" Enemigo 666 " );



        JOptionPane.showMessageDialog(null,
                "\n M E N U "
                        + "\n 1.- Piedra "
                        + "\n 2.- Papel "
                        + "\n 3.- Tijera "
                        + "\n 4.- Ajustes ");

        //Lo mostramos con el getter
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null," Selecciona tu forma " + ajuste1.getNombre() ));
        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null," Selecciona tu forma " +  ajuste2.getNombre() ));

        //Optimizacion del código de seleccion con jugador 1
        switch(opcion)
        {
            case 1:
                player_Uno = piedra;
                break;

            case 2:
                player_Uno = papel;
                break;

            case 3:
                player_Uno = tijera;
                break;

            default:
                JOptionPane.showMessageDialog(null," Opcion invalida, ingresa un numero de 1 a 3 " );
        }

        //Optimizacion del código de seleccion con jugador 2
        switch(opcion2)
        {
            case 1:
                player_Dos = piedra;
                break;

            case 2:
                player_Dos = papel;
                break;

            case 3:
                player_Dos = tijera;
                break;

            default:
                JOptionPane.showMessageDialog(null," Opcion invalida, ingresa un numero de 1 a 3 " );
        }

    }

    //Creamos una clase abstract porque nos vamos a comunicar con la logica del juego
    public abstract void combinacion();

}
