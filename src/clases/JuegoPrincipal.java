package clases;

import javax.swing.JOptionPane;

public class JuegoPrincipal
{
    private Puntuaje puntaje;

    public JuegoPrincipal(Puntuaje puntaje)
    {
        this.puntaje = puntaje;
    }

    public static void main(String[] args)
    {
        JuegoPrincipal invocar = new JuegoPrincipal(new Puntuaje());
        invocar.juego();
    }

    //Creamos el metodo donde vamos a desarrollar todo el comportamiento del juego
    public void juego()
    {

        String eleccion = JOptionPane.showInputDialog(null, """
                M E N U
                Piedra
                Papel
                Tijera
                Ajustes
                Escribe tu jugada:
                """);

        LogicaJuego logica = new LogicaJuego(puntaje);

        switch(eleccion)
        {
            case "piedra" -> logica.controlPlayer("piedra");
            case "papel" -> logica.controlPlayer("papel");
            case "tijera" -> logica.controlPlayer("tijera");
            case "ajustes" -> JOptionPane.showInputDialog(null,"Ajustes aun no disponibles");
            default -> JOptionPane.showMessageDialog(null,"Opcion incorrecta");
        }
    }
}
