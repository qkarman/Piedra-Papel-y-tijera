package clases;

public class NombrePlayer
{
    //Vamos a implementar un metodo el cual podamos configurar la forma en que se llamaran los jugadores 1 y dos
    private String nombre;

    //Con setter asignamos el nombre del jugador 1
    public void setNombre( String nombre )
    {
        this.nombre = nombre;
    }

    //Con el getter obtenemos el nombre del jugador 1
    public String getNombre()
    {
        return nombre;
    }
}