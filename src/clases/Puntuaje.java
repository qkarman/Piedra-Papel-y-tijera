package clases;
import javax.swing.JOptionPane;

public class Puntuaje
{
    protected int puntos, puntuajeActual;

    public Puntuaje()
    {
        this.puntos = 0;
    }

    public void combinacion(LogicaJuego.resultado res)
    {
        if( res == LogicaJuego.resultado.GANAS)
        {
            puntuajeActual++;
            JOptionPane.showMessageDialog(null,"Ganaste un punto " + puntuajeActual);
        }
        else
        {
            JOptionPane.showMessageDialog(null," Resultado " + puntuajeActual);
        }

    }

    public void mostrarPuntuajeMaximo()
    {
        JOptionPane.showMessageDialog(null, " Puntuaje total principal : " + puntuajeActual );
    }
}
