package clases;
import javax.swing.JOptionPane;

public class LogicaJuego
{
    private Puntuaje puntaje;

    public LogicaJuego(Puntuaje puntaje)
    {
        this.puntaje = puntaje;
    }

    //*Creamos la clase donde el usuario va a gestionar el control del usuario
    public void controlPlayer(String jugadorHumano)
    {
        //Creamos una instancias para invocar el nombre de los jugadores
        NombrePlayer nombre1 = new NombrePlayer();

        //Asignamos los nombres de los jugadores utilizando los setters
        nombre1.setNombre(" Qkarman " );

        //Convertimos la jugada a enum
        logica jugador1 = logica.valueOf(jugadorHumano.toLowerCase());
        logica jugador2 = logica.values()[(int)(Math.random() * 3)];

        resultado res = jugador1.vs(jugador2);

        JOptionPane.showMessageDialog(null,nombre1.getNombre() + "tu elegiste: " + jugador1 +
                "\n La maquina eligio: " + jugador2 +
                "\n Resultado: " + res);

        puntaje.combinacion(res);
        puntaje.mostrarPuntuajeMaximo();
    }

    //*Creamos una clase de tipo Enum para gestionar la logica del juego
    public enum logica
    {
        piedra, papel, tijera;

        public resultado vs(logica otra)
        {
            if(this == otra) return resultado.EMPATE;

            return switch(this)
            {
                case piedra -> (otra == tijera) ? resultado.GANAS : resultado.PIERDES;
                case papel -> (otra == piedra) ? resultado.GANAS : resultado.PIERDES;
                case tijera-> (otra == papel) ? resultado.GANAS : resultado.PIERDES;
            };
        }
    }

    //*Creamos otra clase Enum para los valores de ganar perder y empate
    public enum resultado
    {
        GANAS, PIERDES, EMPATE;
    }
}