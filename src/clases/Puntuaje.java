package clases;
import javax.swing.JOptionPane;

public class Puntuaje extends JuegoPrincipal
{
    protected int puntuajePlayerUno = 0, puntuajePlayeDos = 0;
    static int puntuajeMaximo = 0, puntuajeActual = 0;
    static int puntuajeMaximo2 = 0, puntuajeActual2 = 0;

    @Override
    public void combinacion()
    {
        if( puntuajeActual < 3 )
        {
            //Creamos una condicion que si jugador uno llega a ganar se le suma un punto
            for( int i = 0; i <= puntuajeMaximo; i++ )
            {
                puntuajeActual++; //Incrementa el puntuaje en cada interacion
                JOptionPane.showMessageDialog(null," Puntuaje actual jugador 1 : " + puntuajeActual );
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null," Ganaste " );

        }

    }

    public void mostrarPuntuajeMaximo()
    {
        JOptionPane.showMessageDialog(null, " Puntuaje total jugador 1 principal : " + puntuajeActual );
    }

    public void combinacion2()
    {
        //Creamos una condicion que si jugador uno llega a ganar se le suma un punto
        for( int i = 0; i <= puntuajeMaximo2; i++ )
        {
            puntuajeActual2++; //Incrementa el puntuaje en cada interacion
            JOptionPane.showMessageDialog(null," Puntuaje actual jugador 2 : " + puntuajeActual2 );
        }
    }
}
