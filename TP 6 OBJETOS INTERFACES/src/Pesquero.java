public class Pesquero implements Barcos {

    private String nombre;
    private int cantPescadores;

    private double potencia;


    public Pesquero() { ///Constructores
    }

    public Pesquero(String nombre, int cantPescadores, double potencia) {
        this.nombre = nombre;
        this.cantPescadores = cantPescadores;
        this.potencia = potencia;
    }



    ///GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPescadores() {
        return cantPescadores;
    }

    public void setCantPescadores(int cantPescadores) {
        this.cantPescadores = cantPescadores;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public void msgeSocorro() {
        System.out.println("El msge de socorro ha sido activado en el Barco de pesca");
    }

    @Override
    public void alarma() {

        System.out.println("La alarma ha sido activada en el Barco de pesca");

    }
}
