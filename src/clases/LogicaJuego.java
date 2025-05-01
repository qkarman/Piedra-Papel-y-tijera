package clases;
import javax.swing.JOptionPane;

public class LogicaJuego extends JuegoPrincipal
{
    public static void main(String[] args)
    {
        LogicaJuego invocar = new LogicaJuego();

        // Ejemplo: piedra vs tijera
        logica jugador1 = logica.PIEDRA;
        logica jugador2 = logica.PAPEL;

        // Usar el método vs() para obtener el resultado
        resultado res = jugador1.vs(jugador2);

        JOptionPane.showMessageDialog(null, "Resultado: " + res);

        invocar.combinacion();
    }

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

    }

    public enum logica
    {
        PIEDRA, PAPEL, TIJERA;

        public resultado vs(logica otra)
        {
            if(this == otra) return resultado.EMPATE;

            return switch(this)
            {
                case PIEDRA -> (otra == TIJERA) ? resultado.GANA : resultado.PIERDE;
                case PAPEL -> (otra == PIEDRA) ? resultado.GANA : resultado.PIERDE;
                case TIJERA -> (otra == PAPEL) ? resultado.GANA : resultado.PIERDE;
            };
        }
    }

    public enum resultado
    {
        GANA, PIERDE, EMPATE;
    }
}