package clases;
import javax.swing.JOptionPane;

public class LogicaJuego extends JuegoPrincipal
{
    @Override
    public void combinacion()
    {
        //Creamos una instancias para invocar el nombre de los jugadores
        NombrePlayer nombre1 = new NombrePlayer();

        //Asignamos los nombres de los jugadores utilizando los setters
        nombre1.setNombre(" Qkaman " );

        //Creamos una instancia para invocar el nombre de los jugadores
        NombrePlayer nombre2 = new NombrePlayer();

        //Asignamos los nombres de los jugadores utilizando los setters
        nombre2.setNombre(" Luis 02 " );

        //Invocamos el contador
        Puntuaje puntuaje = new Puntuaje();

        // Implementa la lógica para determinar el resultado del juego
        // Puedes utilizar las variables Player_Uno y Player_Dos
        // que han sido asignadas en el método PedirDatos()

        if (player_Uno == piedra && player_Dos == tijera)
        {
            JOptionPane.showMessageDialog(null," Gana Jugador 1 con Piedra " + nombre1.getNombre() );
            puntuaje.combinacion();
        }
        else if (player_Uno == tijera && player_Dos == papel)
        {
            JOptionPane.showMessageDialog(null," Gana Jugador 1 con Tijera " + nombre1.getNombre());
            puntuaje.combinacion();
        }
        else if (player_Uno == papel && player_Dos == piedra)
        {
            JOptionPane.showMessageDialog(null," Gana Jugador 1 con Papel " + nombre1.getNombre());
            puntuaje.combinacion();
        }
        else if (player_Uno == player_Dos)
        {
            JOptionPane.showMessageDialog(null," Empate " );
        }
        else
        {
            JOptionPane.showMessageDialog(null," Gana Jugador 2 " + nombre2.getNombre()  );
            puntuaje.combinacion2();
        }
    }
}